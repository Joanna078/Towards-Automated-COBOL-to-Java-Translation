Identification Division.
Program-ID. caddi2018a.

Data Division.
Working-Storage Section.

77 n pic 9(4).
77 c pic 9.

Procedure Division.

accept n.
inspect n tallying c for all '2'.
display c.
stop run.
