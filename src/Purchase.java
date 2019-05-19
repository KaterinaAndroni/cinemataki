import java.util.*;

public class Purchase
{
    private int purchase_id;
    private int purchase_user_id;
    private double purchase_amount;
    private Date purchase_date;
    
    ArrayList<Ticket> purchase_ticket_list = new ArrayList<>(); 
    ArrayList<Integer> purchases_list = new ArrayList<Integer>(); 
    
    
    
    private static int idCount = 1;
    
     public Purchase(int purchase_user_id, Date purchase_date, ArrayList<Ticket> ticket_list)
    {
        this.purchase_user_id = purchase_user_id;
        this.purchase_date = purchase_date;
        this.purchase_ticket_list=ticket_list;
        this.purchase_id=idCount++;
        purchases_list.add(purchase_id);
        int i;
        double sum=0;
        for(i=0; i<ticket_list.size();i++){
            sum=sum+ticket_list.get(i).getTicket_price();
        }
        this.purchase_amount=sum;  
        updateSeats(false);
    }

    public Date getDate(){
        return purchase_date;
    }

    public int getPurchase_id() {
        return purchase_id;
    }

    public ArrayList<Ticket> getPurchase_ticket_list() {
        return purchase_ticket_list;
    }
    /*
    public void addTicket(Ticket t,  ArrayList<Seat> system_seats, ArrayList<Cinema_hall> system_halls){
        purchase_ticket_list.add(t);
               
        updateSeats(system_seats, system_halls, false);
    } */
    
    /* ALLAKSE
    public void updateSeats(ArrayList<Seat> seatsList, ArrayList<Cinema_hall> hallsList, Boolean status){
        int i;
        int seat_id;
        for(i=0; i<purchase_ticket_list.size(); i++){
            seat_id=purchase_ticket_list.get(i).getTicket_seat_id();
            Boolean vrethike=false;
            int k=0;
            int hall_id=-1;
            while(k<seatsList.size() && vrethike==false){
                if(seat_id==seatsList.get(i).getSeat_id()){
                    vrethike=true;
                    hall_id=seatsList.get(i).getSeat_cinema_hall();
                } else k++;
            }
            if(hall_id!=-1){
                Boolean found=false;
                int j=0;
                while(j<hallsList.size() && found==false){
                    if(hallsList.get(j).gethall_id()==hall_id){
                        hallsList.get(j).sethall_Seat_List(seat_id, status);
                        found=true;
                    }else j++;
                }
            }
        }
    } */
    public void updateSeats(Boolean status){
        int seat_id;
        int i;
        for(i=0; i<purchase_ticket_list.size(); i++){
            seat_id=purchase_ticket_list.get(i).getTicket_seat_id();
            purchase_ticket_list.get(i).getTicket_Scr().setScreening_Seat_List(seat_id, status);            
        }
    }
}

