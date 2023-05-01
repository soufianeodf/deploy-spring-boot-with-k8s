CREATE TABLE "greeting"
(
    "id"                      serial,
    "message"                   varchar  not null,
    PRIMARY KEY ("id")
);

INSERT INTO "greeting" ("message") VALUES ('Hello World!');