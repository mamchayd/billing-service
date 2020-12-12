package ma.enset;

import java.util.Collection;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import ma.enset.entity.Bill;
import ma.enset.feign.CustomerRestClient;
import ma.enset.feign.ProductItemRestClient;
import ma.enset.model.Customer;
import ma.enset.repository.BillRepository;
import ma.enset.repository.ProductItemRepository;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(
			BillRepository billRepository,
			ProductItemRepository productItemRepository,
			CustomerRestClient customerRestClient,
			ProductItemRestClient productItemRestClient
	){
		return args -> {
			Customer customer = customerRestClient.getCustomerById(1L);
			System.out.println("-------------------------------------");
			System.out.println(customer.getId());
			System.out.println(customer.getName());
			System.out.println(customer.getEmail());
		};
	}

	
}
