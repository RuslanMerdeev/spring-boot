package com.example.springBoot.mapper

import com.example.productstarter.model.ProductEntity
import com.example.springBoot.model.ProductEntityImpl
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface ProductEntityMapper {

    fun toImpl(original: ProductEntity?): ProductEntityImpl
    fun toOriginal(impl: ProductEntityImpl?): ProductEntity
}