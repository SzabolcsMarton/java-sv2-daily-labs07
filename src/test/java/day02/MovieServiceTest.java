package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void fillMoviesTest() {
        MovieService movieService = new MovieService(Paths.get("src/test/resources/movie.csv"));

        assertEquals(5, movieService.getMovies().size());
        assertEquals("James Cameron", movieService.getMovies().get(1).getDirectedBy());
    }

    @Test
    void fillMovieFileNotFoundTest() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> new MovieService(Paths.get("movie.txt")));
        assertEquals("Can not read file!", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }

}