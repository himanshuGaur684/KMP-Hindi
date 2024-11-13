package gaur.himanshu.kmp.di

import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(dataModule + domainModule + sharedViewModelModule())
    }
}