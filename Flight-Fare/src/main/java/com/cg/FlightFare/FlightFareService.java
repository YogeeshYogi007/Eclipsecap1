package com.cg.FlightFare;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class FlightFareService 
{
	 @Autowired
	 private FlightFareRepository repository;
		public List<FlightFare> listAll() 
		{
			
			return repository.findAll();
		}
		public FlightFare get(Integer id) 
		{
		
			return repository.findById(id).get();
		}
		public void save(FlightFare flightFare) 
		{
			
			 repository.save(flightFare);
		}
		public void delete(Integer id) 
		{
			repository.deleteById(id);
			
		}

	}
