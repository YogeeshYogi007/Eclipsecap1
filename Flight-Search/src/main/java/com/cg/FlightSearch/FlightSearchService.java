package com.cg.FlightSearch;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class FlightSearchService 
{
	 @Autowired
	 private FlightSearchRepository repository;
		public List<FlightSearch> listAll() 
		{
			
			return repository.findAll();
		}
		public FlightSearch get(Integer id) 
		{
		
			return repository.findById(id).get();
		}
		public void save(FlightSearch flightSearch) 
		{
			
			 repository.save(flightSearch);
		}
		public void delete(Integer id) 
		{
			repository.deleteById(id);
			
		}

	}
