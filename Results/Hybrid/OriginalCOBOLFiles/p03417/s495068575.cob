IDENTIFICATION DIVISION.
program-id. kyopuro.

data division.
working-storage section.
01 in-str pic x(22).
01 n pic 9(10).
01 m pic 9(10).
01 res pic 9(19).
01 t pic 9(5).
01 view-res pic z(18)9.

procedure division.
main.
    accept in-str.
    unstring in-str delimited by all SPACE
    into n m.
    
    if n = 1 and m = 1
    then
        move 1 to view-res
    else if n = 1 or m = 1
    then
        compute view-res = function max(n, m) - 2
    else
        compute view-res = (n - 2) * (m - 2)
    end-if
    end-if.
    
    display view-res.
    stop run.
