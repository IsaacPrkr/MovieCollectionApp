public class Main{

    public static void main(String[] args) {
        
        Movie movie = new Movie("Coming to America", "Comedy", 120);
        System.out.println(movie);

        movie.addRating(80);
        movie.addRating(60);
        movie.addRating(90);

        System.out.println(movie);

    }

}