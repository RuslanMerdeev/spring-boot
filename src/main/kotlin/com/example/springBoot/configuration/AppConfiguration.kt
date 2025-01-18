package com.example.springBoot.configuration

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.example.productstarter"])
@Suppress("unused")
class AppConfiguration