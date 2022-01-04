
(defn compare-strs [str1 str2]) ;; first hint

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
.green-block {
  padding-top: 5px;
  color: green;
  width: 200px;
}

.spacer {
         padding-right: 10px;
}

;; --------------------------------------------------------------------
;; User input
;; 1

(def input-container (atom ""))

[:input {:type "text"
         :value @input-container
         :on-change #(reset! input-container (-> % .-target .-value))}]

;; 2

(def input-class (atom nil))
(def input-container (atom ""))

;;submit hint
(defn submit []
  (if (= @_ _)
    (reset! _ "green")
    (reset! _ "red")))

(defn submit []
  (if (= @input-container "right word")
    (reset! input-class "green")
    (reset! input-class "red")))

[:div
 [:input {:type "text"
          :class @input-class
          :value @input-container
          :on-change #(reset! input-container (-> % .-target .-value))}]
 [:span
  {:on-click submit}
  "Submit"]]

;; 3
;; Add some styles
;;
.green {
  background-color: green;
}

.red {
  background-color: red;
}

.submit {
         padding-left: 10px;
         padding-right: 10px;
}

;; Homework
;;

(defn page []
  [:div.page
   [:h3 "Type the correct words into gaps"]
   [:div.line
    [user-input "Program"]
    [:span.phrase "is a collection of instructions[1] that can be executed by a computer to perform a specific task"]]
   [:div.line
    [user-input "Function"]
    [:span.phrase "is 'self contained' module of code that accomplish a specific task. It usually 'takes in' data, processes it, and 'returns' a result."]]
   [:div.line
    [user-input "Bug"]
    [:span.phrase "is an error, flaw or fault in a computer program or system that causes it to produce an incorrect or unexpected result, or to behave in unintended ways."]]
   [:div.line
    [user-input "Debug"]
    [:span.phrase " - the process of finding and fixing program errors."]]
   [:div.line
    [user-input "HTML"]
    [:span.phrase "is the standard markup language for documents designed to be displayed in a web browser."]]
   [:div.line
    [user-input "CSS"]
    [:span.phrase "is the language for describing page styles displayed in a web browser."]]
   [:div.line
    [user-input "Server"]
    [:span.phrase "is a computer program that provides functionality for other programs or devices, called 'clients'"]]])

.body-container {
  font-family: 'Helvetica Neue', Verdana, Helvetica, Arial, sans-serif;
  margin: 0 auto;
  padding-top: 22px;
  color: #333;
  line-height: 1.5em;
}

h3 {
  color: #48CFAD;
}

.submit {
         padding-left: 5px;
         padding-right: 10px;
}

.phrase {
         padding-right: 5px;
}

.page {
  padding-left: 40px;
}
.green {
  background-color: #ecf9dd;
  border: none;
  padding: 3px;
  border-radius: 5px;
  width: fit-content;
}

.red {
  border: none;
  padding: 3px;
  border-radius: 5px;
  width: fit-content;
  background-color: #FFCCCB;
}

.line {
  max-width: 600px;
  padding-bottom: 20px;
}
