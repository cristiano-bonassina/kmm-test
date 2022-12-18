package br.com.homer.app.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform