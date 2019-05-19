import java.util.*;

public class Schedule
{   
    private int schedule_id;
    private Cinema schedule_cine;
    private ArrayList<Screening> schedule_screening_list;
    
    private static int count=1;

    Schedule(ArrayList<Screening> scr_list, Cinema cin){ 
        schedule_screening_list=scr_list;
        schedule_cine=cin;
        schedule_id=count++;
    }
    
    public ArrayList<Screening> getScreening_List(){
        return schedule_screening_list;
    }
 }
