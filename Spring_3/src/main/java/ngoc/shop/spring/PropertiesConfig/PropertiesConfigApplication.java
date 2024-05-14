package ngoc.shop.spring.PropertiesConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PropertiesConfigApplication {

	@Value("${ngoc.ten}")
	private String ten;
	@Value("${ngoc.tuoi}")
	private String tuoi;
	@Value("${ngoc.gmail}")
	private String gmail;


	public static void main(String[] args) {
		SpringApplication.run(PropertiesConfigApplication.class, args);
	}


	@GetMapping("/")
	public String info(){
		return "Tên: " + ten + "\n"+
				"tuổi: " + tuoi + "\n"+
				"gmail: " + gmail ;
	}
	@GetMapping("/hj")
	public String inddex(){
		return "msda";
	}

}
