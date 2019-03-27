package com.yar.threading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {

    public static HashMap<String, List<String>> getData(){
        HashMap<String, List<String>> moviesData = new HashMap<String, List<String>>();

        List<String> actionMovies = new ArrayList<String>();
        actionMovies.add("movie action 1");
        actionMovies.add("movie action 2");
        actionMovies.add("movie action 3");
        actionMovies.add("movie action 4");
        actionMovies.add("movie action 5");
        actionMovies.add("movie action 6");

        List<String> romanceMovies = new ArrayList<String>();
        romanceMovies.add("movie romance 1");
        romanceMovies.add("movie r 2");
        romanceMovies.add("movie r 3");
        romanceMovies.add("movie romance 4");
        romanceMovies.add("movie r 5");

        List<String> horrorMovies = new ArrayList<String>();
        horrorMovies.add("movie horror 1");
        horrorMovies.add("movie horror 2");
        horrorMovies.add("movie horror 3");
        horrorMovies.add("movie 4");

        List<String> comedyMovies = new ArrayList<String>();
        comedyMovies.add("c 1");
        comedyMovies.add("comedy 2");
        comedyMovies.add("c 3");
        comedyMovies.add("comedy 4");

        moviesData.put("Action Movies", actionMovies);
        moviesData.put("Romance Movies", romanceMovies);
        moviesData.put("Horror Movies", horrorMovies);
        moviesData.put("Comedy Movies", comedyMovies);

        return moviesData;
    }

}
