package com.mm.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private MovieDao movieDao;

    @Required
    @Autowired
    public void setMovieDao( MovieDao movieDao) {
        this.movieDao = movieDao;
    }

  /*  @Autowired(required = true)
    public MovieService(MovieDao movieDao) {
        this.movieDao = movieDao;
    }*/

    public void save() {
        movieDao.save();
    }
}

