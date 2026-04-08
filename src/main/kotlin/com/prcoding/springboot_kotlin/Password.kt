package com.prcoding.springboot_kotlin

import jakarta.validation.Constraint
import jakarta.validation.Payload
import jakarta.validation.constraints.Pattern
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy=[])
@Pattern(
    regexp="^(?=.*\\d)(?=.*[^A-Za-z0-9]).{9,}$",
    message = "Password must be at least 9 characters long and contain at least one digit and one special character"
)
annotation class Password(
    val message: String ="Password must be at least 9 characters long and contain at least one digit and one special character",
val groups: Array<KClass<*>> =[],
    val payload: Array<KClass<out Payload>> =[]
)
