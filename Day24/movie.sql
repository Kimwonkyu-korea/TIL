다음과 같은 구조의 2개의 테이블에 2개의 레코드(Row)를 저장하는 SQL을 작성하세요
 테이블명 : Movie
 영화번호 - 기본키
 배우번호 - 외래키
 영화제목
 장르명
 재생시간

CREATE TABLE Movie(
    MOVIENUM NUMBER(10) CONSTRAINT PK_MOVIE_NUM PRIMARY KEY,
    ACTORNUM NUMBER(10),
    CONSTRAINT FK_ACTOR_NUM FOREIGN KEY(ACTORNUM)
    REFERENCES Actor(ACTORNUM),
    MOVIENAME VARCHAR2(20),
    GENRE VARCHAR2(20),
    PLAYTIME NUMBER(10)
);

INSERT INTO Movie(MOVIENUM, ACTORNUM, MOVIENAME, GENRE, PLAYTIME)
VALUES(1, 10, '신세계', '범죄', 134);

INSERT INTO Movie(MOVIENUM, ACTORNUM, MOVIENAME, GENRE, PLAYTIME)
VALUES(2, 11, '도둑들', '액션', 135);
 


 테이블명 : Actor
 배우번호 - 기본키
 이름
 생년월일
 성별 
 
CREATE TABLE Actor(
    ACTORNUM NUMBER(10) CONSTRAINT PK_Actor_NUM PRIMARY KEY,
    ACTORNAME VARCHAR2(20),
    BIRTHDATE DATE,
    GENDER VARCHAR2(20)
);
 
INSERT INTO Actor(ACTORNUM, ACTORNAME,BIRTHDATE, GENDER)
VALUES(10, '최민식', '60/10/11', '남');

INSERT INTO Actor(ACTORNUM, ACTORNAME,BIRTHDATE, GENDER)
VALUES(11, '전지현', '80/03/12', '여');


 
 