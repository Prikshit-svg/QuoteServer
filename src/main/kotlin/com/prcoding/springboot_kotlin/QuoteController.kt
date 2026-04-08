package com.prcoding.springboot_kotlin

import com.prcoding.springboot_kotlin.service.QuoteService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/quotes")
class QuoteController(
    private val service: QuoteService
) {


    @GetMapping
    fun loadQuotes(
        @RequestParam("q", required = false) query: String?
    ): List<QuoteDto>{
        return service.getQuotes()
    }

    @PostMapping
    fun postQuotes(@Valid @RequestBody quoteDto: QuoteDto): QuoteDto{

        return service.insertQuote(quoteDto)
    }

    @PutMapping
    fun putQuotes(
       @Valid @RequestBody quoteDto: QuoteDto
    ): QuoteDto {
        return service.putQuotes(quoteDto)
    }

    @DeleteMapping("/{id}")
    fun deleteQuote(
        @PathVariable("id") id: Long
    ){
       service.deleteQuote(id)

    }

}