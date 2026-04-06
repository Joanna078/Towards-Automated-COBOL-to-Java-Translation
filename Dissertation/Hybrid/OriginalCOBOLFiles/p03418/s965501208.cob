IDENTIFICATION DIVISION.
program-id. kyopuro.

data division.
working-storage section.
01 in-str pic x(13).
01 n pic 9(6).
01 k pic 9(5).
01 res pic 9(11).
01 t pic 9(5).
01 view-res pic z(18)9.
01 q pic 9(5).
01 r pic 9(5).
01 i pic 9(6).

procedure division.
main.
    accept in-str.
    unstring in-str delimited by all SPACE
    into n k.
    
    if k = 0
    then
        compute view-res = n * n
    else
    compute i = k + 1
    compute t = n - k
        perform t times
            divide n by i giving q remainder r
            compute res = res + (i - k) * q + function max(r - k + 1, 0)
            add 1 to i
        end-perform
        move res to view-res
    end-if.
    
    display view-res.
    stop run.
