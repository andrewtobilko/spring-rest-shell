package com.tobilko.acticle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

/**
 * Created by Andrew Tobilko on 10/28/17.
 */
@RepositoryRestResource(
        path = "articles",
        collectionResourceRel = "articles",
        itemResourceRel = "article"
)
public interface ArticleRepository extends CrudRepository<Article, Long> {

    Optional<Article> findByTitle(@Param("title") String title);

}
