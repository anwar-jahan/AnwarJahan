package com.anwar.anwarjahan.repository; 

import java.util.List;
import com.anwar.anwarjahan.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}
