package io.rrlabs.kotlin.product.controller

import io.rrlabs.kotlin.product.domain.Product
import io.rrlabs.kotlin.product.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

/**
 * Controller para controle de produtos
 */
@RestController
@RequestMapping("/product", produces = [MediaType.APPLICATION_JSON_VALUE])
class ProductController {

    @Autowired
    private lateinit var productService : ProductService;

    @GetMapping(value = ["/product/{id}"])
    fun find(@PathVariable("id") id: String) : Product = this.productService.findById(id)

}