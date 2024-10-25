-- 코드를 입력하세요
-- USER_ID, GENDER, AGE, JOINED
-- GENDER 컬럼: 비어있거나 0 또는 1의 값을 가지며 0인 경우 남자를, 1인 경우는 여자
-- 1. 나이 정보가 없는 회원이 몇 명인지 출력
-- 2. 컬럼명은 USERS로 지정
# SELECT * FROM USER_INFO;

SELECT COUNT(USER_ID) AS USERS
FROM USER_INFO
WHERE AGE IS NULL;