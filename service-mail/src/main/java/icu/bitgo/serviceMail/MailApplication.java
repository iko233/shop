package icu.bitgo.serviceMail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDiscoveryClient
public class MailApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(MailApplication.class,args);
        new CountDownLatch(1).await();
    }

}
