import java.util.*;

public class Typical_user extends User
{
    private String location;
    private String user_poll_preferences;
    
    //Constructor 
     public Typical_user (String username,String password, String name, String email, String phone, String location){
            super(username,password,name,email,phone);
            this.location=location;
    }
    //Methods
    public String get_user_location(){
        return location;
    }
    
     public void isPurchase_valid (Screening scr, ArrayList<Seat> chosen_seats, ArrayList<String> type){ 
         if (type.size()==chosen_seats.size()){
             make_purchase(scr, chosen_seats, type);
        } else System.out.println("Ο αριθμός των θέσεων δεν συμπίπτει με τον αριθμό των εισιτηρίων");
    }
    
    public void make_purchase(Screening scr, ArrayList<Seat> chosen_seats, ArrayList<String> type){
        Date date = new Date();
        ArrayList<Ticket> ticket_list=new ArrayList<Ticket>();
        for (int i=0; i<chosen_seats.size(); i++){
            Ticket tick= new Ticket(chosen_seats.get(i).getSeat_id(), type.get(i), scr);
            ticket_list.add(tick);
        }
        Purchase pur = new Purchase(this.getUser_id(), date, ticket_list);
        
    }
    
    }
 

