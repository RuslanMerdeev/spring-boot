package com.example.springBoot.service

import com.example.springBoot.variable.PRODUCT_PROCESS_KEY
import org.flowable.engine.RuntimeService
import org.springframework.stereotype.Service

@Service
class ProductProcessService(
    private val runtimeService: RuntimeService,
) {

    fun startWith(productId: String) {
        runtimeService.startProcessInstanceByKey(PRODUCT_PROCESS_KEY, productId)
    }
}
