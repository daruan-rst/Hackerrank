SELECT
  IF(
    ABS(t.A - t.B) > t.B + t.A OR
    ABS(t.A - t.C) > t.C + t.A OR
    ABS(t.B - t.C) > t.C + t.B,
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
