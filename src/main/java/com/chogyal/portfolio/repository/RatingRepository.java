package com.chogyal.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chogyal.portfolio.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

    @Query("SELECT AVG(r.stars) FROM Rating r")
    Double findAverageRating();

    @Query("SELECT COUNT(r) FROM Rating r")
    Long countTotalRatings();
    
    @Query(value = "SELECT AVG(stars) AS average_rating FROM rating;\n", nativeQuery = true)
    int averageRating();
}
