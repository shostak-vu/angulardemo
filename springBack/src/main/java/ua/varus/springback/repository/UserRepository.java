package ua.varus.springback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.varus.springback.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
