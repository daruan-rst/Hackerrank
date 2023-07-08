SELECT h.hacker_id, h.name, SUM(MAX_SCORE.score) AS total_score
FROM Hackers h
INNER JOIN
(
	SELECT s.hacker_id, MAX(s.score) AS score
	FROM Submissions s
	GROUP BY s.challenge_id , s.hacker_id
	HAVING score > 0
) AS MAX_SCORE
ON h.hacker_id = MAX_SCORE.hacker_id
GROUP BY h.hacker_id, h.name
ORDER BY total_score DESC, h.hacker_id ASC