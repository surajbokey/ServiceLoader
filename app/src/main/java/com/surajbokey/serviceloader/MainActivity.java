package com.surajbokey.serviceloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.surajbokey.serviceloader.services.Service;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView tv = findViewById(R.id.serviceTextView);
    tv.setText("Check logcat with filter \"System.out\""
        + "\nOR"
        + "\nRun CustomServiceLoader");

    // See the output in logcat
    ServiceLoader<Service> services = ServiceLoader.load(Service.class);
    for (Service service : services) {
      service.start();
    }
  }
}
