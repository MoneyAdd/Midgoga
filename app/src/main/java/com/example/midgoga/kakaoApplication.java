package com.example.midgoga;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class kakaoApplication extends Application {
    private static kakaoApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        KakaoSdk.init(this, "fade57db700214eb17b42d1c689dd76a");
    }
}
