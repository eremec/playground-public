(ns playground.core
  (:require
   [reagent.core :as reagent :refer [atom]]
   [reagent.dom :as rdom]))

(defn page []
  [:div "Hello there"])

(defn init! []
  (rdom/render [page] (.getElementById js/document "app")))

(init!)
