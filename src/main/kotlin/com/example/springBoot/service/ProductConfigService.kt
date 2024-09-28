package com.example.springBoot.service

import com.example.springBoot.client.ProductConfigClient
import org.springframework.stereotype.Service

@Service
class ProductConfigService(
    private val client: ProductConfigClient,
) {

    fun fetchBy(productId: String) = client.fetchBy(productId)
}
