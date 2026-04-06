       identification division.
       program-id.a.
       data division.
       working-storage section.
       1 inp pic x(9).
       1 a pic 99.
       1 b pic 99.
       1 d pic 9.
       1 i pic 9.
       procedure division.
       main.
       accept inp.
       perform varying i from 1 by 1 until inp(i:1)=SPACE
       end-perform.
       add -1 to i.
       move inp(1:i) to a.
       add 2 to i.
       move inp(i:2) to b.
       if a > b then
        add -1 to a
       end-if
       if a < 10 then
        move a to d
        display d
       else
        display a
       end-if.
       stop run.