package io.rrlabs.kotlin.product.service

import io.rrlabs.kotlin.product.domain.Product

interface ProductService {

    fun findById(id: String) : Product

}