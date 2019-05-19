import java.util.*;

public class Cinema_hall {
    private int hall_id;
    private int hall_row;
    private int hall_column;
    private int hall_cine_id; 
    
   private ArrayList<Seat> hall_Seat_List;
    
    private static int counter=1;
    
    //Constructor 
    public Cinema_hall(int cinema_id, int row, int column){
        hall_id=counter++;
        
        this.hall_cine_id=cinema_id;
        this.hall_row=row;
        this.hall_column=column;
        
    }
    
    //Methods
    public int gethall_id(){
        return hall_id;
    }
    public int gethall_row(){
        return hall_row;
    }
    public int gethall_column(){
        return hall_column;
    }
    public void sethall_Seat_List(ArrayList<Seat> seats){
        hall_Seat_List=seats;
    }
    public ArrayList<Seat> gethall_Seat_List(){
        return hall_Seat_List;
    }

}