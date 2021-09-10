-- defaultdb.product_categories definition

CREATE TABLE "product_categories" (
  "category_id" int NOT NULL AUTO_INCREMENT,
  "category_name" varchar(100) NOT NULL,
  PRIMARY KEY ("category_id"),
  UNIQUE KEY "product_categories_category_id_IDX" ("category_id")
);
