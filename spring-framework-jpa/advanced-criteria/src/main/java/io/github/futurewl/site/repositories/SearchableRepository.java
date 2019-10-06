package io.github.futurewl.site.repositories;

import io.github.futurewl.site.SearchCriteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SearchableRepository<T> {
    Page<T> search(SearchCriteria searchCriteria, Pageable pageable);
}
