package com.anwar.anwarjahan.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConfig {
	private static final Logger log = LoggerFactory.getLogger(SpringBootConfig.class);

	public static void main(String[] args) throws Exception {
		log.info("Starting Spring boot......");
		SpringApplication.run(SpringBootConfig.class, args);
	}
	
	/*
	public static void main(String[] args) throws UnknownHostException {
	    SpringApplication app = new SpringApplication(App.class);
	    SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
	    if (!source.containsProperty("spring.profiles.active") &&
	            !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {

	        app.setAdditionalProfiles("production");
	    }
	    ...
	}
	*/

	/*
	 * @Bean public CommandLineRunner demo(CustomerRepository repository) { return
	 * (args) -> { // save a couple of customers repository.save(new
	 * Customer("Jack", "Bauer")); repository.save(new Customer("Chloe",
	 * "O'Brian")); repository.save(new Customer("Kim", "Bauer"));
	 * repository.save(new Customer("David", "Palmer")); repository.save(new
	 * Customer("Michelle", "Dessler"));
	 * 
	 * // fetch all customers log.info("Customers found with findAll():");
	 * log.info("-------------------------------"); for (Customer customer :
	 * repository.findAll()) { log.info(customer.toString()); } log.info("");
	 * 
	 * // fetch an individual customer by ID Customer customer =
	 * repository.findOne(1L); log.info("Customer found with findOne(1L):");
	 * log.info("--------------------------------"); log.info(customer.toString());
	 * log.info("");
	 * 
	 * // fetch customers by last name
	 * log.info("Customer found with findByLastName('Bauer'):");
	 * log.info("--------------------------------------------"); for (Customer bauer
	 * : repository.findByLastName("Bauer")) { log.info(bauer.toString()); }
	 * log.info(""); }; }
	 */

	// mongo Example

	/*
	 * @Autowired private CustomerRepositoryMongo repository;
	 * 
	 * public void run(String... args) throws Exception {
	 * 
	 * repository.deleteAll();
	 * 
	 * // save a couple of customers repository.save(new CustomerMongo("Alice",
	 * "Smith")); repository.save(new CustomerMongo("Bob", "Smith"));
	 * 
	 * // fetch all customers System.out.println("Customers found with findAll():");
	 * System.out.println("-------------------------------"); for (CustomerMongo
	 * customer : repository.findAll()) { System.out.println(customer); }
	 * System.out.println();
	 * 
	 * // fetch an individual customer
	 * System.out.println("Customer found with findByFirstName('Alice'):");
	 * System.out.println("--------------------------------");
	 * System.out.println(repository.findByFirstName("Alice"));
	 * 
	 * System.out.println("Customers found with findByLastName('Smith'):");
	 * System.out.println("--------------------------------"); for (CustomerMongo
	 * customer : repository.findByLastName("Smith")) {
	 * System.out.println(customer); }
	 * 
	 * }
	 */

}
