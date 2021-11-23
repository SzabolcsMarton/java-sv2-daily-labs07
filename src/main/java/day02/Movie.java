package day02;

public class Movie {
    private String title;
    private int yearOfCreation;
    private String directedBy;

    public Movie(String title, int yearOfCreation, String directedBy) {
        this.title = title;
        this.yearOfCreation = yearOfCreation;
        this.directedBy = directedBy;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public String getDirectedBy() {
        return directedBy;
    }
}
