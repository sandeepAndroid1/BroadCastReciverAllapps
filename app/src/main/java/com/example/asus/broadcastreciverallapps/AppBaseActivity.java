package com.example.asus.broadcastreciverallapps;

import android.app.Activity;
import android.content.IntentFilter;

/**
 * Created by asus on 15-09-2017.
 */

public class AppBaseActivity extends Activity {

    public static final String FINISH_ALL_ACTIVITIES_ACTIVITY_ACTION = "com.example.asus.broadcastreciverallapps";
    private BaseActivityReceiver baseActivityReceiver = new BaseActivityReceiver();
    public static final IntentFilter INTENT_FILTER = createIntentFilter();


    private static IntnetFilter createIntentFilter() {

        IntentFilter filter = new IntentFilter();
        filter.addAction(FINISH_ALL_ACTIVITIES_ACTIVITY_ACTION);
        return filter;

    }


}
