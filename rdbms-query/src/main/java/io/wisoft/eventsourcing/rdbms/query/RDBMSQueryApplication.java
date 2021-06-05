package io.wisoft.eventsourcing.rdbms.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RDBMSQueryApplication {

  public static void main(String[] args) {
    SpringApplication.run(RDBMSQueryApplication.class, args);
  }
}
