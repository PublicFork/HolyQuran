package com.efortshub.holyquran;

import androidx.multidex.MultiDexApplication;

import cat.ereza.customactivityoncrash.config.CaocConfig;


/**
 * Created by H. Bappi on  9:31 PM 9/27/21.
 * Contact email:
 * contact@efortshub.com
 * bappi@efortshub.com
 * contact.efortshub@gmail.com
 * Copyright (c) 2021 eFortsHub . All rights reserved.
 **/
public class eFortsHub extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();


        CaocConfig.Builder.create()
                .enabled(true)
                .showRestartButton(true)
                .backgroundMode(CaocConfig.BACKGROUND_MODE_SHOW_CUSTOM)
                .trackActivities(true) //default: false
                .minTimeBetweenCrashesMs(2000) //default: 3000
                .errorDrawable(R.drawable.ic_baseline_report_problem_24)
                .showErrorDetails(true)
                .apply();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }


}
