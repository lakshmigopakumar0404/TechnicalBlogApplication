package upgrad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan
public class HelloWorld {

    public static void main(String[] args){
        //to start springboot ie like main to give springboot an entry point
        SpringApplication.run(HelloWorld.class,args);

    }
}
