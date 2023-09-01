package com.adsmanager.ads.di

import com.adsmanager.ads.AdsManager
import com.adsmanager.ads.AdsManagerOpenAd
import com.adsmanager.ads.HandleAds
import com.adsmanager.applovin.ApplovinDiscoveryAds
import com.adsmanager.applovin.ApplovinMaxAds
import com.adsmanager.applovin.ApplovinOpenAds
import org.koin.dsl.module

val adsManagerModule = module {
    single { ApplovinMaxAds() }
    single { ApplovinDiscoveryAds() }
    single { HandleAds(get(), get()) }
    single { AdsManager(get()) }
    single { ApplovinOpenAds(get()) }
    single { AdsManagerOpenAd(get()) }
}