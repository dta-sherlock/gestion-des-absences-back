package dev.repository;

import dev.entity.Ferie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FerieRepository extends JpaRepository<Ferie, Integer> {

    @Query("select f from Ferie f where YEAR(f.date) = ?1")
    List<Ferie> findAllByYearsDate(int annee);

    @Query("select distinct YEAR(f.date) from Ferie f order by f.date")
    List<Integer> findAllYears();
}
