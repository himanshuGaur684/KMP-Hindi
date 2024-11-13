package gaur.himanshu.kmp

import android.app.Application
import gaur.himanshu.kmp.di.dataModule
import gaur.himanshu.kmp.di.domainModule
import gaur.himanshu.kmp.di.sharedViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules(dataModule + domainModule + sharedViewModelModule())
        }
    }

}