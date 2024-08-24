-- 코드를 작성해주세요
SELECT SUM(SCORE) AS SCORE, E.EMP_NO, EMP_NAME, POSITION, EMAIL
FROM HR_EMPLOYEES E
JOIN HR_GRADE G ON E.EMP_NO = G.EMP_NO
GROUP BY 2
ORDER BY 1 DESC,2
LIMIT 1