package th.ku.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/greeting"})
public class HelloService {

        @GetMapping("/hello") //request data from web server
        public String hello(){
            return "<html><h1>Hello World</h1></html>";
        }

        @GetMapping("/hi") //sent data from user to web server
        public String hi(){
            return "Hi";
        }
}

