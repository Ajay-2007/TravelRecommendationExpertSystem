package travel2;
import java.io.StringWriter;
import java.io.Writer;

import jess.*;
public class jess3 {
	 
	public static void main(String[] arsg)
	{  
		Writer writer = new StringWriter();
		String jprefseason = "Spring",jprefplace = "historic",Nameofplace;
		int prefbudget = 7000;
		Rete rete = new Rete();
		String ssps = "(defglobal ?*prefseason* = \"Spring\")";
		String sspp = "(defglobal ?*prefplace* = \"historic\")";
		String ssmnb = "(defglobal ?*minbudget* = 2000)";
		String ssmxb = "(defglobal ?*maxbudget* = 10000)";
		String ss = "(deftemplate data1\n" + 
				"        \"place_details\"\n" + 
				"        (slot name_of_place)\n" + 
				"        (slot country)\n" + 
				"        (slot season)\n" + 
				"        (slot type_of_place)\n" + 
				"        (slot strating_budget)\n" + 
				"        (slot closing_budget)) ";
		String st = "(deftemplate tourist\n" + 
				"    \"tourist details\"\n" + 
				"    (slot pref_season)\n" + 
				"    (slot pref_type_of_place)\n" + 
				"    (slot pref_starting_budget)\n" + 
				"    (slot pref_closing_budget))";
		String st1 = "(assert (tourist (pref_season \"winter\")(pref_type_of_place \"romantic\")(pref_starting_budget 80000)(pref_closing_budget 90000)))";
		String ss1 =  "(assert\n" + 
				"	(data1 (name_of_place \"Taj Mahal\")(country \"India\") (season \"Spring\") (type_of_place \"historic\")(strating_budget 2000) (closing_budget 10000)) \n" + 
				"        (data1 (name_of_place \"Shimla\")(country \"Inia\") (season \"Summer\") (type_of_place \"romantic\") (strating_budget 1000) (closing_budget 8000))\n" + 
				"        (data1 (name_of_place \"Thar Desert\") (country \"Idia\") (season \"Winter\") (type_of_place \"rmantic\") (strating_budget 5000)(closing_budget 5000)) \n" + 
				"        (data1 (name_of_place \"Red Fort\")(country \"India\") (season \"Spring\") (type_of_place \"historic\")(strating_budget 2000) (closing_budget 10000)) \n" + 
				"        (data1 (name_of_place \"Shimla\")(country \"Inia\") (season \"Summer\") (type_of_place \"romantic\") (strating_budget 1000) (closing_budget 8000))\n" + 
				"        (data1 (name_of_place \"Thar Desert\") (country \"Idia\") (season \"Winter\") (type_of_place \"rmantic\") (strating_budget 5000)(closing_budget 5000)) \n" + 
				"        (data1 (name_of_place \"Qutub Minar\")(country \"India\") (season \"Spring\") (type_of_place \"historic\")(strating_budget 2000) (closing_budget 10000)) \n" + 
				"        (data1 (name_of_place \"Shimla\")(country \"Inia\") (season \"Summer\") (type_of_place \"romantic\") (strating_budget 1000) (closing_budget 8000))\n" + 
				"        (data1 (name_of_place \"Thar Desert\") (country \"Idia\") (season \"Winter\") (type_of_place \"rmantic\") (strating_budget 5000)(closing_budget 5000)))";
		String ss3 = "(deffunction is-valid1\n" + 
				"    (?x ?y)\n" + 
				"    (if (eq ?x \"\") then\n" + 
				"        (return TRUE)\n" + 
				"     else\n" + 
				"        (return (eq ?x ?y))))";
		
	  String Print =  "(deffunction print\n" + 
	  		"    (?d)\n" + 
	  		"    (printout t \"Name_of_place : \" ?d.name_of_place crlf)\n" + 
	  		"    (printout t \"Country : \" ?d.country crlf)\n" + 
	  		"    (printout t crlf))";
			  
			  
		String ss2 = "(defrule recommend\n" + 
				"    ?d <-(data1\n" + 
				"        (name_of_place        ?name_of_place)\n" + 
				"        (country              ?country)\n" + 
				"        (season               ?season)\n" + 
				"        (type_of_place        ?type_of_place)\n" + 
				"        (strating_budget      ?strating_budget)\n" + 
				"        (closing_budget       ?closing_budget&:(is-valid1 ?*maxbudget* ?closing_budget)))\n" + 
				"    =>\n" + 
				" (print ?d))\n" + 
				"\n" + 
				"(run)";
		
		String rule1 = "(defrule recommend-places\n" + 
				"        ?d <- (data\n" + 
				"              (name_of_place    ?data-name_of_place)\n" + 
				"              (country          ?data-country)\n" + 
				"              (season           ?data-season)\n" + 
				"              (type_of_place    ?data-type_of_place)\n" + 
				"              (strating_budget  ?data-starting_budget)\n" + 
				"              (closing_budget   ?data-closing_budget))\n" + 
				"        ?t <- (tourist\n" + 
				"        (pref_starting_budget    ?minpref_budget&:(is-valid ?minpref_budget ?data-starting_budget)\n" + 
				"        (pref_closing_budget     ?maxbudget&:(is-valid ?maxbudget ?data-closing_budget)\n" + 
				"        (pref_season             ?prefseason&:(is-valid ?preseason ?data-season))\n" + 
				"        (pref_type_of_place     ?prefplace&:(is-valid ?prefplace ?data-type_of_place)))\n" + 
				"    =>\n" + 
				"    (print-data ?d))\n" + 
				"   (run)";
		String t1 = "";
		String rule = "(defrule recommend\n" + 
		 		"    \"recommend\"\n" + 
		 		"    ?d <-(data\n" + 
		 		"        (name_of_place        ?name_of_place)\n" + 
		 		"        (country              ?country)\n" + 
		 		"        (season               ?season)\n" + 
		 		"        (type_of_place        ?type_of_place)\n" + 
		 		"        (starting_budget      ?starting_budget)\n" + 
		 		"        (closing_budget       ?closing_budget))\n" + 
		 		"\n" + 
		 		" 	?s <- (tourist \n" + 
		 		"        (pref_starting_budget  ?pref_starting_budget&:(is-valid ?*minbudget* ?starting_budget))\n" + 
		 		"        (pref_closing_budget   ?pref_closing_budget&:(is-valid ?*maxbudget* ?closing_budget))\n" + 
		 		"        (pref_type_of_place    ?pref_type_of_place&:(is-valid ?*prefplace* ?type_of_place))\n" + 
		 		"        (pref_season           ?pref_season&:(is-valid ?*prefseason* ?season)))\n" + 
		 		"    =>\n" + 
		 		"    (print-data ?d))\n" + 
		 		"\n" + 
		 		"(run)";
		
	    Rete r;
	    r = new Rete();
	    r.watchAll();//System.out.println(v.toString());
        try {
        	ValueVector v = new ValueVector();
        	v.add(new Value(jprefseason, RU.STRING));
        	v.add(new Value(jprefplace, RU.STRING));
        	r.executeCommand(ssps);
        	String ssps1 = "(defglobal ?*prefseason* = v.toString())";
        	//r.executeCommand("(printout  t  ?v.toString() crlf)");
        	r.executeCommand(sspp);
        	r.executeCommand(ssmnb);
        	r.executeCommand(ssmxb);
        	 
        	r.executeCommand(st);
			r.executeCommand(ss);
			r.executeCommand(ss1);
			r.executeCommand(ss3);
			r.executeCommand(Print);
			r.executeCommand(st1);
			r.executeCommand(rule1);
			//r.executeCommand(ss2); 
		} catch (JessException e) {
			 e.printStackTrace();
		}
        
        
	}

}
