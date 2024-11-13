package gaur.himanshu.kmp.di

import gaur.himanshu.kmp.viewModel.FakeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

private val viewModelModule = module {
    viewModel { FakeViewModel(get()) }
}

actual fun sharedViewModelModule(): Module = viewModelModule