package io.github.futurewl.site;

import io.github.futurewl.site.entities.ForumPost;
import io.github.futurewl.site.entities.User;
import io.github.futurewl.site.repositories.SearchResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MainService {
    User getUser(String username);

    Page<SearchResult<ForumPost>> search(String query, Pageable pageable);

    void save(ForumPost forumPost);
}
