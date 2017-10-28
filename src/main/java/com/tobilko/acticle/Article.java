package com.tobilko.acticle;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Andrew Tobilko on 10/28/17.
 */
@Entity
@Getter
public final class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

}
