package com.tobilko.acticle;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Andrew Tobilko on 10/28/17.
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {}
