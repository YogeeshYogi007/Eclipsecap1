package com.cg.FlightCustomerRegistration;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FlightCustomerRepository extends JpaRepository<FlightCustomer, Integer> 
{

	Optional<FlightCustomer> findByFirstname(String firstname);

}
