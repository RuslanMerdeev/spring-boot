package com.example.springBoot.service

import com.example.springBoot.variable.PRODUCT_PROCESS_KEY
import org.flowable.engine.ProcessEngine
import org.springframework.stereotype.Service

@Service
class ProductProcessService(
    private val flowableProcessEngine: ProcessEngine
) {

    fun startWith(productId: String) {
        flowableProcessEngine.runtimeService.startProcessInstanceByKey(PRODUCT_PROCESS_KEY, productId)
    }
}