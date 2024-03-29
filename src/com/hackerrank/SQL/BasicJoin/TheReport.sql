SELECT IF(g.Grade < 8, NULL, s.Name) AS Name, g.Grade, s.Marks
FROM Students AS s
JOIN Grades AS g
ON s.Marks BETWEEN g.Min_Mark AND g.Max_Mark
WHERE s.Marks BETWEEN g.Min_Mark AND g.Max_Mark
ORDER BY g.Grade DESC, Name ASC;

