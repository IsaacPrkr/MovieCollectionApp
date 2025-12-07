import java.util.*;
public class Main{

    public static void main(String[] args) {
        
        

        

        Scanner scanner = new Scanner(System.in);

        MovieManager movies = new MovieManager();

        Movie m1 = new Movie("Inception", "Science Fiction", 148, 2010);
        Movie m2 = new Movie("The Godfather", "Crime", 175, 1972);
        Movie m3 = new Movie("La La Land", "Musical", 128, 2016);
        Movie m4 = new Movie("The Dark Knight", "Action", 152, 2008);
        Movie m5 = new Movie("Interstellar", "Science Fiction", 169, 2014);
        Movie m6 = new Movie("Pulp Fiction", "Crime", 154, 1994);
        Movie m7 = new Movie("Spirited Away", "Animation", 125, 2001);
        Movie m8 = new Movie("The Shawshank Redemption", "Drama", 142, 1994);
        Movie m9 = new Movie("Parasite", "Thriller", 132, 2019);
        Movie m10 = new Movie("Back to the Future", "Adventure", 116, 1985);

        movies.addMovie(m1);
        movies.addMovie(m2);
        movies.addMovie(m3);
        movies.addMovie(m4);
        movies.addMovie(m5);
        movies.addMovie(m6);
        movies.addMovie(m7);
        movies.addMovie(m8);
        movies.addMovie(m9);
        movies.addMovie(m10);


        while (true) { 
            System.out.println("\n-Netflix");
            System.out.println("See options below");
            System.out.println("1. Check out movies...");
            System.out.println("2. Add a movie");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("\nHow would you like to check?");
                    System.out.println("1. Show all movies...");
                    System.out.println("2. Search for movie by title...");
                    System.out.println("3. Search for movies in specific year...");
                    System.out.println("4. Search for movies in a time period...");
                    System.out.println("5. Search by specific genre...");
                    System.out.println("6. Search for movies with a specific rating and above...");
                    System.out.println("7. Search for a movie with a specific rating and below...");
                    System.out.println("8. Check a movies rating...");
                    System.out.println("9. Check a movies rating count...");
                    System.out.println("10. Search for movies with a specific length and above...");
                    System.out.println("11. Search for movies with a specific length and below...");
                    System.out.println("12. Exit");

                    int choice1 = scanner.nextInt();
                    scanner.nextLine();

                    switch(choice1){
                        case 1:
                            System.out.println("\nListing movies...");
                            movies.listMovies();
                            break;
                        case 2:
                            System.out.println("Enter the title you'd like to search for... ");

                            String searchTitle = scanner.nextLine();
                            System.out.println("Searching for movies with your title...");
                            movies.listByTitle(searchTitle);
                            break;
                        case 3:
                            System.out.println("Enter the year you'd like to search for... ");

                            int searchyear = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Searching for movies with your year... ");

                            movies.listByYear(searchyear);
                            break;
                        case 4:
                            System.out.println("Enter the first year you'd like to start the search... ");
                            int firstYearSearch = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter the second year you'd like to finish the search...");
                            int secondYearSearch = scanner.nextInt();

                            System.out.println("Searching for the movies...");
                            movies.listBetweenYears(firstYearSearch, secondYearSearch);
                        
                    }
                break;
            }
        }

    }

}