package netology.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void addingInListOfMovies() {  //добавление в список фильмов
        Manager manager = new Manager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");


        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingOneMovie() {  // Добавление одного филма
        Manager manager = new Manager();

        manager.add("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void dontAddMovie() {  // Не добавлять фильм
        Manager manager = new Manager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseMovieList() {  // Обратный список фильмов
        Manager manager = new Manager();

        manager.add("Film 5");
        manager.add("Film 4");
        manager.add("Film 3");
        manager.add("Film 2");
        manager.add("Film 1");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseListFromThreeMovies() { // добавление трех фильмов
        Manager manager = new Manager();

        manager.add("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseListOfZeroMovies() { //добавление ноль
        Manager manager = new Manager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseListOfSixMovies() {
        Manager manager = new Manager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingInListOfFiveMovies() {  //добавление в список фильмов 5
        Manager manager = new Manager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5",};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingInListOfSixMovies() {  //добавление в список фильмов 6
        Manager manager = new Manager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}




