package com.prcoding.springboot_kotlin.sqldatabase

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.Instant

@Entity
@Table(
    name = "quotes"
)
class QuoteEntity(//here data class should be the first choice, but data class can cause issues while using JPA so we use normal class here
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
var id:Long?=null,
@Column(nullable = false)
var content:String="",
@Column(nullable = false)
var author:String="",
    @CreationTimestamp
    var createdAt: Instant= Instant.now()
)