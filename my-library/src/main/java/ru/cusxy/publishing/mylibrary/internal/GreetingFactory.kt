package ru.cusxy.publishing.mylibrary.internal

import ru.cusxy.publishing.mylibrary.internal.impl.DefaultGreetingFactoryImpl
import java.util.ServiceLoader

internal interface GreetingFactory {
    companion object

    fun greeting(): String
}

internal val GreetingFactory.Companion.default: GreetingFactory get() = defaultGreetingFactory

private val defaultGreetingFactory by lazy {
    ServiceLoader.load(GreetingFactory::class.java)
        .firstOrNull() ?: DefaultGreetingFactoryImpl()
}