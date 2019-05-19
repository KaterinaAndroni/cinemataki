import java.util.*;
import java.io.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame{

    public static void main (String[] args){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arxiki_othoni().setVisible(true);
            }
        });
        
        Movie mov1= new Movie("tainia1", "katigoria", 2019, 180, 3.5);
        /*Movie mov2= new Movie("deuteri tainia", "katigoria", 2019, 180, 3.5);
        Movie mov3= new Movie("triti tainia", "katigoria", 2019, 180, 3.5);
        
        ArrayList<Movie> movies= new ArrayList<Movie>();
        movies.add(mov1);
        movies.add(mov2);
        movies.add(mov3);
        */
       
        Cinema_hall c_h1 = new Cinema_hall(1, 2, 2);
       // Cinema_hall c_h2 = new Cinema_hall(1, 2, 1);
        
        ArrayList<Cinema_hall> cine_hall= new ArrayList<Cinema_hall>();
        cine_hall.add(c_h1);
        //cine_hall.add(c_h2);
        
        String[][] pinakas= new String[3][2]; 
        pinakas[0][0]="Φοιτητικο";
        pinakas[0][1]="6";
        pinakas[1][0]="Κανονικο";
        pinakas[1][1]="8";
        pinakas[2][0]="Πολυτεκνο";
        pinakas[2][1]="6";
        
        Seat s1=new Seat(1,1,true,c_h1);
        Seat s2=new Seat(1,2,false,c_h1);
        Seat s3=new Seat(2,1,true,c_h1);
        Seat s4=new Seat(2,2,true,c_h1);
        
        ArrayList<Seat> seats=new ArrayList<Seat>();
        seats.add(s1);
        seats.add(s2);
        seats.add(s3);
        seats.add(s4);
        
        c_h1.sethall_Seat_List(seats);
        /*
        Special_user xristis= new Special_user("123","123","idioktitis","user1@gmail.com","123456", 1);
        */
       Typical_user t_xristis = new Typical_user ("username", "password", "name", "email", "phone", "location");
       Cinema cinema1 = new Cinema ("cine_phone", "cine_location", "cinema1", cine_hall, pinakas);
       
       Date date1=new Date(2019-1900, 5-1, 29, 20, 30, 00);
     
       Screening scr= new Screening(cinema1, mov1, date1, c_h1);
       ArrayList<Screening> scr_list=new ArrayList<Screening>();
       scr_list.add(scr);
       Schedule sch = new Schedule(scr_list,cinema1);
       cinema1.setSchedule(sch);
       /* Cinema cinema2 = new Cinema ("cine_phone", "cine_location", "cine_name", cine_hall);
        Poll poll = new Poll(1, movies);
        
        
        //mov1.setRating(4.9);
        //cinema2.getCine_id();
        //cinema1.getCine_id();
        //poll.conf_vote_list();
        //poll.add_to_vote_list(movies);
        //xristis.addSchedule(movies);
        
        /*int totalcost = 0;
        Purchase pur = new Purchase(1);
        Ticket t1 = new Ticket(9,"Παιδί");
        Ticket t2 = new Ticket(12,"Φοιτητής");
        Ticket t3 = new Ticket(34,"Ενήλικας");
        Ticket t4 = new Ticket(6,"Ενήλικας");
        
        pur.addTicket(t1);
        pur.addTicket(t2);
        pur.addTicket(t3);
        pur.addTicket(t4);
        
        for(Ticket ticket : pur.getPurchase_ticket_list()){
            
            totalcost +=  ticket.getTicket_price();
            System.out.println(ticket.getTicket_id() + " | " + ticket.getTicket_seat_id()  + " | " + ticket.getTicket_type() + " | " + ticket.getTicket_price());
        }
        System.out.println(totalcost + " €");
    }*/
    
    //t_xristis.make_purchse();
        ArrayList<Movie> System_movies = new ArrayList<Movie>();
        System_movies.add(mov1);
        
        ArrayList<Cinema> System_cinemas= new ArrayList<Cinema>();
        System_cinemas.add(cinema1);
        
        ArrayList<Seat> System_seats= new ArrayList<Seat>();
        System_seats.add(s1);
        
    
        ArrayList<Cinema_hall> System_cine_hall= new ArrayList<Cinema_hall>();
        System_cine_hall.add(c_h1);
        
        ArrayList<Screening> System_screenings= new ArrayList<Screening>();
        System_screenings.add(scr);
        
        System.out.println("Αυτές οι ταινίες παίζουν τώρα!");
        System.out.println(mov1.getMovie_name() + " με κωδικό " + mov1.getMovie_id());
        System.out.println("Γράψε τον κωδικό της ταινίας που σε ενδιαφέρει!");
        int mov_id= readInt();
        while(mov_id>System_movies.size() || mov_id<0) {
            System.out.println("Ουπς! Δεν έδωσες σωστό αριθμό!Δώσε πάλι");
            mov_id=readInt();
        }
        if(mov_id!=-1 && mov_id<=System_movies.size()){
            System.out.println("Παίζεται σε αυτά τα cinema:");
            System.out.println(cinema1.getCine_name() + " με κωδικό " + cinema1.getCine_id() );
            System.out.println("Γράψε τον κωδικό του cinema που σε ενδιαφέρει να δεις προβολές για την ταινία που διάλεξες!");
            int cinema_id=readInt();
            while(cinema_id>System_cinemas.size() || cinema_id<0) {
                System.out.println("Ουπς! Δεν έδωσες σωστό αριθμό!Δώσε πάλι");
                cinema_id=readInt();
            }
            
            if(cinema_id!=-1 ){
                Cinema chosen_cin=null;
                Boolean found=false;
                int k=0;
                while (k<System_cinemas.size() && found==false){
                    if (System_cinemas.get(k).getCine_id()==cinema_id){
                        chosen_cin=System_cinemas.get(k);
                        found=true;
                    }else k++;
                }
                System.out.println("Οι διαθέσιμες προβολές είναι εξής:");
                ArrayList<Screening> temp= new ArrayList<Screening>();
                temp= chosen_cin.getSchedule().getScreening_List();
                for(int i=0; i<temp.size(); i++){
                    System.out.println(temp.get(i).get_scr_date() +"\t" + temp.get(i).get_scr_movie().getMovie_name() + "\t" + " με κωδικό προβολής: "+temp.get(i).get_scr_id());
                }
                
                System.out.println("Γράψε τον κωδικό της προβολής που θες να κλείσεις εισιτήρια!");
                int scr_id= readInt();
                while(scr_id>System_screenings.size() || scr_id<0) {
                    System.out.println("Ουπς! Δεν έδωσες σωστό αριθμό!Δώσε πάλι");
                    scr_id=readInt();
                }
                if (scr_id!=-1){
                    Screening chosen_scr=null; 
                    Boolean vrethike=false;
                    int p=0;
                    while(p<System_screenings.size() && vrethike== false){
                        if (System_screenings.get(p).get_scr_id()==scr_id){
                            vrethike=true; 
                            chosen_scr=System_screenings.get(p);
                        } else p++;
                    }
                    
                    int rows= chosen_scr.getCH().gethall_row();
                    int columns=chosen_scr.getCH().gethall_column();
                    
                    String[][] diagram=chosen_scr.diagram();
                    for(int r=0; r<rows; r++){
                        for (int c=0; c<columns; c++){
                            System.out.print(diagram[r][c] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println(" Όπου βλέπεις Χ δυστυχώς δεν είναι διαθέσιμη! \n Όπου βλέπεις Ο η θέση σε περιμένει!");
                    
                }
            }
            
        }
}
public static int readInt(){
        byte b[]=new byte[16];
        String str;
    
        try {
            System.in.read(b);
            str=(new String(b)).trim();
            return Integer.parseInt(str);
        }   catch (IOException e){
            System.out.println("Τι είσαι; Ρομπότ; \n Exception: " +e.toString());
            return -1;
        }   catch (NumberFormatException e){
            System.out.println("Δεν έδωσες έγκυρους αριθμούς!");
            return -1;
        }
    }
}

    
