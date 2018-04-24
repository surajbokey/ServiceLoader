package com.surajbokey.serviceloader;

import com.surajbokey.serviceloader.services.Service;
import java.util.ServiceLoader;

public class CustomServiceLoader {
  public static void main(String[] args) {
    ServiceLoader<Service> services = ServiceLoader.load(Service.class);
    for (Service service : services) {
      service.start();
    }
  }
}
