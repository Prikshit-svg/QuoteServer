package com.prcoding.springboot_kotlin.service

import com.prcoding.springboot_kotlin.QuoteDto
import com.prcoding.springboot_kotlin.sqldatabase.QuoteEntity

fun QuoteEntity.toDto(): QuoteDto{//It takes a QuoteEntity object, and It creates and returns a QuoteDto
    return QuoteDto(
        id=this.id,
        content = this.content,
        author = this.author
    )
}

fun QuoteDto.toEntity(): QuoteEntity{
    return QuoteEntity(
        id=this.id,
        content = this.content,
        author = this.author
    )
}