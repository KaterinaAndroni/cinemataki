public class Giftcard
 {
   private int gift_id;
   private int cine_id;
   private int user_id;
   private int movie_id;
   
   public Giftcard(int cine, int movie){
       gift_id++;
       this.cine_id = cine;
       this.movie_id = movie;
       
  }
   
   //Getters
   public int get_cine_id(){
        return cine_id;
   } 
   public int get_user_id(){
       return user_id;
   }
   public int getgift_id(){
       return gift_id;
   }
}
