package io.rrlabs.kotlin.product.controller

import io.rrlabs.kotlin.product.domain.Product
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal

/**
 * @author Regis Rocha
 */
@Repository
interface ProductRepository : CassandraRepository<Product, Product> { }