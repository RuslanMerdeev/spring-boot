package com.example.springBoot

import com.example.springBoot.delegate.GetBrandDelegate
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class Application

fun main(args: Array<String>) {
    val context = runApplication<Application>(*args)

    val bean = context.getBean(GetBrandDelegate::class.java)
}
