package mapping.test.pro;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@PropertySource("classpath:mail.properties")
public class MappingtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingtestApplication.class, args);
		//String url = "http://localhost:8080/user/sum?num1=90&num2=88"; //RequestMapping get
	/*	String url = "http://localhost:8080/user/sum/90/88"; //getMapping
		RestTemplate rest = new RestTemplate();
		String res = rest.getForObject(url, String.class);
		System.out.println("res : "+res);
		
		
		String urlPost = "http://localhost:8080/user/add";
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("num1",2);
		map.put("num2", 5);
		res = rest.postForObject(urlPost, map, String.class);
		System.out.println("add : "+res);*/
	
	}
}
