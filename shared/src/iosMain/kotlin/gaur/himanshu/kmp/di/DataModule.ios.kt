package gaur.himanshu.kmp.di

import gaur.himanshu.kmp.viewModel.FakeViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.module.Module
import org.koin.dsl.module

private val viewModelModule = module {
    single { FakeViewModel(get()) }
}

actual fun sharedViewModelModule(): Module = viewModelModule

object ProvideViewModel : KoinComponent{

    fun getFakeViewModel():FakeViewModel = get()

}
