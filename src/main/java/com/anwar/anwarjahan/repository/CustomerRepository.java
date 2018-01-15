package com.anwar.anwarjahan.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.anwar.anwarjahan.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}
