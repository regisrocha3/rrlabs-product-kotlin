package io.rrlabs.kotlin.product.repository

import io.rrlabs.kotlin.product.domain.Product
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal

/**
 * @author Regis Rocha
 */
@Repository
interface ProductReactiveRepository : ReactiveCassandraRepository<Product, Product> { }