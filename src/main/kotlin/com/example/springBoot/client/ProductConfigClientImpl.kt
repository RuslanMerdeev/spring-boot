package com.example.springBoot.client

import com.example.productstarter.api.client.ProductConfigClient
import com.example.productstarter.api.model.ProductResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "product-service")
@Suppress("unused")
interface ProductConfigClientImpl: ProductConfigClient {

    @GetMapping("/products/{productId}")
    override fun fetchBy(
        @PathVariable productId: String,
    ): ProductResponse
}
