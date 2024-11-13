package gaur.himanshu.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform