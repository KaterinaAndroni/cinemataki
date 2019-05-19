import java.util.*;
import java.io.*;
import java.text.*;

/**
 *
 * @author maria
 */
public class User {
    private int user_id;
    private String username;
    private String user_name;
    private String email;
    private String phone_number;
    private String user_password;
    
    private static int counter=1;
    
    //Constructor
    public User(){}

    public User (String username,String password, String name, String email, String phone){
            
            user_id=counter++;
            
            this.username= username;
            this.user_name=name;
            this.email=email;
            this.user_password=password;
            this.phone_number=phone;
    }
      
    public void setUsername ( String usn){
          this.username=usn;
      }
      
         public String getUser_name() {
        return user_name;
    }

    public String getEmail() {
        return email;
    } 
      
      
    public int getUser_id(){
          return user_id;
      }
      
    public String getUsername(){
          return username;
      }
       
    public void setPassword(String psw) {
          this.user_password=psw;
      }
      
    public String getPassword(){
          return user_password;
      }
      
    public Boolean checkUsername(String usn, ArrayList<User> usnList){
          int megethos=usnList.size();
          int i; //gia to for loop
          Boolean check=true; //epistrefomeni timi pou deixnei an xrisimopoieitai idi to username
          for (i=0; i<megethos; i++){
              if (usn == usnList.get(i).getUsername()){
                  check= false;
              }                            
          }
          return check;
      }
      
    public Boolean checkPassword(String psw){
          
          if (psw==this.user_password)return true;
                  else return false;
      
      }
      
    public ArrayList<Movie> searchMovie(){
          
          return null;
        }
        
      //gia check 
    public static ArrayList<Movie> searchMovie(ArrayList<Movie> mov){
          
          return mov;
        }
        
    public static Movie add_to_list(ArrayList<Movie> movie_list){
         //DIALEGEI TAINIA
        System.out.println("Ποια ταινία θέλεις να προσθέσεις στη λιστα;");
       
        int mov_id;
        Movie mov=null;
        ArrayList<Movie> movies = searchMovie(movie_list);
        //gia check
        for (int k=0; k< movies.size(); k++){
            System.out.println(movies.get(k).getMovie_id());
        }
       
         mov_id=readInt();
                
        //gia check
        System.out.println(" Επελεξες την ταινια με id: " + mov_id);
        Boolean vrethike=false;
        int i=0;
        while(i<movies.size() && vrethike==false){
            if (movies.get(i).getMovie_id()==mov_id) {
                    mov=movies.get(i);
                    vrethike=true;
                }else i++;
            }
       
        return mov;
    }
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
    }
}
