package com.unicam.projectzanncald.controller.Repository;

import com.unicam.projectzanncald.model.content.Itinerary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ItineraryRepository extends JpaRepository<Itinerary,Integer> {

    @Query("SELECT i FROM Itinerary i WHERE i.name = :title")
    Optional<Itinerary> findByDescription(@Param("title") String title);

    @Query("SELECT i FROM Itinerary i")
    List<Itinerary> findAllItineraries();

}
