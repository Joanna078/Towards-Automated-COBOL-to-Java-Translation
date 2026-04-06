IDENTIFICATION DIVISION.
PROGRAM-ID. Main.
DATA DIVISION.
WORKING-STORAGE       SECTION.
01  N  PIC 9(01).
01  A  PIC X(01) VALUE SPACE.
01  B  PIC X(01) VALUE SPACE.
01  C  PIC X(02) VALUE SPACE.
01  A-9  PIC 9(01).
01  B-9  PIC 9(01).
01  C-9  PIC 9(02).
01  D-9  PIC 9(01).
procedure division.
ACCEPT N.
if N = 1
then
 display 'Hello World'
else
 if N = '2'
 then
  ACCEPT A
  ACCEPT B
  MOVE A to A-9 
  MOVE B to B-9
  compute C-9 = A-9 + B-9
  if C-9 > 9
  then
  display C-9
  else
  MOVE C-9 to D-9
  display D-9
  end-if
  
 else
  display "ERR!"
 end-if
end-if.
stop run.

