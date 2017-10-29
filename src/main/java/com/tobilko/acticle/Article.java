package com.tobilko.acticle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Andrew Tobilko on 10/28/17.
 */
@Entity
public final class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    
}
