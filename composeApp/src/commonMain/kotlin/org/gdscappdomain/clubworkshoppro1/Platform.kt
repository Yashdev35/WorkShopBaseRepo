package org.gdscappdomain.clubworkshoppro1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform