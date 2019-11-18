package travel2;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;

import jess.Fact;
import jess.JessException;
import jess.RU;
import jess.Rete;
import jess.Value;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 
public class controller extends javax.swing.JFrame  {
 
	 String place,season,travel_mod;
	 int min_budget  ;
	  int max_budget ;	 
	  ArrayList<result>dup;
	  int count;
	controller(){
	super("Change JLabel Font Name, Style, Size, Color");
	  
    count=0;
	  dup = new ArrayList<result>();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton result = new JButton("SEE RESULT");
       
        JTable Table1 = new JTable();
        JTable Table2 = new JTable();
        JTable Table3 = new JTable();
        JTable Table4 = new JTable();
        JTable Table5 = new JTable();
        
        
        JScrollPane jScrollPane1 = new JScrollPane();
        JScrollPane jScrollPane2 = new JScrollPane();
        JScrollPane jScrollPane3 = new JScrollPane();
        JScrollPane jScrollPane4 = new JScrollPane();
        JScrollPane jScrollPane5 = new JScrollPane();
        Dimension listSize1 = new Dimension(400, 200);
        Dimension listSize2 = new Dimension(400, 200);
        Dimension listSize3 = new Dimension(400, 200);
        Dimension listSize4 = new Dimension(400, 200);
        Dimension listSize5 = new Dimension(400, 200);
        jScrollPane1.setSize(listSize1);
        jScrollPane1.setMaximumSize(listSize1);
        jScrollPane1.setPreferredSize(listSize1);
        
        jScrollPane2.setSize(listSize2);
        jScrollPane2.setMaximumSize(listSize2);
        jScrollPane2.setPreferredSize(listSize2);
        
        jScrollPane3.setSize(listSize3);
        jScrollPane3.setMaximumSize(listSize3);
        jScrollPane3.setPreferredSize(listSize3);
        
        jScrollPane4.setSize(listSize4);
        jScrollPane4.setMaximumSize(listSize4);
        jScrollPane4.setPreferredSize(listSize4);
        
        jScrollPane5.setSize(listSize5);
        jScrollPane5.setMaximumSize(listSize5);
        jScrollPane5.setPreferredSize(listSize5);
        
        jScrollPane5.setViewportView(Table5);
        Table5.setBackground(Color.yellow);
        jScrollPane5.setBackground(Color.gray);
        Table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Historic"},
                    {"Monuments"},
                    {"Ancient Temples"},
                    {"Beaches"},
                    {"Tropical Island Resort"},
                    {"Theme Parks"},
                    {"Zoos and Aquaria"},
                    {"Botanical Gardens"},
                    {"Carnivals"},
                    {"Romantic"},
                    {"Hill Station"},{"Beach"},{"Desert"},{},
                    {null}
                },
                new String [] {
                    "Type_of_places"
                }
            ));
             
            jScrollPane1.setViewportView(Table1);
            
            Table2.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                    	{"1000", "5000"},
                        {"5000", "10000"},
                        {"10000", "15000"},
                        {"15000", "30000"},
                        {"30000", "50000"},
                        {"50000", "60000"},
                        {"60000", "70000"},
                        {"70000", "80000"},
                        {"80000", "90000"},
                        {"900000", "100000"},
                        {"1000000","120000"},{"120000","150000"},{"150000","200000"},{}
                    },
                    new String [] {
                        "Min_budget", "Max_budget"
                    }
                ));
                
                jScrollPane2.setViewportView(Table2);
                
                Table3.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"By_Airplanes"},
                            {"By_Trains"},
                            {"By_Bus"},{},{},{},{},{},{},{},{},{},{},{},{}
                        },
                        new String [] {
                            "Mode_of_Transportation"
                        }
                    ));
                     
                    jScrollPane3.setViewportView(Table3);
                    
                    Table4.setModel(new javax.swing.table.DefaultTableModel(
                            new Object [][] {
                                {"Spring"},
                                {"Autumn"},
                                {"Winter"},{"Summer"},{},{},{},{},{},{},{},
                                {null}
                            },
                            new String [] {
                                "Season"
                            }
                        ));
                        
                        jScrollPane4.setViewportView(Table4);

        
        
        
        JPanel panel = new JPanel();
        JPanel panel11 = new JPanel();
        JPanel panel12 = new JPanel();
        JPanel panel121 = new JPanel();
        JPanel respanel = new JPanel();
        JPanel panel122 = new JPanel();
        
        
        
        panel11.setBackground(Color.blue);
        panel12.setBackground(Color.gray);
        panel121.setBackground(Color.gray);
       
        panel122.setBackground(Color.gray);
        respanel.setLayout(new BorderLayout());
        respanel.add(jScrollPane5,BorderLayout.CENTER);
       

        JLabel title = new JLabel();
        title = new JLabel("Travel Recommendation Expert System ");

        Font f = new Font("TimesRoman",Font.BOLD,30);
        title.setForeground(Color.BLACK);
         
        title.setFont(f);
        title.setBounds(80,20,250,80);
        panel11.add(title);
        
        
        panel.setLayout(new BorderLayout());
        panel.add(panel11,BorderLayout.NORTH);
        panel.add(panel12,BorderLayout.CENTER);
        BoxLayout boxlayout = new BoxLayout(panel12, BoxLayout.Y_AXIS);
        BoxLayout boxlayout122 = new BoxLayout(panel122, BoxLayout.Y_AXIS);
        BoxLayout boxlayout1 = new BoxLayout(panel121, BoxLayout.X_AXIS);
        
        panel121.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));
        panel122.setBorder(new EmptyBorder(new Insets(40, 300, 40, 300)));
        
        panel12.setLayout(boxlayout);
        panel12.add(panel121);
        panel12.add(panel122);
        
        panel121.setLayout(boxlayout1);
        
        
        
        panel121.add(jScrollPane1);
        panel121.add(Box.createRigidArea(new Dimension(100, 0)));
        panel121.add(jScrollPane2);
        panel121.add(Box.createRigidArea(new Dimension(100, 0)));
        
        panel121.add(jScrollPane3);
        panel121.add(Box.createRigidArea(new Dimension(100, 0)));
        panel121.add(jScrollPane4);
        
        
        result.setPreferredSize(new Dimension(20, 30));
        panel122.setLayout(new BorderLayout());
        
        panel122.add(result,BorderLayout.NORTH);
        panel122.add(respanel,BorderLayout.CENTER);
        respanel.setVisible(false);
        panel122.setBackground(Color.gray);
        jScrollPane5.setBackground(Color.gray);
        
        Table1.setBackground(Color.ORANGE);
        Table2.setBackground(Color.ORANGE);
        Table3.setBackground(Color.ORANGE);
        Table4.setBackground(Color.ORANGE);
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	 int column = 0;
                 int row = Table1.getSelectedRow();
                   place = Table1.getModel().getValueAt(row, column).toString();
                  
              
            }
        });
         
        
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	int column1 = 0,column2=1;
                int row = Table2.getSelectedRow();
                 String  ss1 = Table2.getModel().getValueAt(row, column1).toString();
                   String  ss2 = Table2.getModel().getValueAt(row, column2).toString();
                min_budget = Integer.parseInt(ss1);  
                max_budget = Integer.parseInt(ss2);  
            }
        }); 
        Table3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	int column = 0;
                int row = Table3.getSelectedRow();
                  travel_mod = Table3.getModel().getValueAt(row, column).toString();
               
            }
        });
        
        Table4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	int column = 0;
                int row = Table4.getSelectedRow();
                  season = Table4.getModel().getValueAt(row, column).toString();
                  
            }
        });
        jess2 engine = null;
        try {
			engine = new jess2();
		} catch (JessException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
    	Rete ret = engine.r; 
    	data dt = new data();
    	count =0;
    	// dt.setdata(ret);
        result.addActionListener(new ActionListener() {         
        	public void actionPerformed(ActionEvent e) {
        		DefaultTableModel dm = (DefaultTableModel)Table5.getModel();
        		while(dm.getRowCount() > 0)
        		{
        		    dm.removeRow(0);
        		}
        		 
				try {
					//ret.reset();
            	Fact f = new Fact("tourist", ret);
                
                f.setSlotValue("pref_season", new Value(season, RU.STRING));
                f.setSlotValue("pref_type_of_place", new Value(place, RU.STRING));
                f.setSlotValue("pref_starting_budget", new Value(min_budget, RU.INTEGER));
                f.setSlotValue("pref_closing_budget", new Value(max_budget, RU.INTEGER));
                ret.assertFact(f);
                ret.run();
                Value v = ret.fetch("RESULTS");
                ArrayList<result> recommendedRecords = (ArrayList<result>) v.javaObjectValue(ret.getGlobalContext());
               result ares;
               String res = "";
               DefaultTableModel dtm = new DefaultTableModel(0, 0);
               String header[] = new String[] {"S.No","Country","Place_to_Travel"};
               dtm.setColumnIdentifiers(header);
               Table5.setModel(dtm);
            int d=1,i;
             count++;
                for( i=0;i<recommendedRecords.size();i++)
                {
                	 
                	ares =  recommendedRecords.get(i);
                	 
                	res += ares.country + " "+ ares.name_of_place +" ";
                	if(!dup.contains(ares)) {
                	 dtm.addRow(new Object[] {d,ares.country, ares.name_of_place }); 
                	  dup.add(ares);
                	  d++;
                	  if(count>=4) {
                		  dup.clear();count=0;
                	  }
                	}
                	 
                  }
                if(i==0)
                {
                	 dtm.addRow(new Object[] {0,"No Match", "No Match" }); 
                }
        		 
               
                respanel.setVisible(true);
        		 
        		 
				} catch (JessException e1) {
					 
					e1.printStackTrace();
				}
        	}
        	});
        
        
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true); 
        frame.setSize(1000,800);
    }
 
	public static void main(String[] args) {
		 
		controller ct = new controller();
	}
	
	
}
