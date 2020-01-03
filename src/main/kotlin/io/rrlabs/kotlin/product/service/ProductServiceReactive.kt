package io.rrlabs.kotlin.product.service

import io.rrlabs.kotlin.product.domain.Product
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

/**
 * @author Regis Rocha
 */
interface ProductServiceReactive {

    fun findAll(): Flux<Product>

    fun findById(id: String): Mono<Product>

}