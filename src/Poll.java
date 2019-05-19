import java.util.*;
import java.io.*;
import java.text.*;

public class Poll
{
    private int poll_id;
    private int poll_user_id;
    private ArrayList<Movie> poll_movie_list;
    private ArrayList<Movie> poll_vote_list;
    private int poll_movie_id;
    Movie poll_movie;

    public Poll(int poll_user_id, ArrayList<Movie> poll_vote_list)
    {
        poll_id++;
        this.poll_user_id = poll_user_id;
        this.poll_vote_list = poll_vote_list;
    }

    public ArrayList<Movie> getPoll_movie_List(){
        return poll_movie_list;
    }
    
    public void conf_vote_list(){
        
    }
    
    public void add_to_vote_list(ArrayList<Movie> poll_movie_list){
        poll_movie = User.add_to_list(poll_movie_list);
        poll_vote_list.add(poll_movie);
    }
    
   public void way_to_inform(){
    }
}
