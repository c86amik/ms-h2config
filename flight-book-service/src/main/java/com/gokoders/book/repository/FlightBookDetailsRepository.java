/**
 * 
 */
package com.gokoders.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gokoders.book.model.FlightBookDetails;

/**
 * @author gokoders
 *
 */
@Repository
public interface FlightBookDetailsRepository extends JpaRepository<FlightBookDetails, Long>{

}
