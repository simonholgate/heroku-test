(defproject shouter "0.0.1"
  :description "Shouter app"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [postgresql/postgresql "8.4-702.jdbc4"]
                 [org.clojure/java.jdbc "0.1.1"]
                 [ring/ring-jetty-adapter "0.3.10"]
                 [compojure "0.6.4"]
                 [hiccup "0.3.6"]]
  :repositories {"sonatype-oss-public"
                 "https://oss.sonatype.org/content/groups/public/"})