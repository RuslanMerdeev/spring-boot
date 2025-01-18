package com.example.springBoot.service

import com.example.productstarter.api.client.ProductRepository
import com.example.productstarter.model.ProductEntity
import com.example.springBoot.mapper.ProductEntityMapper
import com.example.springBoot.repository.ProductRepositoryImpl
import org.springframework.stereotype.Service

@Service
class ProductRepositoryAdapter(
    private val repository: ProductRepositoryImpl,
    val mapper: ProductEntityMapper,
): ProductRepository {

    override fun save(entity: ProductEntity): ProductEntity {
        val impl = repository.save(mapper.toImpl(entity))
        return mapper.toOriginal(impl)
    }
}