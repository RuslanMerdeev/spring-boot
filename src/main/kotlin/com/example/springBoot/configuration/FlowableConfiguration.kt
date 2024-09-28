package com.example.springBoot.configuration

import org.flowable.engine.ProcessEngine
import org.flowable.engine.ProcessEngineConfiguration
import org.flowable.engine.RuntimeService
import org.flowable.spring.SpringProcessEngineConfiguration
import org.h2.Driver
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.jdbc.datasource.SimpleDriverDataSource
import org.springframework.transaction.PlatformTransactionManager
import javax.sql.DataSource

@Configuration
@Suppress("unused")
class FlowableConfiguration {

    @Bean
    fun dataSource(): DataSource {
        val dataSource = SimpleDriverDataSource()
        dataSource.setDriverClass(Driver::class.java)
        dataSource.url = "jdbc:h2:mem:flowable;DB_CLOSE_DELAY=-1"
        dataSource.username = "sa"
        dataSource.password = ""
        return dataSource
    }

    @Bean
    fun transactionManager(
        dataSource: DataSource,
    ): PlatformTransactionManager {
        val transactionManager = DataSourceTransactionManager()
        transactionManager.dataSource = dataSource
        return transactionManager
    }

    @Bean
    fun processEngine(
        transactionManager: PlatformTransactionManager,
        dataSource: DataSource,
        context: ConfigurableApplicationContext,
    ): ProcessEngine {
        val cfg = SpringProcessEngineConfiguration()
        cfg.dataSource = dataSource
        cfg.transactionManager = transactionManager
        cfg.databaseSchemaUpdate = ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE
        cfg.applicationContext = context
        return cfg.buildProcessEngine()
    }

    @Bean
    fun runtimeService(
        processEngine: ProcessEngine,
    ): RuntimeService = processEngine.runtimeService
}