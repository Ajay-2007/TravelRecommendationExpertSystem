package travel2;
   
import jess.*;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class data {
   
	
	static	void setf( ArrayList<String> nop, ArrayList<String> cn,Rete rete)
	{
		int c=0;
		int minbudget[] = {1000,5000,10000,15000,20000,30000,50000,60000,70000,80000,90000};
    	int maxbudget[] = {5000,10000,15000,30000,50000,60000,70000,80000,90000,100000,10000};
    	
    	String[] place = {"Historic","Monuments","Ancient Temples","Beaches","Tropical Island Resort","Theme Parks","Zoos and Aquaria","Botanical Gardens","Carnivals","Romantic"};
    	 
        String[] season = {"Spring","Autumn","Winter"};
        
        String[] mod_of_travel = {"By_Airplanes","By_Trains","By_Bus"};
        int l=50;
        for(int i=0;i<place.length;i++)
        {
        	for(int j=0;j<season.length;j++)
        	{
        		for(int k=0;k<minbudget.length;k++)
        		{   Random rand = new Random();
        			int rd = rand.nextInt(3);
            	  for(int rn = 0;rn<rd;rn++) {
            		 int dn = rand.nextInt(50);
        		 String ss ="(data ( name_of_place \"" + nop.get(dn) + "\")(country \""+ cn.get(dn) + "\")(season \""+ season[j] + "\")(type_of_place \"" +place[i]+ "\")(starting_budget " +minbudget[k]+")(closing_budget "+maxbudget[k]+"))" ;     
        		 System.out.println(ss);
            	 
            	  }
        		c++;
        		}
        	}
        }
		 
	}
   public static void setdata(Rete rt) {
       
	   
	  
        String csvFile = "/home/sudhir/Desktop/Group-8_Travel_Recommendation_Expert_System/data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String> nops = new ArrayList<String>(); 
    	ArrayList<String> cns = new ArrayList<String>();  	
        try {
        
            br = new BufferedReader(new FileReader(csvFile));
           for(int y=0;y<61;y++) {

            	line = br.readLine();
                String[] country = line.split(cvsSplitBy);
                if(y>0&&y!=6&&y!=5&&y!=32) {
                	 
                
                	nops.add(country[4]);
                	cns.add(country[5]);
                	//System.out.println(y+" "+country[5]);
               
                }
                
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //for(int i=0;i<nops.size();i++)
        	//System.out.println( i+ " "+nops.get(i)+" "+cns.get(i));
        setf(nops,cns ,rt);
  
    }
    public static void main(String[] arg)
    {
    	 
    	Rete tr=null;
    	setdata (tr);
    }
    
    
}