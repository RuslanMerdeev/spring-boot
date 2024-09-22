package com.example.springBoot.configuration

import com.example.springBoot.delegate.GetBrandDelegate
import org.springframework.boot.autoconfigure.AutoConfigureOrder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered


@Configuration
@AutoConfigureOrder(Ordered.LOWEST_PRECEDENCE)
//@ConditionalOnBean(type = ["org.flowable.engine.ProcessEngine"])
class AnotherConfiguration {

    @Configuration
    @ComponentScan(value = ["com.example.springBoot"])
    class ComponentScanConfiguration

//    @Bean
//    fun getBrandDelegate(): GetBrandDelegate {
//        return GetBrandDelegate()
//    }
}