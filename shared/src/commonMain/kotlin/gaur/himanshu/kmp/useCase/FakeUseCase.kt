package gaur.himanshu.kmp.useCase

import gaur.himanshu.kmp.repository.FakeRepository

class FakeUseCase(val fakeRepository: FakeRepository) {

    operator fun invoke() = fakeRepository.getMessage()

}