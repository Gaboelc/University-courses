-- defaultdb.product_items definition

CREATE TABLE "product_items" (
  "item_id" int NOT NULL AUTO_INCREMENT,
  "category_id" int NOT NULL,
  "product_name" varchar(100) NOT NULL,
  "product_price" float NOT NULL,
  PRIMARY KEY ("item_id"),
  UNIQUE KEY "product_items_item_id_IDX" ("item_id"),
  KEY "product_items_FK" ("category_id"),
  CONSTRAINT "product_items_FK" FOREIGN KEY ("category_id") REFERENCES "product_categories" ("category_id") ON DELETE RESTRICT ON UPDATE RESTRICT
);
