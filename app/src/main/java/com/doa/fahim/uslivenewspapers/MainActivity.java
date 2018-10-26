package com.doa.fahim.uslivenewspapers;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.GnssNavigationMessage;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class MainActivity extends AppCompatActivity implements RewardedVideoAdListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBar actionBar;
    SearchView searchView;
    String[] paperlist;
    ListView listView;
    AdView adView;
    AdRequest adRequest;

    String s, ss, m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19,
            m20, m21, m22, m24, m25, m26, m27, m28, m29, m23, m30, m31, m32, m33, m34,
            m35, m36, m37, m38, m39, m40, m41, m42, m43, m44, m45, m46, m47, m48, m49,
            m50, m51, m52, m53, m54, m55, m56, m57, m58, m59, m60, m61, m62, m63, m64, m65, m66, m67, m68, m69;
    ArrayAdapter<String> adapter;
    NavigationView navigationView;
    private RewardedVideoAd mRewardedVideoAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713

        MobileAds.initialize(this, getResources().getString(R.string.banner_ad_unit_id));
       // adView = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
      //  adView.loadAd(adRequest);
        loadrevieo();

        listView = findViewById(R.id.listview);
        paperlist = getResources().getStringArray(R.array.paper);
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, paperlist);
        listView.setAdapter(adapter);

        drawerLayout = findViewById(R.id.dwaer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);


        Toast.makeText(this, " Check your Internet Connection ", Toast.LENGTH_LONG).show();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mRewardedVideoAd.isLoaded()) {
                    mRewardedVideoAd.show();
                }
                ss = adapter.getItem(position);

                m0 = "Intelligencer Journal";
                m1 = "The New Hampshire Gazette";
                m2 = "Hartford Courant";
                m3 = "Pittsburgh Post-Gazette";
                m4 = "Cherokee Phoenix";
                m5 = "Daily Hampshire Gazette";
                m6 = "The Post-Standard";
                m8 = "The Barnstable Patriot";
                m9 = "Ledger-Enquirer";
                m10 = "The Daily Mail";
                m11 = "Arkansas Democrat-Gazette";
                m12 = "Rutland Herald";
                m13 = "Press-Republican";
                m14 = "The Fayetteville Observer";
                m15 = "The Post and Courier";
                m17 = "The Keene Sentinel";
                m18 = "Norwich Bulletin";
                m19 = "The Register Star";
                m20 = "The Augusta Chronicle";
                m21 = "The Berkshire Eagle";
                m22 = "Poughkeepsie Journa";
                m24 = "The Recorder";
                m25 = "The Wall Street Journal";
                m26 = "The New York Times";
                m27 = "Las Vegas Review-Journal";
                m28 = "Chicago Tribune";
                m29 = "Honolulu Star-Advertiser";
                m23 = "The Boston Globe";
                m30 = "The Dallas Morning News";
                m31 = "The Philadelphia Inquirer";
                m32 = "The Arizona Republic";
                m33 = "The San Diego Union-Tribune";
                m34 = "Star Tribune";
                m35 = "Tampa Bay Times";
                m36 = "The Plain Dealer";
                m37 = "USA Today";
                m38 = "The Star-Ledger";
                m39 = "Orange County Register";
                m40 = "Houston Chronicle";
                m41 = "Los Angeles Times";
                m42 = "The Mercury News";
                m43 = "Newsday";
                m44 = "New York Daily News";
                m45 = "The Denver Post";
                m46 = "New York Post";
                m47 = "The Washington Post";
                m48 = "Chicago Sun-Times";

                m49 = "ABC";
                m51 = "KOTAKU";
                m52 = "GUARDIAN";
                m53 = "ESPN";
                m54 = "CBS";
                m55 = "CNET";
                m56 = "CNN";
                m57 = "people";
                m58 = "opposing views";
                m59 = "NHL";
                m63 = "Yahoo";
                m64 = "ZNET";
                m65 = "MSNBC";
                m66 = "NBA";
                m67 = "NFL";
                m50 = "BBC NEWS";
                m68 = "FOX NEWS";
                m69 = "NBC";
                if (ss.equals(m48)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "chicago.suntimes.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m69)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nbc.com";
                    bundile();
                    mes();
                } else if (ss.equals(m68)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "foxnews.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m50)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "bbc.com";
                    bundile();
                    mes();
                } else if (ss.equals(m49)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "abc.go.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m51)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "kotaku.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m52)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "theguardian.com/us";
                    bundile();
                    mes();
                } else if (ss.equals(m53)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "espn.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m54)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "cbs.com";
                    bundile();
                    mes();
                } else if (ss.equals(m55)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "cnet.com";
                    bundile();
                    mes();
                } else if (ss.equals(m56)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "cnn.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m57)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "people.com";
                    bundile();
                    mes();
                } else if (ss.equals(m58)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "opposingviews.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m59)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nhl.com";
                    bundile();
                    mes();
                } else if (ss.equals(m63)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "yahoo.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m64)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "zcomm.org/znet/";
                    bundile();
                    mes();
                } else if (ss.equals(m65)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "msnbc.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m66)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nba.com";
                    bundile();
                    mes();
                } else if (ss.equals(m67)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nfl.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m0)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "theintell.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m1)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nhgazette.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m2)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "courant.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m3)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "post-gazette.com";
                    bundile();
                    mes();
                } else if (ss.equals(m4)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "cherokeephoenix.org/";
                    bundile();
                    mes();
                } else if (ss.equals(m5)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "gazettenet.com";
                    bundile();
                    mes();
                } else if (ss.equals(m6)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "syracuse.com/poststandard";
                    bundile();
                    mes();
                } else if (ss.equals(m8)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "barnstablepatriot.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m9)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "ledger-enquirer.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m10)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "dailymail.co.uk/ushome/index.html";
                    bundile();
                    mes();
                } else if (ss.equals(m11)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "arkansasonline.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m12)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "rutlandherald.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m13)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "pressrepublican.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m14)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "fayobserver.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m15)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "postandcourier.com";
                    bundile();
                    mes();
                } else if (ss.equals(m17)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "sentinelsource.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m18)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "norwichbulletin.com";
                    bundile();
                    mes();
                } else if (ss.equals(m19)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "hudsonvalley360.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m20)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "augustachronicle.com";
                    bundile();
                    mes();
                } else if (ss.equals(m21)) {
                    s = "berkshireeagle.com";
                    bundile();
                    mes();
                } else if (ss.equals(m22)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "poughkeepsiejournal.com";
                    bundile();
                    mes();
                } else if (ss.equals(m23)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "bostonglobe.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m24)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "recorder.com";
                    bundile();
                    mes();
                } else if (ss.equals(m25)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "wsj.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m26)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nytimes.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m27)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "reviewjournal.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m28)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "chicagotribune.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m29)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "staradvertiser.com";
                    bundile();
                    mes();
                } else if (ss.equals(m30)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "dallasnews.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m31)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                    s = "philly.newspaperdirect.com/epaper/viewer.aspx";
                    bundile();
                    mes();
                } else if (ss.equals(m32)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "azcentral.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m33)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "sandiegouniontribune.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m34)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "startribune.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m35)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "tampabay.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m36)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "cleveland.com/plaindealer/";
                    bundile();
                    mes();
                } else if (ss.equals(m37)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "usatoday.com";
                    bundile();
                    mes();
                } else if (ss.equals(m38)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nj.com/starledger";
                    bundile();
                    mes();
                } else if (ss.equals(m39)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "ocregister.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m40)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "chron.com";
                    bundile();
                    mes();
                } else if (ss.equals(m41)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "latimes.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m42)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "mercurynews.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m43)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "newsday.com";
                    bundile();
                    mes();
                } else if (ss.equals(m44)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nydailynews.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m45)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "denverpost.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m46)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "nypost.com/";
                    bundile();
                    mes();
                } else if (ss.equals(m47)) {
                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }
                    s = "washingtonpost.com/";
                    bundile();
                    mes();
                }
            }
        });
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
                                bundile();
                                drawerLayout.closeDrawers();
                                return true;
                            case R.id.snl:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                s = "nbc.com/saturday-night-live";
                                bundile();
                                drawerLayout.closeDrawers();
                                return true;
                            case R.id.tecnology:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                s = "usnews.com/topics/subjects/technology";
                                bundile();
                                drawerLayout.closeDrawers();
                                return true;
                            case R.id.sports:
                                if (mRewardedVideoAd.isLoaded()) {
                                    mRewardedVideoAd.show();
                                }
                                menuItem.setCheckable(true);
                                s = "sportingnews.com/";
                                bundile();
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
                                bundile();
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
        mRewardedVideoAd.loadAd(getResources().getString(R.string.reward_add_unit),
                new AdRequest.Builder().build());
    }

    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        mRewardedVideoAd.pause(this);
        super.onPause();
    }

    @Override
    public void onResume() {
        mRewardedVideoAd.resume(this);
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
        mRewardedVideoAd.destroy(this);
        super.onDestroy();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;

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

    void mes() {
        Toast.makeText(MainActivity.this, "Contoler " + ss + " Authority", Toast.LENGTH_SHORT).show();
    }

    void bundile() {
        Bundle bb = new Bundle();
        bb.putString("abc", s);
        Intent i = new Intent(MainActivity.this, web.class);
        i.putExtras(bb);
        startActivity(i);
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
}