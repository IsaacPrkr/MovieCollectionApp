import java.util.ArrayList;
public class MovieManager {
    
    private ArrayList<Movie> movieList;

    public MovieManager(){
        this.movieList = new ArrayList<>();
    }

    //create
    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    //read
    public void listMovies(){
        for(Movie m : movieList){
            System.out.println(m);
        }
    }

    public void listByTitle(String title){
        for(Movie m : movieList){
            if(m.getTitle().equalsIgnoreCase(title)){
                System.out.println(m);
            }
        }
    }

    public void listByYear(int year){
        for(Movie m : movieList){
            if(m.getYear() == year){
                System.out.println(m);
            }
        }
    }

    public void listBetweenYears(int year1, int year2){
        for(Movie m : movieList){
            if(m.getYear() >= year1 && m.getYear() <= year2){
                System.out.println(m);
            }
        }
    }

    public void listByGenre(String genre){
        for(Movie m : movieList){
            try {
                if(m.getGenre().equalsIgnoreCase(genre)){
                    System.out.println(m);
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Please try again...");
            }
        }
    }

    public void listRatingAbove(double searchRatingA){
        for(Movie m : movieList){
            if(m.getRating() >= searchRatingA){
                System.out.println(m);
            }
        }
    }

    public void listRatingBelow(double searchRatingB){
        for(Movie m : movieList){
            if(m.getRating() <= searchRatingB){
                System.out.println(m);
            }
        }
    }

    public void listRatingOfMovie(String title){
        for(Movie m : movieList){
            if(m.getTitle().equalsIgnoreCase(title)){
                System.out.println(m.getRating());
            }
        }
    }

    public void listRatingCount(String title){
        for(Movie m :movieList){
            if(m.getTitle().equalsIgnoreCase(title)){
                System.out.println(m.getRatingCount());
            }
        }
    }

    public void listByLengthAbove(int length){
        for(Movie m : movieList){
            if(m.getLength() >= length){
                System.out.println(m);
            }
        }
    }

    public void listByLengthBelow(int length){
        for(Movie m : movieList){
            if(m.getLength() <= length){
                System.out.println(m);
            }
        }
    }
    
    
    

}
