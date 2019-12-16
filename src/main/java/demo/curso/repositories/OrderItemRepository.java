package demo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
