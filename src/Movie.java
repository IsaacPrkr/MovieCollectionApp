public class Movie {
    
    public static int incId = 0;

    private int id;
    private String title;
    private String genre;
    private int year;
    private int length;
    private double rating; // will start at 100. whenever someone rates you take their rating and minus the left over from the 100 default
    private int ratingCount;

    public Movie(String title, String genre, int length, int year){
        this.id = incId++;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.length = length;
        this.rating = 100;
        this.ratingCount = 0;
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
    public int getYear(){
        return year;
    }
    public int getLength(){
        return length;
    }
    public double getRating(){
        return rating;
    }
    public int getRatingCount(){
        return ratingCount;
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

    //rating
    public void addRating(double userRating){
        if(ratingCount == 0){
            rating = userRating;
        } else{
            rating = (rating * ratingCount + userRating) / (ratingCount + 1);
        }
        ratingCount++;  
    }


    @Override
    public String toString() {
        return "|ID: " + id +
            "|Title: " + title +
            "|Genre: " + genre +
            "|Year: " + year +
            "|Length: " + length +
            "|Rating: " + String.format("%.2f", rating);
    }



}
