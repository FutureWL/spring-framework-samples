package io.github.futurewl.site;

import io.github.futurewl.site.entity.Discussion;

import java.util.List;

public interface DiscussionService {
    List<Discussion> getAllDiscussions();

    Discussion getDiscussion(long id);

    void saveDiscussion(Discussion discussion);
}
