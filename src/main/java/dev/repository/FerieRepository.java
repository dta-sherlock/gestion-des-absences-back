package dev.repository;

import dev.entity.Ferie;
import dev.entity.Rtt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FerieRepository extends JpaRepository<Ferie, Integer> {
}
