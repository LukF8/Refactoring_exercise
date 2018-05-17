package test;

import org.junit.Test;

import main.Movie;
import main.Rental;

import static org.junit.Assert.*;


public class RentalTest {

    @Test
    public void testGetDaysRented() {
        assertEquals(10, new Rental(new Movie("", 0), 10).getDaysRented());
    }

    @Test
    public void testGetMovie() {
        Movie movie = new Movie("", 0);
        assertEquals(movie, new Rental(movie, 0).getMovie());
    }

    @Test
    public void testGetMovieNull() {
        Movie movie = null;
        assertEquals(movie, new Rental(movie, 0).getMovie());
    }
}

