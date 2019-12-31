package io.rrlabs.kotlin.product.exception

/**
 * @author Regis Rocha
 */
class NotFoundException : RuntimeException {

    constructor(message: String) : super(message)

    constructor(message: String, exception : Throwable) : super(message, exception)
}