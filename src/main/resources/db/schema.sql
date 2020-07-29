drop table if exists "USER";
CREATE TABLE "USER" (
  id            NUMBER        NOT NULL,
  age           NUMBER        NOT NULL,
  name          VARCHAR(1000) NOT NULL,
  CONSTRAINT PK_USER_ID PRIMARY KEY (id)
);