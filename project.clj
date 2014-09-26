(defproject gardentest "0.1.0-SNAPSHOT"
  :description "Something that does something."

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2342"]
                 [garden "1.2.1"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :cljsbuild
  {:builds [{:id           "dev"
             :source-paths ["src/cljs"]
             :compiler     {:output-to     "app/gardentest.js"
                            :output-dir    "app/out"
                            :optimizations :none
                            :source-map    true}}
            {:id           "production"
             :source-paths ["src/cljs"]
             :compiler     {:output-to        "dist/app.js"
                            :optimizations    :advanced
                            :pretty-print     false
                            :closure-warnings {:externs-validation :off
                                               :non-standard-jsdoc :off}}}]})
