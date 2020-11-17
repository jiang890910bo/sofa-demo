package com.cjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * com.cjb.ProviderApplication
 *
 * @author chengjiangbo@shandiantech.com
 * @version 1.0.0
 * @date 2020/11/16
 */
@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@SpringBootApplication
public class ProviderApplication {

  public static void main(String[] args) {
    //指定ProviderApplication，表示该应用的启动类是它。
    SpringApplication.run(ProviderApplication.class, args);
  }
}
