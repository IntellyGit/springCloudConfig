package intellynet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Env;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;



@SpringBootApplication
public class App {

  static final Logger logger = LoggerFactory.getLogger(App.class);

  
  private static Environment env;    

  @Autowired
  public App(Environment env){
    App.env=env;
  }
  
  
    
  public static void main(final String[] args) {
    SpringApplication.run(App.class, args);

  
    logger.info("property1 " + env.getProperty("property1"));
  }

 
  
}





            



  


