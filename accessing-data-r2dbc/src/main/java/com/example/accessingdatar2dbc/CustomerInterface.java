package com.example.accessingdatar2dbc;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerInterface extends
ReactiveCrudRepository<Customer, Long> {

	
	
}
