package com.product.htmldemo;

import android.os.Bundle;

public class MainActivity extends AppWebActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // loadUrl("file:///android_asset/htmlBlue/index.html");
        // loadUrl("file:///android_asset/htmlRed/index.html");
        // loadUrl("file:///android_asset/index.html");


        // loadUrl("http://www.baidu.com/");

        // 浏览器打开本地文件
//        Intent intent= new Intent();
//        intent.setAction("android.intent.action.VIEW");
//        // Uri content_url = Uri.parse("file:///sdcard/QieZi/files/assets/index.html");
//        Uri content_url = Uri.parse("file:///sdcard/assets/TEST/index.html");
//        intent.setData(content_url);
//        intent.setClassName("com.tencent.mtt", "com.tencent.mtt.MainActivity");
//        // intent.setClassName("com.android.browser","com.android.browser.BrowserActivity");
//        startActivity(intent);

        loadUrl("file:///android_asset/TEST/index.html");
    }
}
