SELECT w.id, wp.age, w.coins_needed, w.power
FROM Wands w
INNER JOIN Wands_Property wp
ON w.code = wp.code
WHERE
wp.is_evil = 0
ORDER BY w.power DESC,
w.coins_needed ASC
