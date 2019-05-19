import java.util.*;

public class Ticket
{
    private int ticket_id;
    private int ticket_seat_id;
    private String ticket_type;
    private int ticket_price;
    
    private Screening ticket_scr;
    
    private static int idCount = 1;

    public Ticket(int ticket_seat_id, String ticket_type, Screening ticket_scr) {
        this.ticket_id = idCount++;
        this.ticket_seat_id = ticket_seat_id;
        this.ticket_type = ticket_type;
      
        this.ticket_scr=ticket_scr;
        
        String[][] types= ticket_scr.getScr_Cinema().getType();
        
        int i=0;
        Boolean found=false;
        while (i<types.length && found==false){
            if (ticket_type==types[i][0]){
                ticket_price=Integer.parseInt(types[i][1]);
                found=true;
            } else i++;
        }
        
        
        /*
        if ("Κανονικό".equals(ticket_type))
        {
            ticket_price = 8; //evala sygkekrimeni timi se periptwsi pou den valoume na eisagei o eidikos xrhsths
        }
        
        if ("Φοιτητικό".equals(ticket_type))
        {
            ticket_price = 6; 
        }
        
        if ("Παιδικό".equals(ticket_type))
        {
            ticket_price = 4; 
        } */
    }

 

    public int getTicket_id() {
        return ticket_id;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public int getTicket_seat_id() {
        return ticket_seat_id;
    }
    public Screening getTicket_Scr(){
        return ticket_scr;
    }    
    
}