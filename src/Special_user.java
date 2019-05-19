import java.util.*;
import java.io.*;
import java.text.*;
public class Special_user extends User{
    private int cinema_id;
    //Constructor
     public Special_user (String username,String password, String name, String email, String phone, int cinema_id){
           super(username, password, name, email, phone);
           this.cinema_id=cinema_id;
    }
    
    //Methods 
    public void addSchedule(ArrayList<Movie> movs) { //, ArrayList<Cinema> cinemas) {
         Movie movie;
         movie = User.add_to_list(movs);
         
        /*******************************************
        //DIALEGEI TAINIA
        System.out.println("Για ποια ταινία θέλεις να προσθέσεις προβολή;");
       
        int mov_id;
        Movie mov=null;
        ArrayList<Movie> movies=super.searchMovie(movs);
        //Maria: gia check
        for (int k=0; k< movies.size(); k++){
            System.out.println(movies.get(k).getMovie_id());
        }
       
         mov_id=readInt();
                
        //Maria: gia check
        System.out.println(" Επελεξες την ταινια με id: " + mov_id);
        Boolean vrethike=false;
        int i=0;
        while(i<movies.size() && vrethike==false){
            if (movies.get(i).getMovie_id()==mov_id) {
                    mov=movies.get(i);
                    vrethike=true;
                }else i++;
            }******************************************************/
       
        //DIALEGEI AITHOUSA
        /*
        if(mov!=null){
            Boolean found=false;
            int k=0;
            Cinema cin=null;
            while(found=false && k<cinemas.size()){
                if(cinemas.get(k).getCine_id()==cinema_id){
                    cin=cinemas.get(k);
                    found=true;
                } else k++;
            }
            if (cin!=null){
                ArrayList<Cinema_hall> temp_halls=cin.gethalls();
                int num=0;
                Boolean correct=false;
                while(correct==false){
                    System.out.println("Ωραία επιλογή ταινίας! Σε ποια απο τις "+ temp_halls.size() + " αίθουσες θα προβληθεί;");
                    num= readInt();
                    if (num>0 && num<temp_halls.size()){correct=true;}         
                }                
            
                if (num!=0){
                    
                } 
            }
        } */
         /* System.out.println("Ωραία επιλογή! Πότε θα παίξει;");
            Date date =new Date();
            System.out.println("Δώσε την ημ/νία και την ώρα σε μορφή: 2019/05/4 20:30:00"); 
            date=readDate();
            System.out.println("Είπες θα παιχτεί: " + date);
                
           */
          

    }
    /***********************
       public static int readInt(){
        byte b[]=new byte[16];
        String str;
    
        try {
            System.in.read(b);
            str=(new String(b)).trim();
            return Integer.parseInt(str);
        }   catch (IOException e){
            System.out.println("Exception: " +e.toString());
            return -1;
        }   catch (NumberFormatException e){
            System.out.println("Den edwses egkurous arithmous");
            return -1;
        }
    }***************************/
    public static Date readDate(){
        byte b[]=new byte[16];
        String str;
    
        try {
            System.in.read(b);
            str=(new String(b)).trim();
            SimpleDateFormat dateFT = new SimpleDateFormat ("yyyy/MM/dd 'at' hh:mm:ss");
            return dateFT.parse(str);
        }   catch (IOException e){
            System.out.println("Exception: " +e.toString());
            return null;
        } /*  catch (NumberFormatException e){
            System.out.println("Den edwses egkurous arithmous");
            return -1;
        } */
       catch (ParseException e) {
            System.out.println("eisai zwo");
             e.printStackTrace();
            return null;
        }
    }     
}