package io.rrlabs.kotlin.product.service

import io.rrlabs.kotlin.product.domain.Product
import java.util.*

/**
 * @author Regis Rocha
 */
interface ProductService {

    fun findAll(): List<Product>

    fun findById(id: String): Optional<Product>

    fun create(product : Product): Product

    fun update(product : Product): Product

    fun delete (id: String)

}