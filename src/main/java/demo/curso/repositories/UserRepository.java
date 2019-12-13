package demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
