-- defaultdb.stores definition

CREATE TABLE "stores" (
  "store_id" int NOT NULL AUTO_INCREMENT,
  "store_name" varchar(100) NOT NULL,
  "store_location_lat" varchar(100) NOT NULL,
  "store_location_long" varchar(100) DEFAULT NULL,
  PRIMARY KEY ("store_id"),
  UNIQUE KEY "stores_store_id_IDX" ("store_id")
);
