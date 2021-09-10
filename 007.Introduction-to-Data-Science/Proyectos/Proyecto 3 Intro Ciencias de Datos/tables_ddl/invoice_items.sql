-- defaultdb.invoice_items definition

CREATE TABLE "invoice_items" (
  "invoice_line_id" int NOT NULL AUTO_INCREMENT,
  "invoice_id" int NOT NULL,
  "item_id" int NOT NULL,
  "quantity" int NOT NULL,
  PRIMARY KEY ("invoice_line_id"),
  KEY "invoice_items_FK" ("invoice_id"),
  KEY "invoice_items_FK_2" ("item_id"),
  CONSTRAINT "invoice_items_FK" FOREIGN KEY ("invoice_id") REFERENCES "invoices" ("invoice_id") ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT "invoice_items_FK_1" FOREIGN KEY ("item_id") REFERENCES "product_items" ("item_id") ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT "invoice_items_FK_2" FOREIGN KEY ("item_id") REFERENCES "product_items" ("item_id") ON DELETE RESTRICT ON UPDATE RESTRICT
);
