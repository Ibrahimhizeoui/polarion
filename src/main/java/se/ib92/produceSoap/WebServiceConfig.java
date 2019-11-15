package se.ib92.produceSoap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WebServiceConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("se.ib92.produceSoap.wsdl");
		return marshaller;
	}

	@Bean
	public BuilderWebService builderWebServiceConfig(Jaxb2Marshaller marshaller) {
		BuilderWebService client = new BuilderWebService();
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
