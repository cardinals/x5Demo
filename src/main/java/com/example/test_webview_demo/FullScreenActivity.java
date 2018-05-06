package com.example.test_webview_demo;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.PixelFormat;
import android.os.Bundle;
import com.example.test_webview_demo.utils.X5WebView;

public class FullScreenActivity extends Activity {

	/**
	 * 用于演示X5webview实现视频的全屏播放功能 其中注意 X5的默认全屏方式 与 android 系统的全屏方式
	 */

	X5WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.filechooser_layout);
		webView = (X5WebView) findViewById(R.id.web_filechooser);
		webView.loadUrl("file:///android_asset/webpage/fullscreenVideo.html");

		getWindow().setFormat(PixelFormat.TRANSLUCENT);

	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		try {
			super.onConfigurationChanged(newConfig);
			if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {

			} else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
