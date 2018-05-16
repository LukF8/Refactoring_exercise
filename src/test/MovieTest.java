package test;

import org.junit.Test;

import main.Movie;

import static org.junit.Assert.*;

/**
 * Created by D067833 on 04.05.2018.
 */
public class MovieTest {

    @Test
    public void testMovieConstructorTitle(){
        String title = "Leonard unter Palmen";
        assertEquals(title, new Movie(title, 0).getTitle());
    }

    @Test
    public void testMovieConstructorPrizeCodeCildren(){
        assertEquals(Movie.CHILDRENS, new Movie("", (Movie.CHILDRENS)).getPriceCode());
    }

    @Test
    public void testMovieConstructorGetPrizeCodeNewRelease(){
        assertEquals(Movie.NEW_RELEASE, new Movie("", (Movie.NEW_RELEASE)).getPriceCode());
    }

    @Test
    public void testMovieConstructorGetPrizeCodeRegular(){
        assertEquals(Movie.REGULAR, new Movie("", (Movie.REGULAR)).getPriceCode());
    }

    @Test
    public void testMovieConstructorSetPrizeCodeRegular(){
        Movie movie = new Movie("", (Movie.REGULAR));
        movie.setPriceCode(Movie.CHILDRENS);
        assertEquals(Movie.CHILDRENS, movie.getPriceCode());
    }
}
