package com.cjb;

import com.cjb.interfaces.TestSyncServer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * TestSyncServerUnit
 *
 * @author chengjiangbo@shandiantech.com
 * @version 1.0.0
 * @date 2020/11/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=ConsumerApplication.class)
public class TestSyncServerUnit {
  @Resource(name = "testSyncServiceImpl")
  private TestSyncServer testSyncServer;
  @Test
  public void say(){
    //入参声明
    String paramString = "hmx";
    //出参result接收返回值
    String result = testSyncServer.testSync(paramString);
    //对比出参result与期望的值对比， true期望的对比结果
    Assert.assertEquals(true, "男人".equals(result));
  }


}
