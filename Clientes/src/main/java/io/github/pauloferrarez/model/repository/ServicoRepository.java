package io.github.pauloferrarez.model.repository;

import io.github.pauloferrarez.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
