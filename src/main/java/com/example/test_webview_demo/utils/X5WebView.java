package com.example.test_webview_demo.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.TextView;

import com.example.test_webview_demo.R;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.MediaAccessPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebSettings.LayoutAlgorithm;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import java.util.HashMap;

public class X5WebView extends WebView {
	private ActionMode mActionMode;
	private String[] mMenuTitls = new String[] {"Menu1", "Menu2"};
	private WebViewClient client = new WebViewClient() {
		/**
		 * 防止加载网页时调起系统浏览器
		 */
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	};



	@SuppressLint("SetJavaScriptEnabled")
	public X5WebView(Context arg0, AttributeSet arg1) {
		super(arg0, arg1);
		this.setWebViewClient(client);
		// this.setWebChromeClient(chromeClient);
		// WebStorage webStorage = WebStorage.getInstance();
		initWebViewSettings();
		this.getView().setClickable(false);


		setWebViewClientExtension(new IX5WebViewClientExtension() {
			@Override
			public void onMissingPluginClicked(String s, String s1, String s2, int i) {

			}

			@Override
			public void onHideListBox() {

			}

			@Override
			public void onShowListBox(String[] strings, int[] ints, int[] ints1, int i) {

			}

			@Override
			public void onShowMutilListBox(String[] strings, int[] ints, int[] ints1, int[] ints2) {

			}

			@Override
			public void onFlingScrollBegin(int i, int i1, int i2) {

			}

			@Override
			public void onScrollChanged(int i, int i1, int i2, int i3) {

			}

			@Override
			public void onInputBoxTextChanged(IX5WebViewExtension ix5WebViewExtension, String s) {

			}

			@Override
			public void onTransitionToCommitted() {

			}

			@Override
			public void onUploadProgressStart(int i) {

			}

			@Override
			public void onUploadProgressChange(int i, int i1, String s) {

			}

			@Override
			public void onSoftKeyBoardShow() {

			}

			@Override
			public void onSoftKeyBoardHide(int i) {

			}

			@Override
			public void onSetButtonStatus(boolean b, boolean b1) {

			}

			@Override
			public void onHistoryItemChanged() {

			}

			@Override
			public void hideAddressBar() {

			}

			@Override
			public void handlePluginTag(String s, String s1, boolean b, String s2) {

			}

			@Override
			public void onDoubleTapStart() {

			}

			@Override
			public void onPinchToZoomStart() {

			}

			@Override
			public void onSlidingTitleOffScreen(int i, int i1) {

			}

			@Override
			public boolean preShouldOverrideUrlLoading(IX5WebViewExtension ix5WebViewExtension,
				String s) {
				return false;
			}

			@Override
			public void onPreReadFinished() {

			}

			@Override
			public void onPromptScaleSaved() {

			}

			@Override
			public void onFlingScrollEnd() {

			}

			@Override
			public void onUrlChange(String s, String s1) {

			}

			@Override
			public void onReportAdFilterInfo(int i, int i1, String s, boolean b) {

			}

			@Override
			public void onNativeCrashReport(int i, String s) {

			}

			@Override
			public Object onMiscCallBack(String s, Bundle bundle) {
				return null;
			}

			@Override
			public void onReportHtmlInfo(int i, String s) {

			}

			@Override
			public Object onMiscCallBack(String s, Bundle bundle, Object o, Object o1, Object o2,
				Object o3) {
				return null;
			}

			@Override
			public boolean onInterceptTouchEvent(MotionEvent motionEvent, View view) {
				return false;
			}

			@Override
			public boolean onTouchEvent(MotionEvent motionEvent, View view) {
				return false;
			}

			@Override
			public boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
				return false;
			}

			@Override
			public boolean overScrollBy(int i, int i1, int i2, int i3, int i4, int i5, int i6,
				int i7, boolean b, View view) {
				return false;
			}

			@Override
			public void onScrollChanged(int i, int i1, int i2, int i3, View view) {

			}

			@Override
			public void onOverScrolled(int i, int i1, boolean b, boolean b1, View view) {

			}

			@Override
			public void computeScroll(View view) {

			}

			@Override
			public void onMetricsSavedCountReceived(String s, boolean b, long l, String s1, int i) {

			}

			@Override
			public void showTranslateBubble(int i, String s, String s1, int i1) {

			}

			@Override
			public boolean notifyAutoAudioPlay(String s, JsResult jsResult) {
				return false;
			}

			@Override
			public boolean onShowLongClickPopupMenu() {
				return false;
			}

			@Override
			public void onResponseReceived(WebResourceRequest webResourceRequest,
				WebResourceResponse webResourceResponse, int i) {
			}

			@Override
			public boolean allowJavaScriptOpenWindowAutomatically(String s, String s1) {
				return false;
			}

			@Override
			public boolean notifyJavaScriptOpenWindowsBlocked(String s, String[] strings,
				ValueCallback<Boolean> valueCallback, boolean b) {
				return false;
			}

			@Override
			public void documentAvailableInMainFrame() {

			}

			@Override
			public void didFirstVisuallyNonEmptyPaint() {

			}

			@Override
			public void onReceivedViewSource(String s) {

			}

			@Override
			public void onPrefetchResourceHit(boolean b) {

			}

			@Override
			public void onReceivedSslErrorCancel() {

			}
		});

		this.setWebChromeClientExtension(new IX5WebChromeClientExtension() {
			@Override
			public Object getX5WebChromeClientInstance() {
				return null;
			}

			@Override
			public View getVideoLoadingProgressView() {
				return null;
			}

			@Override
			public void onAllMetaDataFinished(IX5WebViewExtension ix5WebViewExtension,
				HashMap<String, String> hashMap) {

			}

			@Override
			public void onBackforwardFinished(int i) {

			}

			@Override
			public void onHitTestResultForPluginFinished(IX5WebViewExtension ix5WebViewExtension,
				IX5WebViewBase.HitTestResult hitTestResult, Bundle bundle) {

			}

			@Override
			public void onHitTestResultFinished(IX5WebViewExtension ix5WebViewExtension,
				IX5WebViewBase.HitTestResult hitTestResult) {

			}

			@Override
			public void onPromptScaleSaved(IX5WebViewExtension ix5WebViewExtension) {

			}

			@Override
			public void onPromptNotScalable(IX5WebViewExtension ix5WebViewExtension) {

			}

			@Override
			public boolean onAddFavorite(IX5WebViewExtension ix5WebViewExtension, String s,
				String s1, JsResult jsResult) {
				return false;
			}

			@Override
			public void onPrepareX5ReadPageDataFinished(IX5WebViewExtension ix5WebViewExtension,
				HashMap<String, String> hashMap) {

			}

			@Override
			public boolean onSavePassword(String s, String s1, String s2, boolean b,
				Message message) {
				return false;
			}

			@Override
			public boolean onSavePassword(ValueCallback<String> valueCallback, String s, String s1,
				String s2, String s3, String s4, boolean b) {
				return false;
			}

			@Override
			public void onX5ReadModeAvailableChecked(HashMap<String, String> hashMap) {

			}

			@Override
			public void addFlashView(View view, ViewGroup.LayoutParams layoutParams) {

			}

			@Override
			public void h5videoRequestFullScreen(String s) {

			}

			@Override
			public void h5videoExitFullScreen(String s) {

			}

			@Override
			public void requestFullScreenFlash() {

			}

			@Override
			public void exitFullScreenFlash() {

			}

			@Override
			public void jsRequestFullScreen() {

			}

			@Override
			public void jsExitFullScreen() {

			}

			@Override
			public void acquireWakeLock() {

			}

			@Override
			public void releaseWakeLock() {

			}

			@Override
			public Context getApplicationContex() {
				return null;
			}

			@Override
			public boolean onPageNotResponding(Runnable runnable) {
				return false;
			}

			@Override
			public Object onMiscCallBack(String s, Bundle bundle) {
				return null;
			}

			@Override
			public void openFileChooser(ValueCallback<Uri[]> valueCallback, String s, String s1) {

			}

			@Override
			public void onPrintPage() {

			}

			@Override
			public void onColorModeChanged(long l) {

			}

			@Override
			public boolean onPermissionRequest(String s, long l,
				MediaAccessPermissionsCallback mediaAccessPermissionsCallback) {
				return false;
			}
		});
		//this.setOnLongClickListener(new OnLongClickListener() {
		//	@Override
		//	public boolean onLongClick(View v) {
		//		startActionMode(new ActionMode.Callback() {
		//			@Override
		//			public boolean onCreateActionMode(ActionMode mode, Menu menu) {
		//				MenuInflater inflater = mode.getMenuInflater();
		//				inflater.inflate(R.menu.actionmode, menu);
		//				return true;
		//			}
        //
		//			@Override
		//			public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
		//				return false;
		//			}
        //
		//			@Override
		//			public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
		//				boolean ret = false;
		//				if (item.getItemId() == R.id.actionmode_cancel) {
		//					mode.finish();
		//					ret = true;
		//				}
		//				return ret;
		//			}
        //
		//			@Override
		//			public void onDestroyActionMode(ActionMode mode) {
        //
		//			}
		//		});
		//		return true;
		//	}
		//});
	}

	@Override
	public ActionMode startActionMode(ActionMode.Callback callback) {
		mActionMode = super.startActionMode(callback);
		return resolveActionMode(mActionMode);
	}

	@Override
	public ActionMode startActionMode(ActionMode.Callback callback, int type) {
		mActionMode = super.startActionMode(callback, type);
		return resolveActionMode(mActionMode);
	}


	private ActionMode resolveActionMode(ActionMode actionMode) {
		Log.e("msg", "resolveActionMode");
		final Menu menu = actionMode.getMenu();
		for (String model : mMenuTitls) {
			Log.d("msg", "resolveActionMode: model=" + model);
			MenuItem item = menu.add(model);
			item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					Log.d("msg", "resolveActionMode: model=" + item.getTitle());
					return false;
				}
			});
		}
		return actionMode;
	}

	private void initWebViewSettings() {
		WebSettings webSetting = this.getSettings();
		webSetting.setJavaScriptEnabled(true);
		webSetting.setJavaScriptCanOpenWindowsAutomatically(true);
		webSetting.setAllowFileAccess(true);
		webSetting.setLayoutAlgorithm(LayoutAlgorithm.NARROW_COLUMNS);
		webSetting.setSupportZoom(true);
		webSetting.setBuiltInZoomControls(true);
		webSetting.setUseWideViewPort(true);
		webSetting.setSupportMultipleWindows(true);
		// webSetting.setLoadWithOverviewMode(true);
		webSetting.setAppCacheEnabled(true);
		// webSetting.setDatabaseEnabled(true);
		webSetting.setDomStorageEnabled(true);
		webSetting.setGeolocationEnabled(true);
		webSetting.setAppCacheMaxSize(Long.MAX_VALUE);
		// webSetting.setPageCacheCapacity(IX5WebSettings.DEFAULT_CACHE_CAPACITY);
		webSetting.setPluginState(WebSettings.PluginState.ON_DEMAND);
		// webSetting.setRenderPriority(WebSettings.RenderPriority.HIGH);
		webSetting.setCacheMode(WebSettings.LOAD_NO_CACHE);

		// this.getSettingsExtension().setPageCacheCapacity(IX5WebSettings.DEFAULT_CACHE_CAPACITY);//extension
		// settings 的设计
	}

	@Override
	protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
		boolean ret = super.drawChild(canvas, child, drawingTime);
		canvas.save();
		Paint paint = new Paint();
		paint.setColor(0x7fff0000);
		paint.setTextSize(24.f);
		paint.setAntiAlias(true);
		if (getX5WebViewExtension() != null) {
			canvas.drawText(this.getContext().getPackageName() + "-pid:"
					+ android.os.Process.myPid(), 10, 50, paint);
			canvas.drawText(
					"X5  Core:" + QbSdk.getTbsVersion(this.getContext()), 10,
					100, paint);
		} else {
			canvas.drawText(this.getContext().getPackageName() + "-pid:"
					+ android.os.Process.myPid(), 10, 50, paint);
			canvas.drawText("Sys Core", 10, 100, paint);
		}
		canvas.drawText(Build.MANUFACTURER, 10, 150, paint);
		canvas.drawText(Build.MODEL, 10, 200, paint);
		canvas.restore();
		return ret;
	}

	public X5WebView(Context arg0) {
		super(arg0);
		setBackgroundColor(85621);
	}

}
