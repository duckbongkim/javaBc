package class1;

public class Ex02 {
    public static void main(String[] args) {
        MovieReview movieReview1;
        movieReview1 = new MovieReview();

        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한루프!";

        MovieReview movieReview2;
        movieReview2 = new MovieReview();

        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movies = new MovieReview[2];
        movies[0] = movieReview1;
        movies[1] = movieReview2;

        for(int i =0; i< movies.length; i++){
            System.out.println("이름: "+movies[i].title+", 리뷰: "+movies[i].review);
        }

    }
}
