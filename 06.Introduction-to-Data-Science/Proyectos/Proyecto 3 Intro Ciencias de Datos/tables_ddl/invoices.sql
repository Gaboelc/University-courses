-- defaultdb.invoices definition

CREATE TABLE "invoices" (
  "invoice_id" int NOT NULL AUTO_INCREMENT,
  "customer_id" int NOT NULL,
  "store_id" int NOT NULL,
  "invoice_date" datetime DEFAULT NULL,
  PRIMARY KEY ("invoice_id"),
  KEY "invoices_FK" ("customer_id"),
  KEY "invoices_FK_1" ("store_id"),
  CONSTRAINT "invoices_FK" FOREIGN KEY ("customer_id") REFERENCES "customers" ("customer_id") ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT "invoices_FK_1" FOREIGN KEY ("store_id") REFERENCES "stores" ("store_id") ON DELETE RESTRICT ON UPDATE RESTRICT
);
