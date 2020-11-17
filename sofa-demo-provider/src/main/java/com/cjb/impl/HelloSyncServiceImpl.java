package com.cjb.impl;

import com.cjb.interfaces.HelloSyncService;

/**
 * HelloSyncServiceImpl
 *
 * @author chengjiangbo@shandiantech.com
 * @version 1.0.0
 * @date 2020/11/16
 */
public class HelloSyncServiceImpl implements HelloSyncService {

  @Override
  public String saySync(String string) {
    return "provider tell you : this is your say: " +  string;
  }
}
