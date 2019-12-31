package io.rrlabs.kotlin.product.service.impl

import io.rrlabs.kotlin.product.domain.Product
import io.rrlabs.kotlin.product.service.ProductService
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class ProductServiceImpl : ProductService {

    override fun findById(id: String): Product = Product("ID", "Name", "Description", BigDecimal(12.77));

}