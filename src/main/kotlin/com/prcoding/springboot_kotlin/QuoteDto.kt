package com.prcoding.springboot_kotlin

import jakarta.validation.constraints.Pattern
import org.hibernate.validator.constraints.Length

data class QuoteDto(
    val id: Long?=null,
    @field:Length(
        min = 5,
        max=500,
        message="Quote length should be between 5 and 500 characters"
    )
    val content: String,
    @field:Pattern("\\b[a-zA-Z]+\\b(?:\\s+\\b[a-zA-Z]+\\b)+",
        message = "Author must be at least 2 word long"
    )
    val author:String,


)
