package com.example.springBoot.controller

import com.example.springBoot.service.ProductConfigService
import com.example.springBoot.service.ProductProcessService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/activity")
@Suppress("unused")
class ActivityController(
    private val productProcessService: ProductProcessService,
    private val productConfigService: ProductConfigService,
) {

    @PostMapping("/activate/{productId}")
    fun activate(@PathVariable productId: String) = productProcessService.startWith(productId)

    @GetMapping("/products/{productId}")
    fun product(@PathVariable productId: String) = productConfigService.fetchBy(productId)
}
