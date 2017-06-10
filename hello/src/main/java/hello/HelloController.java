package hello;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Configuration
@EnableAutoConfiguration
@RestController
@EnableDiscoveryClient
public class HelloController {
	
	@Value("${hello}")
	 private String  hello="hello";

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!" + " "+hello + " from github by jenkins!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}