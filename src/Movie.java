public class Movie {
    
    public static int incId = 0;

    private int id;
    private String title;
    private String genre;
    private int length;
    private double rating; // will start at 100. whenever someone rates you take their rating and minus the left over from the 100 default

    public Movie(String title, String genre, int length){
        this.id = incId++;
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.rating = 100;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getLength(){
        return id;
    }
    public double getRating(){
        return rating;
    }
    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void ratingCalc(double userRating){

    }






    @Override
    public String toString(){
        return "|ID: " + id + 
                "|Title: " + title +
                "|Genre: " + genre +
                "|Length: " + length +
                "|Rating: " + rating;
    }


}
