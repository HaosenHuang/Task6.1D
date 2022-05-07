package com.example.trucksharingapp;

import android.app.Application;

import com.tencent.mmkv.MMKV;

/**
 * com.example.trucksharingapp
 * 2022/5/4
 *
 * @author Created on {DATE}
 * Major Function：<b></b>
 * @author mender，Modified Date Modify Content:
 */
public class MyApplication extends Application {
  private static Application sInstance;
  public static Application getInstance() {
    if (sInstance == null) {
      throw new NullPointerException("please inherit BaseApplication or call setApplication.");
    }
    return sInstance;
  }
  @Override
  public void onCreate() {
    super.onCreate();
    sInstance = this;
    MMKV.initialize(this);
  }
}
