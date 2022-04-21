package io.github.pauloferrarez.model.repository;

import io.github.pauloferrarez.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
