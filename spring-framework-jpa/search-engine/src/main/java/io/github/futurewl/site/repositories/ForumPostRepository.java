package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.ForumPost;
import org.springframework.data.repository.CrudRepository;

public interface ForumPostRepository extends CrudRepository<ForumPost, Long>,
        SearchableRepository<ForumPost> {
}
