package com.example.springBoot.listener

import org.flowable.engine.ProcessEngine
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component


@Component
class ApplicationReadyListener(
    private val processEngine: ProcessEngine,
) {

    @EventListener(ApplicationReadyEvent::class)
    fun doSomethingAfterStartup() {
        processEngine.repositoryService
            .createDeployment()
            .addClasspathResource("processes/ProductProcess.bpmn20.xml")
            .deploy()
    }
}