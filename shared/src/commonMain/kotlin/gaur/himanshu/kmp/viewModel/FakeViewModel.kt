package gaur.himanshu.kmp.viewModel

import androidx.lifecycle.ViewModel
import gaur.himanshu.kmp.useCase.FakeUseCase

class FakeViewModel(
    private val fakeUseCase: FakeUseCase
) : ViewModel() {


    fun getMessage() = fakeUseCase.invoke()

}