(ns playground.snippets)

;; --------------------------------------------------------------------
;; HTML structure
[:div "Any text"]

[:div
 [:div "Block 1"]
 [:div "Block 2"]]

[:div
 [:span "Block 1"]
 [:span "Block 2"]]


;; --------------------------------------------------------------------
;; CSS styles

[:div
 [:div.red-block "Block 1"]
 [:div
  {:class "green-block"}
  "Block 2"]]

.red-block {
  padding-top: 5px;
  color: red;
  width: 200px;
}

;; Add css styles for span blocks to add spaces between words


;; --------------------------------------------------------------------
;; Click counter

(def click-counter (atom 0))

(defn inc-counter [] (swap! click-counter inc))

(defn page []
  [:div
   [:div @click-counter]
   [:div
    {:on-click inc-counter}
    "Click me"]])

;; --------------------------------------------------------------------
;; User input
;; 1

[:input {:type "text"
         :value @input-container
         :on-change #(reset! input-container (-> % .-target .-value))}]

;; 2

(def input-class (atom nil))

[:div
 [:input {:type "text"
          :class _
          :value @input-container
          :on-change #(reset! input-container (-> % .-target .-value))}]
 [:span
  {:on-click submit}
  "Submit"]]

;; 3
;; Add some styles
;; use background-color property and add space between "Submit" and input field

;; 4 Wrap user-input into one function
;;

(defn user-input [right-word]
  (let [_ (atom "")
        _ (atom nil)
        submit (fn []
                 (if (= @input-container _)
                   (reset! input-class "green")
                   (reset! input-class "red")))]
    (fn []
      [:span
       [:input {:type "text"
                :class @input-class
                :value @input-container
                :on-change #(reset! input-container (-> % .-target .-value))}]
       [:span
        {:class "submit"
         :on-click submit}
        "+"]])))

(defn page []
  [:div
   [:span.phrase "The quick brown"]
   [user-input _]
   [:span "jumps over the lazy"]
   [user-input "dog"]])
