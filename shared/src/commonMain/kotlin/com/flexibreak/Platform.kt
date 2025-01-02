package com.flexibreak

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform