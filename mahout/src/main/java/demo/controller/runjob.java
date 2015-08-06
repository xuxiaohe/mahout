package demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Component
@EnableScheduling
public class runjob {

//	@Scheduled(cron = "2 * * * * ?")
//	public void callbackService(){
//		System.out.println("=======================开始======");
//		String url = "http://127.0.0.1:8080/dry/init";
//		String url2 = "http://127.0.0.1:8080/dry/findAllDry";
//		RestTemplate restTemplate = new RestTemplate();
//		String a=restTemplate.postForObject(url, null, String.class,"");
//		String b=restTemplate.postForObject(url2, null, String.class,"");
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("=======================结束======");
//	}
}
