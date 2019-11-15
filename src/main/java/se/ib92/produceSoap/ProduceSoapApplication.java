package se.ib92.produceSoap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import se.ib92.produceSoap.wsdl.GetBuildsResponse;

@SpringBootApplication
public class ProduceSoapApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(ProduceSoapApplication.class, args);
	}
	
	@Bean
	CommandLineRunner lookup(BuilderWebService quoteClient) {
		return args -> {
			GetBuildsResponse response = quoteClient.getAllBuilds();
			System.err.println(response.toString());
		};
	}

}
