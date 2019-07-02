package com.whu.zengbin.fluttercanvas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    FlutterView view = Flutter.createView(this, getLifecycle(), "new_page");
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
        FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT
    );
    addContentView(view, layoutParams);
  }
}
