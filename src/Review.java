
/**
 *
 * @author katerina
 */
public class Review {
                private int review_id;
		private double review_rate;
		private String review_comment;
		private int review_user_id;
                private int review_movie_id;
                private static int counter=1;
	
		public Review(double review_rate, String review_comment, int review_user_id, int review_movie_id) {
			review_id = counter++;
			this.review_rate = review_rate;
			this.review_comment = review_comment;
			this.review_user_id = review_user_id;
			this.review_movie_id = review_movie_id;
		}

		public int getReview_id() {
			return review_id;
		}
		
		public double getRating() {
			return review_rate;
		}

}
