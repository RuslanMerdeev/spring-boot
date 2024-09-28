package com.example.springBoot.delegate

import com.example.springBoot.service.ProductConfigService
import org.flowable.engine.delegate.DelegateExecution
import org.flowable.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class SaveBrandDelegate(
    private val productConfigService: ProductConfigService,
) : JavaDelegate {

    override fun execute(execution: DelegateExecution?) {
        // TODO Not yet implemented
    }
}
