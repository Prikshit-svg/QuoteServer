package com.prcoding.springboot_kotlin.service

import com.prcoding.springboot_kotlin.QuoteDto
import com.prcoding.springboot_kotlin.QuoteNotFoundException
import com.prcoding.springboot_kotlin.config.QuoteConfig
import com.prcoding.springboot_kotlin.repository.QuoteRepository
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class QuoteService(
    private val repository: QuoteRepository,
    @param:Value($$"${spring.application.version}")
    private val version: String,
    private val config: QuoteConfig

) {
    init {
        println("backend is running with version :$version")
        println(config)
    }
    fun getQuotes():List<QuoteDto>{
        return repository.findAll().map { it.toDto() }
    }
    fun insertQuote(quoteDto: QuoteDto): QuoteDto{
        return repository.save(quoteDto.toEntity()).apply {
            this.id=0//set id to 0 before inserting it into the database so the jpa
        }
            .toDto()

    }
    fun putQuotes(quoteDto: QuoteDto): QuoteDto {
        return repository.save(quoteDto.toEntity())
            .toDto()
    }

    fun deleteQuote(id: Long) {
     repository.deleteById(id)

    }

}