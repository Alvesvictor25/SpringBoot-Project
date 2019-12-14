package demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
