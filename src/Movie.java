/**
 *
 * @author katerina
 */
public class Movie {
                private int movie_id;
        private String movie_name;
        private String movie_category;
        private int movie_year;
        private int movie_duration;
        private double rating;
                private static int counter=1;
                
        public Movie( String movie_name, String movie_category, int movie_year, int movie_duration, double rating) {
            movie_id=counter++;
            this.movie_name = movie_name;
            this.movie_category = movie_category;
            this.movie_year = movie_year;
                        this.movie_duration = movie_duration;
            this.rating = rating;
        }

        public int getMovie_id() {
            return movie_id;
        }
        public String getMovie_name(){
            return movie_name;
          }

        public void setRating(double rating) {
            this.rating = rating;
            System.out.println(rating);
        }
}
