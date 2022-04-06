package io.julioamorim.kotlinlang

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinLangApplication

fun main(args: Array<String>) {
    runApplication<KotlinLangApplication>(*args)
}
