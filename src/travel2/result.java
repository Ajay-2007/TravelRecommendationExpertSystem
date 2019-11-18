package travel2;

public class result {
   
	String name_of_place,country,season,type_of_place;
	int strating_budget,closing_budget;
	public result (String name_of_place,String country,String season, String type_of_place, int strating_budget,int closing_budget){
	 this.country = country;
	 this.name_of_place = name_of_place;
	 this.season = season;
	 this.type_of_place = type_of_place;
	 this.closing_budget = closing_budget;
	 this.strating_budget = strating_budget;
	}
	
	 public String getname_of_place() {
	        return name_of_place;
	    }
	 public String getcountry() {
	        return country;
	    }
}
