package io.rrlabs.kotlin.product.domain

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import java.math.BigDecimal
import java.util.*

class Product {

    @PrimaryKeyColumn(name = "id", ordering = Ordering.DESCENDING, ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    var id : UUID? = null;

    @Column(value = "name")
    var name: String? = null;

    @Column(value = "description")
    var description: String? = null;

    @Column(value = "price")
    var price: String? = null;

    constructor();

    constructor(id: UUID?) {
        this.id = id
    };

    constructor(id: UUID?, name: String?, description: String?, price: String?) {
        this.id = id
        this.name = name
        this.description = description
        this.price = price
    };

}