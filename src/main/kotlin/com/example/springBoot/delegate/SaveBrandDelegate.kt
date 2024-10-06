package com.example.springBoot.delegate

import com.example.springBoot.model.ProductEntity
import com.example.springBoot.repository.ProductRepository
import com.example.springBoot.variable.BRAND
import org.flowable.engine.delegate.DelegateExecution
import org.flowable.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class SaveBrandDelegate(
    private val productRepository: ProductRepository,
) : JavaDelegate {

    override fun execute(execution: DelegateExecution) {
        val brand = execution.getVariable(BRAND) as String
        productRepository.save(ProductEntity(brand = brand))
    }
}
