package com.example.springBoot.repository

import com.example.springBoot.model.ProductEntityImpl
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ProductRepositoryImpl : JpaRepository<ProductEntityImpl, UUID>
