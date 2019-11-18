package travel2;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;

import jess.*;
public class jess2 {
	 
	
	 	 Rete r;
	jess2() throws JessException{ 
		 
		 r = new Rete();
		  
         r.reset();
		 String ss = "(deftemplate data\n" + 
				"    \"place details\"\n" + 
				"    (slot name_of_place)\n" + 
				"    (slot country)\n" + 
				"    (slot season)\n" + 
				"    (slot type_of_place)\n" + 
				"    (slot starting_budget)\n" + 
				"    (slot closing_budget))";
		
		
		String st = "(deftemplate tourist\n" + 
				"    \"tourist details\"\n" + 
				"    (slot pref_season)\n" + 
				"    (slot pref_type_of_place)\n" + 
				"    (slot pref_starting_budget)\n" + 
				"    (slot pref_closing_budget))";
		
		
		String jd1 = new Knowledge_base().data1;
		String jd2 = new Knowledge_base().data2;
		String jd3 = new Knowledge_base().data3;
		String ss3 = "(deffunction is-valid\n" + 
				"    (?x ?y)\n" + 
				"    (if (eq ?x \"\") then\n" + 
				"        (return TRUE)\n" + 
				"     else\n" + 
				"        (return (eq ?x ?y))))";
		
	  
	 String rule = "(defrule recommend\n" + 
	 		"    \"recommend\"\n" + 
	 		"    ?d <-(data\n" + 
	 		"        (name_of_place        ?recname_of_place)\n" + 
	 		"        (country              ?reccountry)\n" + 
	 		"        (season               ?recseason)\n" + 
	 		"        (type_of_place        ?rectype_of_place)\n" + 
	 		"        (starting_budget      ?recstarting_budget)\n" + 
	 		"        (closing_budget       ?recclosing_budget))\n" + 
	 		"\n" + 
	 		" 	?s <- (tourist \n" + 
	 		"        (pref_starting_budget  ?prefstarting_budget&:(is-valid ?prefstarting_budget ?recstarting_budget))\n" + 
	 		"        (pref_closing_budget   ?prefclosing_budget&:(is-valid ?prefclosing_budget ?recclosing_budget))\n" + 
	 		"        (pref_type_of_place    ?preftype_of_place&:(is-valid ?preftype_of_place ?rectype_of_place))\n" + 
	 		"        (pref_season           ?prefseason&:(is-valid ?prefseason ?recseason)))\n" + 
	 		"    =>\n" + 
	 		"(call (fetch RESULTS) add (new result ?recname_of_place ?reccountry ?recseason ?rectype_of_place ?recstarting_budget ?recclosing_budget)))";
	   
		
	   
	   
     try {	  
    	 r.importPackage("travel2");
         r.importClass("travel2.result");
	    r.executeCommand(ss);
	  
	    
		r.executeCommand(st);
		
		r.store("RESULTS", new ArrayList<result>());
		r.executeCommand(jd1);
		  for(int i=0;i<100000000;i++);
		  r.executeCommand(jd2);
		  for(int i=0;i<400000000;i++);
		  r.executeCommand(jd3);
		r.executeCommand(ss3);
		 r.executeCommand(rule);	 
         
			
			 
		} catch (JessException e) {
			 e.printStackTrace();
		}
        
        
	}

}
