package gaur.himanshu.kmp.di

import gaur.himanshu.kmp.repository.FakeRepository
import gaur.himanshu.kmp.useCase.FakeUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

val dataModule = module {
    factory { FakeRepository() }
}

val domainModule = module {
    factory { FakeUseCase(get()) }
}

expect fun sharedViewModelModule():Module
