package com.prcoding.springboot_kotlin.repository

import com.prcoding.springboot_kotlin.QuoteDto
import com.prcoding.springboot_kotlin.sqldatabase.QuoteEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import kotlin.collections.remove
import kotlin.text.set

interface QuoteRepository : JpaRepository<QuoteEntity, Long>{

}