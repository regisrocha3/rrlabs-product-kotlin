package io.rrlabs.kotlin.product.domain

import java.math.BigDecimal

class Product {

    var id : String? = null;
    var name: String? = null;
    var description: String? = null;
    var price: BigDecimal? = null;

    constructor();

    constructor(id: String?, name: String?, description: String?, price: BigDecimal?) {
        this.id = id
        this.name = name
        this.description = description
        this.price = price
    };

}