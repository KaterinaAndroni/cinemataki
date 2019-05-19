/**
 *
 * @author katerina
 */
import java.util.*;
public class Cinema {
        private int cine_id;
        private String cine_phone;
        private String cine_location;
        private String cine_name;
        
        private ArrayList<Cinema_hall> halls;
        private Schedule cinema_schedule;
        
        private String[][] type_of_tickets;
        
        private static int counter=1;
    
        public Cinema(String cine_phone, String cine_location, String cine_name, ArrayList<Cinema_hall> halls, String[][] tot) {
            cine_id=counter++;
            this.cine_phone = cine_phone;
            this.cine_location = cine_location;
            this.cine_name = cine_name;
            this.halls=halls;
            type_of_tickets=tot;    
                        
        }

        public int getCine_id() {
                System.out.println(cine_id);
            return cine_id;
        }
        public String getCine_name(){
            return cine_name;
        }
        public ArrayList<Cinema_hall> gethalls(){
          return halls;
          }
          //maria 
        public String[][] getType(){
            return type_of_tickets;
        }
          //Maria
        public void setSchedule(Schedule sch){
            cinema_schedule=sch;
        }
        public Schedule getSchedule(){
            return cinema_schedule;
        }
}
