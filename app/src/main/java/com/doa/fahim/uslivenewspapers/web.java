package com.doa.fahim.uslivenewspapers;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.support.v7.app.ActionBar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class web extends AppCompatActivity implements RewardedVideoAdListener {
    String string;
    WebView webView;
    NavigationView navigationView;
    String s;
    Toolbar toolbar;
    AdView adView;
    AdRequest adRequest;
    DrawerLayout drawerLayout;
    private RewardedVideoAd mRewardedVideoAd;
    private boolean doubleBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_web);


      MobileAds.initialize(this, "ca-app-pub-6013605396446078/1389831816");
      //  adView = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
      //  adView.loadAd(adRequest);

        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadrevieo();


        final ListView listView;
        final String[] paperlist;
        final ArrayAdapter<String> adapter;
        Bundle link = getIntent().getExtras();
        string = link.getString("abc");
        getSupportActionBar().setTitle(string);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new browser());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("http://www." + string);

//for toolbar show
        drawerLayout = findViewById(R.id.dwaer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.all:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(i);
                                drawerLayout.closeDrawers();
                                return true;
                            case R.id.whitehouse:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                s = "whitehouse.gov/news/";
                                webView.loadUrl("http://www." + s);
                                drawerLayout.closeDrawers();
                                return true;
                            case R.id.snl:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                s = "nbc.com/saturday-night-live";
                                webView.loadUrl("http://www." + s);
                                drawerLayout.closeDrawers();
                                return true;
                            case R.id.tecnology:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                s = "usnews.com/topics/subjects/technology";
                                webView.loadUrl("http://www." + s);
                                drawerLayout.closeDrawers();
                                return true;
                            case R.id.sports:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                s = "sportingnews.com/";
                                webView.loadUrl("http://www." + s);
                                drawerLayout.closeDrawers();
                                return true;

                            case R.id.nasa:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                s = "nasa.gov/";
                                //getActionBar().setTitle("NASA");
                                //  getSupportActionBar().setTitle("nasa");
                                webView.loadUrl("http://www." + s);
                                drawerLayout.closeDrawers();
                                return true;

                            case R.id.share:
                                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                                shareIntent.setType("text/plain");
                                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Install now");
                                String app_url = "https://play.google.com/store/apps/details?id=com.doa.fahim.uslivenewspapers";
                                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, app_url);
                                startActivity(Intent.createChooser(shareIntent, "Share via"));
                                break;
                        }
                        return true;
                    }
                });
    }

    public void loadrevieo() {
        mRewardedVideoAd.loadAd("ca-app-pub-6013605396446078/1389831816",
                new AdRequest.Builder().build());
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {
        loadrevieo();
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }

    public class browser extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.web_menu, menu);
        return true;
    }

   /* @Override
    public void onBackPressed() {
        if (doubleBack) {
            super.onBackPressed();
            return;
        }

        this.doubleBack = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBack = false;
            }
        }, 2000);
    }*/

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);

                return true;

            case R.id.goBack:
                /*if (mRewardedVideoAd.isLoaded()) {
                    mRewardedVideoAd.show();
                }*/
                if (webView.canGoBack()) {
                    webView.goBack();
                }
                break;

            case R.id.goForward:
               /* if (mRewardedVideoAd.isLoaded()) {
                    mRewardedVideoAd.show();
                }*/
                if (webView.canGoForward()) {
                    webView.goForward();
                }
                break;
            case R.id.reload:
               /* if (mRewardedVideoAd.isLoaded()) {
                    mRewardedVideoAd.show();
                }*/
                webView.loadUrl(webView.getUrl().toString());
                break;
            case R.id.share:
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Install now");
                String app_url = "https://play.google.com/store/apps/details?id=com.doa.fahim.uslivenewspapers";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, app_url);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
                break;
            case R.id.rate:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.doa.fahim.uslivenewspapers"));
                startActivity(intent);
                break;
            case R.id.review:
                Intent inter = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.doa.fahim.uslivenewspapers"));
                startActivity(inter);
                break;
            case R.id.moreapp:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=7517108231539488434"));
                startActivity(i);
                break;
            case R.id.exit:
                finish();
                System.exit(0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

   /* @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
*/
}


