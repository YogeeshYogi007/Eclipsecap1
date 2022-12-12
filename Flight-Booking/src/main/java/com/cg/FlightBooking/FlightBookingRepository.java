package com.cg.FlightBooking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightCustomerBooking,Integer>
{

}
