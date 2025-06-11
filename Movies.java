public class Movies {

    private String title;
    private int movieLengthInMinutes;
    private String rating;
    private String director;

    public Movies(String title, int movieLengthInMinutes, String rating, String director) {
        this.title = title;
        this.movieLengthInMinutes = movieLengthInMinutes;
        this.rating = rating;
        this.director =director;
    }

    public String getTitle() {
        return title;
    }
    public int getMovieLengthInMinutes() {
        return movieLengthInMinutes;
    }
    public String getRating() {
        return rating;
    }
    public String getDirector() {
        return director;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setMovieLengthInMinutes(int movieLengthInMinutes){
        this.movieLengthInMinutes = movieLengthInMinutes;
    }
    public void setDirector(String director) {
        this.director = director;
    }

}


