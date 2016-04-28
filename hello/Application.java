package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
//it is testing
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
              return "Hello World! this is new message";
            }
        };
		// it is testingsdfsdfsf
    }

  public static void main(String[] args) {
      ApplicationContext context =  new AnnotationConfigApplicationContext(Application.class);
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();
	  // it is testing
  }
}