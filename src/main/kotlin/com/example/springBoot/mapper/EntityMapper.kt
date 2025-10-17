package com.example.springBoot.mapper

interface EntityMapper<O, I> {

    fun toImpl(original: O?): I

    fun toOriginal(impl: I?): O
}
