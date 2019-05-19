import java.util.*;

public class Screening{
    private int scr_id;
    private Cinema scr_cine;
    private Date scr_date;
    private Cinema_hall scr_hall;
    private Movie scr_movie;
    
    ArrayList<Seat> scr_seats;
    
    private static int counter=1;
    
    //Constructor 
    public Screening (Cinema cinema,Movie mov, Date scr_date, Cinema_hall scr_hall){
        scr_id=counter++;
        
        this.scr_cine=cinema;
        this.scr_date=scr_date;
        this.scr_hall=scr_hall;
        this.scr_movie=mov;
        this.scr_seats=scr_hall.gethall_Seat_List();
        
    }
    
    //Methods 
    public ArrayList<Seat> getScr_seats(){
        return scr_seats;
    }
    public Date get_scr_date(){
        return scr_date;
    }
    public Movie get_scr_movie(){
        return scr_movie;
    }
    public int get_scr_id(){
        return scr_id;
    }
    public Cinema getScr_Cinema(){
        return scr_cine;
    }
    public Cinema_hall getCH(){
        return scr_hall;
    }
    public void setScreening_Seat_List(int seat_id, Boolean new_status){
        int i=0; 
        Boolean vrethike=false;
        
        while(i<scr_seats.size() && vrethike==false){
            if (scr_seats.get(i).getSeat_id()==seat_id){
                scr_seats.get(i).setSeat_status(new_status);
                vrethike=true;
            } else i++;
        }
    }
    public String[][] diagram(){
        int rows= scr_hall.gethall_row();
        int column= scr_hall.gethall_column();
        String[][] diag= new String[rows][column];
        for(int i=0; i<scr_seats.size();i++){
            if (scr_seats.get(i).getSeat_status()==false){
                diag[scr_seats.get(i).getSeat_row()-1][scr_seats.get(i).getSeat_column()-1]="X";
            } else {  diag[scr_seats.get(i).getSeat_row()-1][scr_seats.get(i).getSeat_column()-1]="O";  }
        }
        return diag;
    }
}