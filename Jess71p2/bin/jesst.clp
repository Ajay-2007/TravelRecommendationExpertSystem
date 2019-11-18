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

(deftemplate tourist
        "tourist details"
        (slot pref_season)
        (slot pref_place)
        (slot pref_budget))

(assert (tourist (pref_season  "Spring") (pref_place "historic") (pref_budget 7000)))


(printout t crlf)
(printout t "Preffered place :" crlf)
(printout t crlf)


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

(defrule recommend-place
    ?d <-(data1
        (name_of_place        ?data1-name_of_place)
        (country       ?data1-country)
        (season          ?data1-season)
        (type_of_place         ?data1-type_of_place)
        (strating_budget   ?data1-strating_budget)
        (closing_budget  ?data1-closing_budget))
?s <- (tourist
        (pref_budget    ?tourist-pref_budget&:(>= ?tourist-pref_budget ?data1-strating_budget)&:(<= ?tourist-pref_budget ?data1-closing_budget))
        (pref_season    ?tourist-pref_season&:(is-valid1 ?tourist-pref_season ?data1-season))
        (pref-state     ?tourist-pref_place&:(is-valid1 ?tourist-pref_place ?data1-type_of_place)))
        
    =>
 (print-data1 ?d))

(run)



(deftemplate data
    "college details"
    (slot college)
    (slot state)
    (slot branch)
    (slot category  (default "General"))
    (slot opening-rank)
    (slot closing-rank))


(assert
    (data (college "IIT Kharagpur") (state "West Bengal")   (branch "CSE")  (category "General") (opening-rank 1)   (closing-rank 10))
    (data (college "IIT Kharagpur") (state "West Bengal")   (branch "ECE")  (category "General") (opening-rank 11)  (closing-rank 20))
    (data (college "IIT Kharagpur") (state "West Bengal")   (branch "CE")   (category "General") (opening-rank 21)  (closing-rank 30))
    (data (college "IIT Bombay")    (state "Maharashtra")   (branch "CSE")  (category "General") (opening-rank 1)   (closing-rank 10))
    (data (college "IIT Bombay")    (state "Maharashtra")   (branch "ECE")  (category "General") (opening-rank 11)  (closing-rank 20))
    (data (college "IIT Bombay")    (state "Maharashtra")   (branch "CE")   (category "General") (opening-rank 21)  (closing-rank 30))
    (data (college "IIT Patna")     (state "Bihar")         (branch "CSE")  (category "General") (opening-rank 1)   (closing-rank 10))
    (data (college "IIT Patna")     (state "Bihar")         (branch "ECE")  (category "General") (opening-rank 11)  (closing-rank 20))
    (data (college "IIT Patna")     (state "Bihar")         (branch "CE")   (category "General") (opening-rank 21)  (closing-rank 30)))


(deftemplate student
    "student details"
    (slot rank)
    (slot category)
    (slot pref-state)
    (slot pref-branch)
    (slot pref-college))

(assert (student (rank 15) (category "General") (pref-state "") (pref-branch "") (pref-college "")))

(printout t crlf)
(printout t "Preffered colleges :" crlf)
(printout t crlf)

(deffunction print-data
    (?d)
    (printout t "College : " ?d.college crlf)
    (printout t "State : " ?d.state crlf)
    (printout t "Category : " ?d.category crlf)
    (printout t "Branch : " ?d.branch crlf)
    (printout t "Opening rank : " ?d.opening-rank crlf)
    (printout t "Closing rank : " ?d.closing-rank crlf)
    (printout t crlf))

(deffunction is-valid
    (?x ?y)
    (if (eq ?x "") then
        (return TRUE)
     else
        (return (eq ?x ?y))))

(defrule recommend-college
    ?d <-(data
        (college        ?data-college)
        (category       ?data-category)
        (state          ?data-state)
        (branch         ?data-branch)
        (opening-rank   ?data-opening-rank)
        (closing-rank   ?data-closing-rank))
  ?s <- (student
        (rank    ?stu-rank&:(>= ?stu-rank ?data-opening-rank)&:(<= ?stu-rank ?data-closing-rank))
        (category    ?stu-category&:(is-valid ?stu-category ?data-category))
        (pref-state     ?stu-pref-state&:(is-valid ?stu-pref-state ?data-state))
        (pref-branch    ?stu-pref-branch&:(is-valid ?stu-pref-branch ?data-branch))
        (pref-college   ?stu-pref-college&:(is-valid ?stu-pref-college ?data-college)))
    =>
    (print-data ?d))

(run)

