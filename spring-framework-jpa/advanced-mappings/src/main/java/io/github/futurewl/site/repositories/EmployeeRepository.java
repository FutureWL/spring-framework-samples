package io.github.futurewl.site.repositories;

import io.github.futurewl.site.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
