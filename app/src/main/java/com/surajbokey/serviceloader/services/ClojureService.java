package com.surajbokey.serviceloader.services;

import com.google.auto.service.AutoService;

@AutoService(Service.class)
public class ClojureService implements Service {
  @Override
  public void start() {
    System.out.println("Loading clojure service");
  }
}
