(defproject buddy "2":description "Security library for Clojure"
:url "https://github.com/funcool/buddy":license :name "Apache 2.0"
:url "http://www.apache.org/licenses/LICENSE:dependencies [[buddy/buddy-core "3" 
:exclusions [org.clojure/clojure]]
[buddy/buddy-auth "3" 
:exclusions [org.clojure/clojure]]
[buddy/buddy-hashers 
"2" :exclusions [org.clojure/clojure]]
[buddy/buddy-sign 
 "4" :exclusions [org.clojure/clojure]]] :plugins [[lein-ancient "0.4"]] :javac-options ["-target" "6" "-source""6""-Xlint:-options"])
