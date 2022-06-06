package client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.zensar.messageapi.entity.ZensarUser;

public class ClientBasicJWT {

	public static void main(String[] args) {
		
		RestTemplate rt = new RestTemplate();
		
		// 1 Step submit user credential and get the token
		String loginUrl = "http://localhost:8084/api/authenticate";
		
		ZensarUser request = new ZensarUser();
		request.setUserName("zensar");
		request.setPassword("zensar");
		
		String token = rt.postForObject(loginUrl, request, String.class);
		System.out.println(token);
		
		// 2 using this token access secured end points
		String messageUrl = "http://localhost:8084/api/message";
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization","Bearer "+token);
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> exchange = rt.exchange(messageUrl, HttpMethod.GET, entity, String.class);
		System.out.println(exchange.getBody());
		
	}

}