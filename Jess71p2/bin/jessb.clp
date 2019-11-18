(deftemplate data1
        "place_details"
        (slot name_of_place)
        (slot country)
        (slot season)
        (slot type_of_place)
        (slot strating_budget)
        (slot closing_budget)) 
(assert
    (data1 (name_of_place "Taj Mahal")   (country "India") (season "Spring") (type_of_place "historic") (strating_budget 2000) (closing_budget 10000))
    (data1 (name_of_place "Shimla")      (country "Inia") (season "Summer") (type_of_place "romantic") (strating_budget 1000) (closing_budget 8000))
    (data1 (name_of_place "Thar Desert") (country "Idia") (season  "Winter") (type_of_place "rmantic") (strating_budget 5000)(closing_budget 15000)))

(deffunction print-data1
    (?d)
    (printout t "Name_of_place : " ?d.name_of_place crlf)
    (printout t "Country : " ?d.country crlf)
    (printout t "Season : " ?d.season crlf)
    (printout t "Type_of_place : " ?d.type_of_place crlf)
    (printout t "Strating_budget : " ?d.strating_budget crlf)
    (printout t "Closing_budget: " ?d.closing_budget crlf)
    (printout t crlf))

(deffunction is-valid1
    (?x ?y)
    (if (eq ?x "") then
        (return TRUE)
     else
        (return (eq ?x ?y))))

(defrule recommend-place ?d <-(data1 (name_of_place ?data1-name_of_place) (country ?data1-country)(season ?data1-season&:(is-valid1 "Spring" ?data1-season))(type_of_place ?data1-type_of_place&:(is-valid1 "historic" ?data1-type_of_place))(strating_budget   ?data1-strating_budget&:(is-valid1 2000 ?data1-strating_budget))(closing_budget  ?data1-closing_budget&:(is-valid1 10000 ?data1-closing_budget))) => (print-data1 ?d)) (run)
