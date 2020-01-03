package io.rrlabs.kotlin.product.service.impl

import io.rrlabs.kotlin.product.repository.ProductRepository
import io.rrlabs.kotlin.product.domain.Product
import io.rrlabs.kotlin.product.repository.ProductReactiveRepository
import io.rrlabs.kotlin.product.service.ProductService
import io.rrlabs.kotlin.product.service.ProductServiceReactive
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.publisher.toFlux
import reactor.core.publisher.toMono
import java.util.*

/**
 * @author Regis Rocha
 */
@Service("ProductServiceReactive")
class ProductServiceReactiveImpl: ProductServiceReactive {

    @Autowired
    private lateinit var productReactiveRepository: ProductReactiveRepository

    override fun findAll(): Flux<Product> = this.productReactiveRepository.findAll()

    override fun findById(id: String): Mono<Product> =
            this.productReactiveRepository.findById(Product(UUID.fromString(id)))

}