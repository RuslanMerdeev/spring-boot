package com.example.springBoot.client

import com.example.springBoot.dto.ProductDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "product-service")
interface ProductConfigClient {

    @GetMapping("/products/{productId}")
    fun fetchBy(
        @PathVariable productId: String,
    ): ProductDto
}
