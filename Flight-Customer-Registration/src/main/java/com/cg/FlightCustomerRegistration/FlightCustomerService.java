package com.cg.FlightCustomerRegistration;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class FlightCustomerService 
{
	 @Autowired
	 private FlightCustomerRepository repository;
		public List<FlightCustomer> listAll() 
		{
			
			return repository.findAll();
		}
		public FlightCustomer get(Integer id) 
		{
		
			return repository.findById(id).get();
		}
		public void save(FlightCustomer flightCustomer) 
		{
			
			 repository.save(flightCustomer);
		}
		public void delete(Integer id) 
		{
			repository.deleteById(id);
			
		}

	}
