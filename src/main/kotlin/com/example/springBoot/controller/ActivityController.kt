package com.example.springBoot.controller

import com.example.springBoot.client.AnotherServiceClient
import com.example.springBoot.dto.ProductDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/activity")
@Suppress("unused")
class ActivityController(
    private val anotherServiceClient: AnotherServiceClient
) {

    @PostMapping("/activate")
    fun activate() {
    }

    @GetMapping("/products/{productId}")
    fun product(@PathVariable productId: String): ProductDto {
        return anotherServiceClient.fetchProductConfig(productId)
    }
}
