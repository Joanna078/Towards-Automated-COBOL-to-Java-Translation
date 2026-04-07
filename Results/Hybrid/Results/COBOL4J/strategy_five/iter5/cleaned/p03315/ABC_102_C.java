import java.io.UnsupportedEncodingException;
import jp.osscons.opensourcecobol.libcobj.*;
import jp.osscons.opensourcecobol.libcobj.common.*;
import jp.osscons.opensourcecobol.libcobj.data.*;
import jp.osscons.opensourcecobol.libcobj.exceptions.*;
import jp.osscons.opensourcecobol.libcobj.termio.*;
import jp.osscons.opensourcecobol.libcobj.call.*;
import jp.osscons.opensourcecobol.libcobj.file.*;
import jp.osscons.opensourcecobol.libcobj.ui.*;
import java.util.Optional;

public class ABC_102_C implements CobolRunnable {

  private boolean initialized = false;
  private CobolModule module;
  private int entry;

  private CobolRunnable cob_unifunc;

  @Override
  public int run(CobolDataStorage... argStorages) {
    return ABC_102_C_(0, argStorages);
  }

  @Override
  public void cancel() {
    ABC_102_C_(-1);
  }

  @Override
  public boolean isActive() {
    return false;
  }

  public CobolResultSet execute () {
    int returnCode = run_module(0);
    return new CobolResultSet(returnCode);
  }

  public int ABC_102_C_ (int entry, CobolDataStorage ...argStorages) {
    this.entry = entry;
    return this.run_module(entry);
  }

  int run_module (int entry) {
    this.module = new CobolModule(null, null, null, null, 0, '.', '$', ',', 1, 1, 1, 0, null );

    /* Start of function code */

    /* CANCEL callback handling */
    if (entry < 0) {
    	if (!this.initialized) {
    		CobolDecimal.cobInitNumeric();
    		return 0;
    	}
    	h_SYSIN.close (0, null);
    	d0.clear();
    	d0.setScale(0);
    	d1.clear();
    	d1.setScale(0);
    	this.initialized = false;
    	return 0;
    }

    /* Push module stack */
    CobolModule.push (module);
    CobolResolve.pushCallStackList ("ABC_102_C");

    /* Initialize program */
    if (!this.initialized) {
      module.setProgramId("ABC_102_C");

      /* Initialize decimal numbers */
      d0.decimalInit();
      d1.decimalInit();

      b_RETURN_CODE.set((int)0);
      b_i.setSwpU64Binary (1);
      b_len.setSwpU64Binary (1);
      b_ans.fillBytes(' ', 2);
      f_ZS.moveFrom (CobolConstant.zero);
      b_DUMMY.setByte(' ');

      this.initialized = true;
    }
    /* PROCEDURE DIVISION */
    try{
      /* Entry dispatch */
      execEntry(l_ABC_102_C);

    } catch(CobolStopRunException e) {
      CobolStopRunException.stopRun();
      System.exit(e.getReturnCode());
    }
    /* Pop module stack */
    CobolResolve.popCallStackList();
    CobolModule.pop();

    /* Program return */
    return b_RETURN_CODE.intValue();
  }
  public CobolControl[] contList = {
    new CobolControl(0, CobolControl.LabelType.label) {
      public Optional<CobolControl> run() throws CobolRuntimeException, CobolStopRunException {

        return Optional.of(contList[l_ABC_102_C]);
      }
    },
    /* Entry ABC_102_C */
    new CobolControl(l_ABC_102_C, CobolControl.LabelType.label) {
      public Optional<CobolControl> run() throws CobolRuntimeException, CobolStopRunException {

        return Optional.of(contList[l_MAIN]);
      }
    },
    /* MAIN SECTION */
    new CobolControl(l_MAIN, CobolControl.LabelType.section) {
      public Optional<CobolControl> run() throws CobolRuntimeException, CobolStopRunException {

        return Optional.of(contList[l_MAIN_SECTION__DEFAULT_PARAGRAPH]);
      }
    },
    /* MAIN_SECTION__DEFAULT_PARAGRAPH */
    new CobolControl(l_MAIN_SECTION__DEFAULT_PARAGRAPH, CobolControl.LabelType.label) {
      public Optional<CobolControl> run() throws CobolRuntimeException, CobolStopRunException {
        /* /content/temp_cobol/ABC_102_C_fixed.cob:39: ACCEPT */
        {
          CobolTerminal.accept (b_ans);
        }
        /* /content/temp_cobol/ABC_102_C_fixed.cob:41: MOVE */
        {
          f_ZS.moveFrom (CobolConstant.zero);
        }
        /* /content/temp_cobol/ABC_102_C_fixed.cob:43: PERFORM */
        for (int i = 1; i <= 4; i++)
        {
          if (b_ans.getByte(i - 1) == '+') {
            f_ZS.add (CobolConstant.one, 1);
          } else {
            f_ZS.sub (CobolConstant.one, 1);
          }
        }
        /* /content/temp_cobol/ABC_102_C_fixed.cob:47: MOVE */
        {
          f_ZS.moveFrom (b_ans);
        }
        /* /content/temp_cobol/ABC_102_C_fixed.cob:49: PERFORM */
        /* PERFORM UNANS */
        CobolControl.perform(contList, l_UNANS).run();
        /* /content/temp_cobol/ABC_102_C_fixed.cob:51: DISPLAY */
        {
          CobolTerminal.display (0, 1, 1, CobolFieldFactory.makeCobolField(CobolIntrinsic.funcStoredCharLength (b_ans).getInt(), b_ans.getSubDataStorage(0), a_2_Alphanumeric));
        }
        /* /content/temp_cobol/ABC_102_C_fixed.cob:52: STOP */
        {
          CobolStopRunException.throwException (b_RETURN_CODE.intValue());
        }

        return Optional.of(contList[l_UNANS]);
      }
    },
    /* UNANS SECTION */
    new CobolControl(l_UNANS, CobolControl.LabelType.section) {
      public Optional<CobolControl> run() throws CobolRuntimeException, CobolStopRunException {

        return Optional.of(contList[l_UNANS_SECTION__DEFAULT_PARAGRAPH]);
      }
    },
    /* UNANS_SECTION__DEFAULT_PARAGRAPH */
    new CobolControl(l_UNANS_SECTION__DEFAULT_PARAGRAPH, CobolControl.LabelType.label) {
      public Optional<CobolControl> run() throws CobolRuntimeException, CobolStopRunException {
        /* /content/temp_cobol/ABC_102_C_fixed.cob:55: UNSTRING */
        {
          CobolString.unstringInit (f_ZS, 0, 1);
          CobolString.unstringDelimited (CobolConstant.space, 1);
          CobolString.unstringInto (f_DUMMY, 0, 1);
          CobolString.unstringInto (f_ans, 0, 1);
          CobolString.unstringFinish ();
        }

        return Optional.of(CobolControl.pure());
      }
    },
    /* Default Error Handler */
    new CobolControl(l_Default_Error_Handler, CobolControl.LabelType.label) {
      public Optional<CobolControl> run() throws CobolRuntimeException, CobolStopRunException {

        if ((CobolFile.errorFile.flag_select_features & CobolFile.COB_SELECT_FILE_STATUS) == 0) {
        	CobolFile.defaultErrorHandle ();
        	CobolStopRunException.stopRunAndThrow (1);
        }

        return Optional.of(CobolControl.pure());
      }
    },
    CobolControl.pure()
  };
  public void execEntry(int start) throws CobolRuntimeException, CobolStopRunException {
    Optional<CobolControl> nextLabel = Optional.of(contList[start]);
    while(nextLabel.isPresent()) {
      CobolControl section = nextLabel.get();
      nextLabel = section.run();
    }
  }

  public static void main(String[] args)
  {
    CobolUtil.cob_init(args, false);
    CobolDecimal.cobInitNumeric();
    new ABC_102_C().ABC_102_C_(0);
    CobolStopRunException.stopRun();
  }

  public ABC_102_C()
  {
    init();
  }

  public void init() 
  {
    /* Decimal structures */

    d0 = new CobolDecimal();
    d1 = new CobolDecimal();

    /* Data storage */

    cob_unifunc = null;

    /* PROGRAM-ID : ABC_102_C */
    b_RETURN_CODE = new CobolDataStorage(4);	/* RETURN-CODE */
    b_i = new CobolDataStorage(1);	/* i */
    b_len = new CobolDataStorage(1);	/* len */
    b_ans = new CobolDataStorage(2);	/* ans */
    b_ZS = new CobolDataStorage(2);	/* ZS */
    b_DUMMY = new CobolDataStorage(1);	/* DUMMY */

    /* End of data storage */

    initAttr();

    /* Fields */

    /* PROGRAM-ID : ABC_102_C */
    f_i	= CobolFieldFactory.makeCobolField(1, b_i, a_3_NumericDisplay_Digits1_Scale0);	/* i */
    f_len	= CobolFieldFactory.makeCobolField(1, b_len, a_3_NumericDisplay_Digits1_Scale0);	/* len */
    f_ans	= CobolFieldFactory.makeCobolField(2, b_ans, a_2_Alphanumeric);	/* ans */
    f_ZS	= CobolFieldFactory.makeCobolField(2, b_ZS, a_3_NumericDisplay_Digits2_Scale0);	/* ZS */
    f_DUMMY	= CobolFieldFactory.makeCobolField(1, b_DUMMY, a_2_Alphanumeric);	/* DUMMY */

    /* End of fields */

    /* Constants */

    c_1_1	= CobolFieldFactory.makeCobolField(1, "1", a_3_NumericDisplay_Digits1_Scale0);

  }

  private void initAttr() {
    /* Attributes */

    a_1_NumericEdited_Digits16_Scale0 = new CobolFieldAttribute(
      CobolFieldAttribute.COB_TYPE_NUMERIC_EDITED,
      /* digits= */ 16,
      /* scale= */ 0,
      CobolFieldAttribute.COB_FLAG_NOT_SPECIFIED,
      /* pic= */ "Z\017\000\000\0009\001\000\000\000");
    a_2_Alphanumeric = new CobolFieldAttribute(
      CobolFieldAttribute.COB_TYPE_ALPHANUMERIC,
      /* digits= */ 0,
      /* scale= */ 0,
      CobolFieldAttribute.COB_FLAG_NOT_SPECIFIED,
      /* pic= */ null);
    a_3_NumericDisplay_Digits1_Scale0 = new CobolFieldAttribute(
      CobolFieldAttribute.COB_TYPE_NUMERIC_DISPLAY,
      /* digits= */ 1,
      /* scale= */ 0,
      CobolFieldAttribute.COB_FLAG_NOT_SPECIFIED,
      /* pic= */ null);
    a_3_NumericDisplay_Digits2_Scale0 = new CobolFieldAttribute(
      CobolFieldAttribute.COB_TYPE_NUMERIC_DISPLAY,
      /* digits= */ 2,
      /* scale= */ 0,
      CobolFieldAttribute.COB_FLAG_NOT_SPECIFIED,
      /* pic= */ null);
  }

  /* Decimal structures */

  private CobolDecimal d0;
  private CobolDecimal d1;

  /* Data storage */

  /* PROGRAM-ID : ABC_102_C */
  public CobolDataStorage b_RETURN_CODE;	/* RETURN-CODE */
  private CobolDataStorage b_i;	/* i */
  private CobolDataStorage b_len;	/* len */
  private CobolDataStorage b_ans;	/* ans */
  private CobolDataStorage b_ZS;	/* ZS */
  private CobolDataStorage b_DUMMY;	/* DUMMY */

  /* End of data storage */

  /* Fields */

  /* PROGRAM-ID : ABC_102_C */
  private AbstractCobolField f_i;	/* i */
  private AbstractCobolField f_len;	/* len */
  private AbstractCobolField f_ans;	/* ans */
  private AbstractCobolField f_ZS;	/* ZS */
  private AbstractCobolField f_DUMMY;	/* DUMMY */

  /* End of fields */

  private static AbstractCobolField f_native;

  /* Constants */

  private AbstractCobolField c_1_1;

  /* Attributes */

  private CobolFieldAttribute a_1_NumericEdited_Digits16_Scale0;
  private CobolFieldAttribute a_2_Alphanumeric;
  private CobolFieldAttribute a_3_NumericDisplay_Digits1_Scale0;
  private CobolFieldAttribute a_3_NumericDisplay_Digits2_Scale0;

  /* String literals */
  public static final byte[] str_0_0000001 = CobolUtil.stringToBytes("0000001");
  /* File SYSIN */
  private CobolFile		h_SYSIN = null;
  private byte[]	h_SYSIN_status = new byte[4];

  /* Sections and Labels */
  private final static int l_ABC_102_C = 1;
  private final static int l_MAIN = 2;
  private final static int l_MAIN_SECTION__DEFAULT_PARAGRAPH = 3;
  private final static int l_UNANS = 4;
  private final static int l_UNANS_SECTION__DEFAULT_PARAGRAPH = 5;
  private final static int l_Default_Error_Handler = 6;

}