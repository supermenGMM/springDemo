package com.mm.autowire;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {
    public void save() {
        System.out.println("movieDao save"+this);
    }
}
