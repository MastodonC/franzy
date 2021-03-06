(defproject mastodonc/franzy "0.0.4-SNAPSHOT"
            :description "Clojure Kafka client with support for Kafka producer, consumer, rebalancing, administration, and validation."
            :url "https://github.com/mastodonc/franzy"
            :author "ymilky and others, but see README"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :repositories {"snapshots" {:url           "https://clojars.org/repo"
                                        :creds :gpg}
                           "releases"  {:url           "https://clojars.org/repo"
                                        :creds :gpg}}
            :dependencies [[org.clojure/clojure "1.8.0"]
                           [prismatic/schema "1.0.5"]
                           [org.apache.kafka/kafka-clients "0.10.0.1"]
                           [lbradstreet/franzy-common "0.0.2"]]
            :plugins [[lein-codox "0.9.4"]]
            :codox {:metadata    {:doc/format :markdown}
                    :doc-paths   ["README.md"]
                    :output-path "doc/api"}
            :profiles {:dev
                                         {:dependencies [[midje "1.7.0"]
                                                         [com.taoensso/timbre "4.3.1"]]
                                          :plugins      [[lein-midje "3.2"]
                                                         [lein-set-version "0.4.1"]
                                                         [lein-update-dependency "0.1.2"]
                                                         [lein-pprint "1.1.1"]]}
                       :reflection-check {:global-vars {*warn-on-reflection* true
                                                        *assert*             false
                                                        *unchecked-math*     :warn-on-boxed}}})
