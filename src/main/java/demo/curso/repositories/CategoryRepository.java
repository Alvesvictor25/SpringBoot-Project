package demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
