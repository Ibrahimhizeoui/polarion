package se.ib92.produceSoap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import se.ib92.produceSoap.wsdl.GetBuilds;
import se.ib92.produceSoap.wsdl.GetBuildsResponse;
import se.ib92.produceSoap.wsdl.Project;


public class BuilderWebService extends WebServiceGatewaySupport{
	
	public GetBuildsResponse getAllBuilds () {
		
		GetBuilds request = new GetBuilds();
		Project project = new Project();
		request.setProject(project);
		GetBuildsResponse response = (GetBuildsResponse) getWebServiceTemplate()
				.marshalSendAndReceive("https://almdemo.polarion.com/polarion/ws/services/BuilderWebService", request);
		System.out.print(response.toString());
		return response;
	}
	
}
