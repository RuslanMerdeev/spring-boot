package com.example.springBoot.listener

import org.flowable.spring.SpringProcessEngineConfiguration
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component


@Component
@Suppress("unused")
class ApplicationReadyListener(
    private val processEngineConfiguration: SpringProcessEngineConfiguration,
) {

    @EventListener(ApplicationReadyEvent::class)
    fun afterStartup() {
        processEngineConfiguration.start()
    }
}