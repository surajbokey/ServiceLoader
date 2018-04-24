package com.surajbokey.serviceloader.services;

import com.google.auto.service.AutoService;

@AutoService(Service.class)
public class AndroidService implements Service {
  @Override
  public void start() {
    System.out.println("Loading android service");
  }
}
