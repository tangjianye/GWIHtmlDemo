package com.product.htmldemo;

import android.os.Bundle;

public class MainActivity extends AppWebActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // loadUrl("file:///android_asset/htmlBlue/index.html");
        // loadUrl("file:///android_asset/htmlRed/index.html");
        loadUrl("file:///android_asset/index.html");
    }
}
