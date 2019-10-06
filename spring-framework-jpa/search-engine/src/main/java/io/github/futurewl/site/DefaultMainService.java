package io.github.futurewl.site;

import io.github.futurewl.site.entities.ForumPost;
import io.github.futurewl.site.entities.User;
import io.github.futurewl.site.repositories.ForumPostRepository;
import io.github.futurewl.site.repositories.SearchResult;
import io.github.futurewl.site.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service
public class DefaultMainService implements MainService {
    @Inject
    UserRepository userRepository;
    @Inject
    ForumPostRepository forumPostRepository;

    @Override
    @Transactional
    public User getUser(String username) {
        return this.userRepository.getByUsername(username);
    }

    @Override
    @Transactional
    public Page<SearchResult<ForumPost>> search(String query, Pageable pageable) {
        return this.forumPostRepository.search(query, pageable);
    }

    @Override
    @Transactional
    public void save(ForumPost forumPost) {
        this.forumPostRepository.save(forumPost);
    }
}
