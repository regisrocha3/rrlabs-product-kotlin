package io.rrlabs.kotlin.product.controller

import io.rrlabs.kotlin.product.domain.Product
import io.rrlabs.kotlin.product.exception.NotFoundException
import io.rrlabs.kotlin.product.service.ProductService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.RuntimeException
import java.math.BigDecimal
import java.util.*

/**
 * @author Regis Rocha
 *
 * Controller para controle de produtos
 */
@RestController
@Api("API para criação, alteração, consulta e exclusão de produtos")
@RequestMapping("/product", produces = [MediaType.APPLICATION_JSON_VALUE])
class ProductController {

    @Autowired
    private lateinit var productService : ProductService;

    @ApiOperation("API para criação de produto", httpMethod = "POST", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, position = 1)
    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun create(@RequestBody product : Product) : ResponseEntity<Product> {
        product.id = UUID.randomUUID()
        return ResponseEntity.ok(this.productService.create(product))
    }

    @ApiOperation("API para alteração do produto", httpMethod = "PUT", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, position = 2)
    @ResponseStatus(HttpStatus.OK)
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun update(@RequestBody product : Product) = this.productService.update(product)

    @ApiOperation("API para remoção do produto", httpMethod = "DELETE", produces = MediaType.APPLICATION_JSON_VALUE, position = 3)
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(value = ["/{id}"])
    fun delete(@PathVariable("id") id: String) = this.productService.delete(id)

    @ApiOperation("API para consulta do produto", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE, position = 4)
    @GetMapping(value = ["/{id}"])
    fun find(@PathVariable("id") id: String) : ResponseEntity<Product> {
        var product : Optional<Product> = this.productService.findById(id);

        if (product.isEmpty) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(product.get());
    }

}