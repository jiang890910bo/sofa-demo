package com.cjb.impl;

import com.cjb.interfaces.TestSyncServer;

/**
 * TestSyncServerImpl
 *
 * @author chengjiangbo@shandiantech.com
 * @version 1.0.0
 * @date 2020/11/16
 */
public class TestSyncServerImpl implements TestSyncServer {
  @Override
  public String testSync(String paramString) {
//    return "provider tell you : this is your say: " +  string;
    if(paramString.equals("hmx")) {
      return "女人";
    }else if(paramString.equals("cjb")) {
      return "男人";
    }

    return "人妖";
  }
}
