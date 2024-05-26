package org.example.blog

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OfficialKotlinSpringWebApplication

fun main(args: Array<String>) {
    runApplication<OfficialKotlinSpringWebApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
