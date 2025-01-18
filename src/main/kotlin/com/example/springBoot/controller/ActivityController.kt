package com.example.springBoot.controller

import com.example.productstarter.api.server.ActivityServer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/activity")
@Suppress("unused")
class ActivityController(
    private val activityServer: ActivityServer,
) {

    @PostMapping("/activate/{productId}")
    fun activate(
        @PathVariable productId: String,
    ) = activityServer.activate(productId)

    @GetMapping("/products/{productId}")
    fun product(
        @PathVariable productId: String,
    ) = activityServer.product(productId)
}
