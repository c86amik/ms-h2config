/**
 * 
 */
package com.gokoders.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gokoders.registration.model.UserRegistration;

/**
 * @author gokoders
 *
 */
@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long>{
	
	public UserRegistration findByUserName(String userName);

}
