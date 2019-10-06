package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.Resume;
import org.springframework.data.repository.CrudRepository;

public interface ResumeRepository extends CrudRepository<Resume, Long> {
}
