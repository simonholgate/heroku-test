(ns test
  (require '[clojure.java.jdbc :as sql]))

(def db {:classname "org.postgresql.Driver"
         :subprotocol "postgresql"
         :subname "//localhost:5432/shouter"
         :user "simonh" 
         :password "g96gLi7"})

(sql/with-connection db (sql/create-table :testing [:data :text]))


(sql/with-connection db
  (sql/insert-record :testing {:data "Hello World"}))

(sql/with-connection db
  (sql/with-query-results results
           ["select * from testing"]
           (into [] results)))

(sql/with-connection db
         (sql/drop-table :testing))