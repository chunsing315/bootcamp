package com.bootcamp.demo_sb_calculator.model.sm2;
import java.util.List;
import java.time.LocalDate;

public class ShoppingMall {
    String name;
    int area;
    Cinema cinema;
    List<String> shopcategory;

    static class Cinema {
        String name;
        LocalDate openedDate;
        List<ReleasedFilms> releasedFilms;

        static class ReleasedFilms {
            String name;
            LocalDate releaseDate;
        }
    }
}
