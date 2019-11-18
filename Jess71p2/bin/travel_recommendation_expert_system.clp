(deftemplate data
        "place_details"
        (slot name_of_place)
        (slot country)
        (slot season)
        (slot type_of_place))
        (slot strating_budget)
        (slot closing_budget)

(assert 
        (data (name_of_place "Taj Mahal") (country "India") (season "Spring") (strating_budget 2000) (closing_budget 10000))
        (data (name_of_place "Shimla") (country "India") (season ["Spring", "Summer" , "Winter"]) (strating_budget 1000) (closing_budget 8000))
        (data (name_of_place "Thar Desert") (country "India") (season ["Spring", "Summer", "Winter"]) (strating_budget 5000) (closing_budget 15000))


(deftemplate tourist
        "tourist details"
        (slot pref_season)
        (slot pref_place)
        (slot pref_budget))

(assert (pref_place "Taj Mahal") (pref_season "Spring") (pref_budget 7000))