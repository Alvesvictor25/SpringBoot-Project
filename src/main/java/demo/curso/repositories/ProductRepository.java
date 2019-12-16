package demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
