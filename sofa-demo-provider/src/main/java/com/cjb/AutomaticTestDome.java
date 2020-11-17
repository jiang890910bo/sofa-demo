package com.cjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * AutomaticTestDome
 *
 * @author chengjiangbo@shandiantech.com
 * @version 1.0.0
 * @date 2020/11/16
 */
@ImportResource
@SpringBootApplication
public class AutomaticTestDome {
  public static void main(String args[]){
    SpringApplication.run(ProviderApplication.class, args);
  }

}
