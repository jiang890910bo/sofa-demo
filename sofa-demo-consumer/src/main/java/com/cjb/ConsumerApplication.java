package com.cjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:rpc-sofa-boot-starter-samples.xml"})
@SpringBootApplication
public class ConsumerApplication {

  public static void main(String[] args) {
    //springBoot的启动类,调用run(...)方法启动项目
    SpringApplication springApplication = new SpringApplication(ConsumerApplication.class);
    //bean容器
    ApplicationContext applicationContext = springApplication.run(args);

//    HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
//      //根据xml里面的bean的id找到需要调用的接口
//      .getBean("helloSyncServiceReference");
//
//    System.out.println(helloSyncServiceReference.saySync("hmx"));
  }
}
