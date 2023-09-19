public class MovieManager {
    private String[] films = new String[0];
    String[] film = {
            "Film 1",
            "Film 2",
            "Film 3"

    };

    private int limit;

    public MovieManager() {
        this.limit = 3;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;

    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {
        int resoultLenght;
        if (films.length < limit) {
            resoultLenght = films.length;
        } else {
            resoultLenght = limit;
        }
        String[] tmp = new String[resoultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[film.length - 1 - i];
        }
        return tmp;
    }
}
