SELECT
  IF(
    ABS(t.A + t.B) <= t.C OR
    ABS(t.A + t.C) <= t.B OR
    ABS(t.B + t.C) <= t.A,
    "Not A Triangle",
    IF(
      t.A = t.B AND t.C = t.B AND t.A = t.C,
      "Equilateral",
      IF(
        t.A != t.B AND t.C != t.B AND t.A != t.C,
        "Scalene",
        "Isosceles"
      )
    )
  )
FROM
  TRIANGLES t;
