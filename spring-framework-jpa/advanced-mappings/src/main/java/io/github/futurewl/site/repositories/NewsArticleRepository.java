package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.NewsArticle;
import org.springframework.data.repository.CrudRepository;

public interface NewsArticleRepository extends CrudRepository<NewsArticle, Long> {
}
