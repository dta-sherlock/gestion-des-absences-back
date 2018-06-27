package dev.repository;

import dev.entity.Rtt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RttRepository extends JpaRepository<Rtt, Integer> {

    @Query("select r from Rtt r where YEAR(r.date) = ?1")
    List<Rtt> findAllByYearsDate(int annee);

    @Query("select distinct YEAR(r.date) from Rtt r order by r.date")
    List<Integer> findAllYears();
}
