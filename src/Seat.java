public class Seat{
    private int seat_id;
    private int seat_row;
    private int seat_column;
    private Boolean seat_status;
    private Cinema_hall seat_cinema_hall;
    
    private static int counter=1;
    
    //Constructor 
    public Seat(int row, int column, Boolean status, Cinema_hall ch){
        seat_id=counter++;
        this.seat_row=row;
        this.seat_column=column;
        this.seat_status=status;
        this.seat_cinema_hall=ch;
    }
    
    //Methods
    public int getSeat_id(){
        return seat_id;
    }
    public Boolean getSeat_status(){
        return seat_status;
    }
    public void setSeat_status(Boolean status){
        this.seat_status=status;
    }
    public Cinema_hall getSeat_cinema_hall(){
        return seat_cinema_hall;
    }
    public int getSeat_row(){
        return seat_row;
    }
    public int getSeat_column(){
        return seat_column;
    }
        
}