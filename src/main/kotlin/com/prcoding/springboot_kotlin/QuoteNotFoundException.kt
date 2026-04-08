package com.prcoding.springboot_kotlin

class QuoteNotFoundException(private val id:Long): RuntimeException(
    "A quote with $id is not found"
) {
}