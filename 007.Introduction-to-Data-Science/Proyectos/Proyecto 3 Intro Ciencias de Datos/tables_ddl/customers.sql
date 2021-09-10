-- defaultdb.customers definition

CREATE TABLE "customers" (
  "customer_id" int NOT NULL AUTO_INCREMENT,
  "customer_name" varchar(100) NOT NULL,
  "customer_lastname" varchar(100) NOT NULL,
  "customer_phone" varchar(100) DEFAULT NULL,
  "customer_email" varchar(100) DEFAULT NULL,
  PRIMARY KEY ("customer_id")
);
