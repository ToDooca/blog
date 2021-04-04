package xyz.todooc4.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.todooc4.blog.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
