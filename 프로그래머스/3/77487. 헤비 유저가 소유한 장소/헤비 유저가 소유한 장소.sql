-- 코드를 입력하세요
SELECT ID, NAME, A.HOST_ID
FROM PLACES A INNER JOIN
(
    SELECT HOST_ID FROM PLACES GROUP BY HOST_ID HAVING COUNT(*) >= 2
) B ON A.HOST_ID = B.HOST_ID
ORDER BY ID ASC;