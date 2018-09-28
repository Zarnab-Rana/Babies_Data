package com.mycompany.babies_task;
import com.opencsv.CSVReader;
import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/* ----------------------------------------------  Babies Class -------------------------------------------------------*/


public class Babies {
    
    
    /* Get BOys And Girls Data Files */
    private static final String Girlz_File = "./british_girls.csv";
    private static final String Boys_File = "./british_boys.csv";
    
    
    
    /* Chck Births Methoed If Births are ":" Than Convert Them 0 */
    private static String checkBirths(String num_of_births){
        String i="0";
        if(num_of_births.matches(".*\\d+.*")){          // Expression to evaluate if number of births contains digits
            return num_of_births;
        }
        else
             return i;
    }
    
    
    
    
    /*  ----------------------------------  Main Function ------------------------------------------------------------*/
    public static void main(String[] args) throws IOException, ParseException {
        
        //  Storing Files Paths into file reader to read both files
        try (
            Reader girlzreader = Files.newBufferedReader(Paths.get(Girlz_File));
            Reader boysreader = Files.newBufferedReader(Paths.get(Boys_File));
            CSVReader csvGirlzReader = new CSVReader(girlzreader);
            CSVReader csvBoyzReader = new CSVReader(boysreader);    
        ) {
            
            
        
            // **********  Reading Girls Records One by One in a String array and storing in Json Format  **********//
           //                                                                                                      //
          //******************************************************************************************************//
             String[] GirlzRecord;
             JSONArray Girlzjsonarray=new JSONArray();
             JSONObject Girlzobject=new JSONObject();
             int i=0;
             while ((GirlzRecord = csvGirlzReader.readNext()) != null){  
                if(i==0){
                    i++;
                }
                else
                if(i>0){
                JSONObject object =new JSONObject();
                Map<String, String> Births = new HashMap<String, String>();
                Babies objectt = new Babies();
                object.put("Name",GirlzRecord[0]);                        // Put name in JSon Girls object
                Births.put("2015",objectt.checkBirths(GirlzRecord[1]));   // Put Births against name in Hashmap
                Births.put("2014",objectt.checkBirths(GirlzRecord[2]));
                Births.put("2013",objectt.checkBirths(GirlzRecord[3]));
                Births.put("2012",objectt.checkBirths(GirlzRecord[4]));
                Births.put("2011",objectt.checkBirths(GirlzRecord[5]));
                Births.put("2010",objectt.checkBirths(GirlzRecord[6]));
                Births.put("2009",objectt.checkBirths(GirlzRecord[7]));
                Births.put("2008",objectt.checkBirths(GirlzRecord[8]));
                Births.put("2007",objectt.checkBirths(GirlzRecord[9]));
                Births.put("2006",objectt.checkBirths(GirlzRecord[10]));
                Births.put("2005",objectt.checkBirths(GirlzRecord[11]));
                Births.put("2004",objectt.checkBirths(GirlzRecord[12]));
                Births.put("2003",objectt.checkBirths(GirlzRecord[13]));
                Births.put("2002",objectt.checkBirths(GirlzRecord[14]));
                Births.put("2001",objectt.checkBirths(GirlzRecord[15]));
                Births.put("2000",objectt.checkBirths(GirlzRecord[16]));
                Births.put("1999",objectt.checkBirths(GirlzRecord[17]));
                Births.put("1998",objectt.checkBirths(GirlzRecord[18]));
                Births.put("1997",objectt.checkBirths(GirlzRecord[19]));
                Births.put("1996",objectt.checkBirths(GirlzRecord[20]));   
                object.put("Births",Births);                               // Putinng Births Hashmap into Json Girls Object
                Girlzjsonarray.add(object);                                // Adding JSon object one by one into Json Girls Array
                }  
            }
            Girlzobject.put("Girlz",Girlzjsonarray);                      // Puting Whole Girls JSON Array into Single Girls object 
            
            
            
            //  End Reading Girls Record from csv File Convert into Json Format
            
            
            // **********  Readin Josn Object and Write into Json File  **********//
           //                                                                    //
          //********************************************************************//
            
            try (FileWriter file = new FileWriter("Girls.json")) {
                file.write(Girlzobject.toString());
                file.flush();
            }
            
            
            
            
            
            // **********  Reading Boys Records One by One in a String array and storing in Json Format  **********//
           //                                                                                                      //
          //******************************************************************************************************//
            String[] BoyzRecord;
            JSONObject Boysobject=new JSONObject();
            JSONArray Boyzjsonarray=new JSONArray();
            int j=0;
            while ((BoyzRecord = csvBoyzReader.readNext()) != null){  
               if(j==0){
                   j++;
               }
               else
               if(j>0){
                   JSONObject object =new JSONObject();  
                   Map<String, String> Births = new HashMap<String, String>();
                   Babies objectt = new Babies();
                   object.put("Name",BoyzRecord[0]);
                   Births.put("2015",objectt.checkBirths(BoyzRecord[1]));
                   Births.put("2014",objectt.checkBirths(BoyzRecord[2]));
                   Births.put("2013",objectt.checkBirths(BoyzRecord[3]));
                   Births.put("2012",objectt.checkBirths(BoyzRecord[4]));
                   Births.put("2011",objectt.checkBirths(BoyzRecord[5]));
                   Births.put("2010",objectt.checkBirths(BoyzRecord[6]));
                   Births.put("2009",objectt.checkBirths(BoyzRecord[7]));
                   Births.put("2008",objectt.checkBirths(BoyzRecord[8]));
                   Births.put("2007",objectt.checkBirths(BoyzRecord[9]));
                   Births.put("2006",objectt.checkBirths(BoyzRecord[10]));
                   Births.put("2005",objectt.checkBirths(BoyzRecord[11]));
                   Births.put("2004",objectt.checkBirths(BoyzRecord[12]));
                   Births.put("2003",objectt.checkBirths(BoyzRecord[13]));
                   Births.put("2002",objectt.checkBirths(BoyzRecord[14]));
                   Births.put("2001",objectt.checkBirths(BoyzRecord[15]));
                   Births.put("2000",objectt.checkBirths(BoyzRecord[16]));
                   Births.put("1999",objectt.checkBirths(BoyzRecord[17]));
                   Births.put("1998",objectt.checkBirths(BoyzRecord[18]));
                   Births.put("1997",objectt.checkBirths(BoyzRecord[19]));
                   Births.put("1996",objectt.checkBirths(BoyzRecord[20]));
                   object.put("Births",Births);
                   Boyzjsonarray.add(object); 
                }   
            }
            
            //  End Reading Boys Record from csv File Convert into Json Format
            
            
            // **********  Readin Josn Object and Write into Json File  **********//
           //                                                                    //
          //********************************************************************//
            Boysobject.put("Boys",Boyzjsonarray);
            try (FileWriter file = new FileWriter("Boys.json")) {
                file.write(Boysobject.toString());
                file.flush();
            }
        }
            // Reading Girls Record From JSon File And Storing them in Hashmap To Get Total Girls PEr Year Record
            JSONParser parser=new JSONParser();
            Object obj=parser.parse(new FileReader("./Girls.json"));
            JSONObject object=(JSONObject) obj; 
            Map<String, Double> GirlsBirthsPerYear = new HashMap<String,Double>();
            JSONArray array=(JSONArray) object.get("Girlz");
   
            Iterator<String> iterator=array.iterator();
            int k=1;
            while(iterator.hasNext()){
                Object text= iterator.next();
                JSONObject girlsObject = (JSONObject)text; 
                String name=(String) girlsObject.get("Name");
                Map girlsbirths = (HashMap) girlsObject.get("Births");
                if(k==1){
                    Iterator it = girlsbirths.entrySet().iterator();
                    while (it.hasNext()){
                        Map.Entry pair = (Map.Entry)it.next();
                        String num_of_birthss=pair.getValue().toString();  
                        Double num_of_birthsss=Double.parseDouble(num_of_birthss);
                        String key=pair.getKey().toString();
                        GirlsBirthsPerYear.put(key,num_of_birthsss);
                        it.remove();
                    }
                }
                
                if(k>1){
                    Iterator it = girlsbirths.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry pair = (Map.Entry)it.next();
                        Iterator itt = GirlsBirthsPerYear.entrySet().iterator();
                        while (itt.hasNext()) {
                            Map.Entry pairr = (Map.Entry)itt.next();
                            if(pair.getKey().toString().equals(pairr.getKey().toString())){
                                Double old_value=(Double) pairr.getValue();
                                String num_of_birthss=pair.getValue().toString();  
                                Double num_of_birthsss=Double.parseDouble(num_of_birthss);
                                Double new_value=old_value+num_of_birthsss;
                                String key=pair.getKey().toString();
                                GirlsBirthsPerYear.put(key,new_value); 
                            }
                        }
                    }
                }
                k=k+1;
            }
                         
                         
                         
                         
                         
                         
            //  Reading Boys Record From Json File and Storing in HAshmap to get Boys Per Year Record                         
            JSONParser parser1=new JSONParser();
            Object Boysobj=parser1.parse(new FileReader("./Boys.json"));
            JSONObject Boysobject=(JSONObject) Boysobj; 
            Map<String, Double> BoysBirthsPerYear = new HashMap<String,Double>();
            JSONArray Boysarray=(JSONArray) Boysobject.get("Boys");
   
            Iterator<String> iterator1=Boysarray.iterator();
            int l=1;
            while(iterator1.hasNext()){
                Object text1= iterator1.next();
                JSONObject boyObject = (JSONObject)text1; 
                String name=(String) boyObject.get("Name");
                Map boysbirths = (HashMap) boyObject.get("Births");
                if(l==1){
                    Iterator ite = boysbirths.entrySet().iterator();
                    while (ite.hasNext()){
                        Map.Entry pair = (Map.Entry)ite.next();
                        String num_of_birthss=pair.getValue().toString();  
                        Double num_of_birthsss=Double.parseDouble(num_of_birthss);
                        String key=pair.getKey().toString();
                        BoysBirthsPerYear.put(key,num_of_birthsss);
                        ite.remove();
                    }
                }
                if(l>1){
                    Iterator itee = boysbirths.entrySet().iterator();
                    while (itee.hasNext()) {
                        Map.Entry pair = (Map.Entry)itee.next();
                        Iterator itt = BoysBirthsPerYear.entrySet().iterator();
                        while (itt.hasNext()) {
                            Map.Entry pairr = (Map.Entry)itt.next();
                            if(pair.getKey().toString().equals(pairr.getKey().toString())){
                                Double old_value=(Double) pairr.getValue();
                                String num_of_birthss=pair.getValue().toString();  
                                Double num_of_birthsss=Double.parseDouble(num_of_birthss);
                                Double new_value=old_value+num_of_birthsss;
                                String key=pair.getKey().toString();
                                BoysBirthsPerYear.put(key,new_value);
                            }
                        }
                    }
                }
                l=l+1;
            }
            
            
            
            
            // Reading Boys and Girls Record per Year From  respective HashMaps and Storing Whole Data JSON Arrays and Objects 
            JSONArray   Totaljsonarray=new JSONArray();
            JSONObject  Totalobject=new JSONObject();
            Iterator it7 = BoysBirthsPerYear.entrySet().iterator();
            Iterator it8 = GirlsBirthsPerYear.entrySet().iterator();
            Map<String,String> Total = new HashMap<String,String>();
            while (it7.hasNext()&&it8.hasNext()) {
                Map.Entry pair7 = (Map.Entry)it7.next();
                Map.Entry pair8 = (Map.Entry)it8.next();
                if(pair7.getKey().toString().equals(pair8.getKey().toString())){
                    JSONObject Totalobject1=new JSONObject();
                    Double Boysperyearr=(Double) pair7.getValue();
                    Double Girlsperyearr=(Double) pair8.getValue();
                    Double Totall=Boysperyearr+Girlsperyearr;
                    Double Boys_VS_Girls_ratio=Boysperyearr/Girlsperyearr;
                    Totalobject1.put("Year",pair7.getKey().toString());
                    Total.put("Boys",String.valueOf(Boysperyearr));
                    Total.put("Girls",String.valueOf(Girlsperyearr));
                    Total.put("Total",String.valueOf(Totall));
                    Total.put("Boys To Girls",String.valueOf(Boys_VS_Girls_ratio));
                    Totalobject1.put("Data",Total);
                    Totaljsonarray.add(Totalobject1);             
                }
                it7.remove();
                it8.remove();
            }
            Totalobject.put("Population",Totaljsonarray);
            
            
            
            // Reading Whole Record From Total JSON Object and Writing into JSon File
            try (FileWriter file = new FileWriter("Total.json")) {
                file.write(Totalobject.toString());
                file.flush();
            }
        }
    }
