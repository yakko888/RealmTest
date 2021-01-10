package com.example.testapp

import android.app.Application
import com.facebook.stetho.Stetho
import io.realm.Realm
import java.util.regex.Pattern

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

        Stetho.initialize(
            Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build())
    }

}

