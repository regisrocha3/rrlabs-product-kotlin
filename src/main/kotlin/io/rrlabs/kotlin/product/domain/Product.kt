package io.rrlabs.kotlin.product.domain

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import java.math.BigDecimal
import java.util.*

class Product {

    @PrimaryKeyColumn(name = "id", ordering = Ordering.DESCENDING, ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private var id : UUID? = null;

    @Column(value = "name")
    private var name: String? = null;

    @Column(value = "description")
    private var description: String? = null;

    @Column(value = "price")
    private var price: String? = null;

    public fun getId() = this.id
    public fun setId(id: UUID?) { this.id = id }

    public fun getName() = this.name
    public fun setName(name: String?) { this.name = name }

    public fun getDescription() = this.description
    public fun setDescription(description: String?) { this.description = description }

    public fun getPrice() = this.price
    public fun setPrice(price: String?) { this.price = price }

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