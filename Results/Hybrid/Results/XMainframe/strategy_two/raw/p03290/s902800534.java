```cobol
IDENTIFICATION DIVISION.
PROGRAM-ID. DECIMAL-TO-BINARY.

DATA DIVISION.
WORKING-STORAGE SECTION.
01  DECIMAL-NUMBER PIC 9(4).
01  BINARY-STRING  PIC X(16) VALUE SPACES.
01  HEX-LUT        PIC X(16) VALUE '0123456789ABCDEF'.
01  BIN-LUT        PIC X(16) VALUE '000000010010001101000101011001111000100110101011110011111'.

PROCEDURE DIVISION.
    DISPLAY "Enter a decimal number (0-65535): ".
    ACCEPT DECIMAL-NUMBER.

    IF DECIMAL-NUMBER < 0 OR DECIMAL-NUMBER > 65535
        DISPLAY "Number out of range."
        STOP RUN
    END-IF.

    PERFORM VARYING DECIMAL-NUMBER BY -1 UNTIL DECIMAL-NUMBER = 0
        MOVE FUNCTION MOD(DECIMAL-NUMBER, 16) TO DECIMAL-NUMBER
        STRING HEX-LUT(DECIMAL-NUMBER:1) DELIMITED BY SIZE
               INTO BINARY-STRING
        END-STRING
    END-PERFORM.

    REVERSE BINARY-STRING.
    DISPLAY "Binary representation: " BINARY-STRING.

    STOP RUN.
```

This COBOL program prompts the user to enter a decimal number, checks if it is within the valid range (0-65535), and then converts it to its binary representation using lookup tables. The binary string is constructed by repeatedly taking the remainder of the decimal number when divided by 16, using this remainder as an index to find the corresponding hexadecimal character, and appending it to the binary string. After constructing the binary string, it is reversed to get the correct binary representation, which is then displayed.