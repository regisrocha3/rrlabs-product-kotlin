package io.rrlabs.kotlin.product.service.impl

import io.rrlabs.kotlin.product.controller.ProductRepository
import io.rrlabs.kotlin.product.domain.Product
import io.rrlabs.kotlin.product.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.*

/**
 * @author Regis Rocha
 */
@Service
class ProductServiceImpl : ProductService {

    @Autowired
    private lateinit var productRepository: ProductRepository

    override fun findById(id: String): Optional<Product> = this.productRepository.findById(Product(UUID.fromString(id)));

    override fun create(product: Product): Product = this.productRepository.save(product)

    override fun update(product: Product): Product = this.productRepository.save(product)

    override fun delete(id: String) = this.productRepository.delete(Product(UUID.fromString(id)))

}