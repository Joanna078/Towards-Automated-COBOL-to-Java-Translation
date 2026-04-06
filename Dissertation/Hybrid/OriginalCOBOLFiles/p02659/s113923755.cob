id division.
  program-id. abc169c.

data division.
  working-storage section.
  77 ab pic x(21).
  77 a pic 9(16).
  77 b pic 9v99 usage packed-decimal.
  77 ans pic z(16)9.

procedure division.
  accept ab.
  unstring ab delimited by space into a b.
  compute ans = a * b.
  display ans.
  stop run.
