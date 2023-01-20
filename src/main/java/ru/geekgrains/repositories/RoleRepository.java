package ru.geekgrains.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekgrains.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
}
