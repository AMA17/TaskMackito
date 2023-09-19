import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void ManagerTest() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerTestAddOneFilm() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film 4");

        String[] actual = manager.findAll();
        String[] expected = { "Film 4" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerTestFilm() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ManagerTestMaxFilm() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerTestFilms() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] actual = manager.findLast();
        String[] expected = { "Film 3", "Film 2", "Film 1" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ManagerTestMaxFilms() {
        MovieManager manager = new MovieManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");


        String[] actual = manager.findLast();
        String[] expected = { "Film 4", "Film 3", "Film 2", "Film 1" };
        Assertions.assertArrayEquals(expected, actual);
    }

}
