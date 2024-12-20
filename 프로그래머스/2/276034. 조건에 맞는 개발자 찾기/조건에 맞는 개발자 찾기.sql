-- 코드를 작성해주세요
# SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
# FROM DEVELOPERS
# WHERE ID IN (SELECT DISTINCT ID
#              FROM DEVELOPERS D
#              INNER JOIN SKILLCODES S
#              ON D.SKILL_CODE & S.CODE = S.CODE
#              WHERE S.NAME = 'Python' OR S.NAME = 'C#')
# ORDER BY ID ASC;

SELECT DISTINCT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS D INNER JOIN SKILLCODES S ON
D.SKILL_CODE & S.CODE = S.CODE
WHERE S.NAME = 'Python' OR S.NAME = 'C#'
ORDER BY ID ASC;