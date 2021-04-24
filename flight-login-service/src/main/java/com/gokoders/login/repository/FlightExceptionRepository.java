/**
 * 
 */
package com.gokoders.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokoders.login.exception.FlightException;

/**
 * @author gokoders
 *
 */
public interface FlightExceptionRepository  extends JpaRepository<FlightException, Long>{
	
	public FlightException findByUserName(String userName);

}
