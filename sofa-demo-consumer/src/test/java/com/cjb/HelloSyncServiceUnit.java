package com.cjb;

import com.cjb.interfaces.HelloSyncService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * HelloSyncServiceUnit
 *
 * @author chengjiangbo@shandiantech.com
 * @version 1.0.0
 * @date 2020/11/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=ConsumerApplication.class)
public class HelloSyncServiceUnit {

  @Resource(name = "helloSyncServiceImpl")
  private HelloSyncService helloSyncService;

  @Test
  public void say(){
    System.out.println(helloSyncService.saySync("hmx"));
  }
}
