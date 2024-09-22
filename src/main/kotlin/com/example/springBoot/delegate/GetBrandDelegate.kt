package com.example.springBoot.delegate

import com.example.springBoot.service.ProductConfigService
import com.example.springBoot.variable.BRAND
import org.flowable.engine.delegate.DelegateExecution
import org.flowable.engine.delegate.JavaDelegate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Suppress("unused")
class GetBrandDelegate(
//    private val productConfigService: ProductConfigService,
): JavaDelegate {

//    @Autowired lateinit var productConfigService: ProductConfigService

    override fun execute(execution: DelegateExecution) {
//        val brand = productConfigService.fetchBy(execution.id).brand
//        execution.setVariable(BRAND, brand)
    }
}