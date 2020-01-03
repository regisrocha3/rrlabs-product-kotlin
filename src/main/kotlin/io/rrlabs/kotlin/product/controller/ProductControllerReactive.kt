package io.rrlabs.kotlin.product.controller

import io.rrlabs.kotlin.product.domain.Product
import io.rrlabs.kotlin.product.service.ProductService
import io.rrlabs.kotlin.product.service.ProductServiceReactive
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

/**
 * @author Regis Rocha
 *
 * Controller para controle de produtos
 */
@RestController
@Api("API para criação, alteração, consulta e exclusão de produtos")
@RequestMapping("/reactive/product", produces = [MediaType.APPLICATION_JSON_VALUE])
class ProductControllerReactive {

    @Autowired
    @Qualifier("ProductServiceReactive")
    private lateinit var productService : ProductServiceReactive;

    @ApiOperation("API para consulta do produto", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE, position = 4)
    @GetMapping(value = ["/"])
    fun findAll() : ResponseEntity<Flux<Product>> {
        val products: Flux<Product> = this.productService.findAll()

        return ResponseEntity.ok(products);
    }

    @ApiOperation("API para consulta do produto", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE, position = 5)
    @GetMapping(value = ["/{id}"])
    fun find(@PathVariable("id") id: String) : ResponseEntity<Mono<Product>> {
        var product : Mono<Product> = this.productService.findById(id);

        return ResponseEntity.ok(product)
    }
}