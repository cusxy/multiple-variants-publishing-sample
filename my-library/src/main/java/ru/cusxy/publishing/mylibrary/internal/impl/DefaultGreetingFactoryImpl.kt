package ru.cusxy.publishing.mylibrary.internal.impl

import ru.cusxy.publishing.mylibrary.internal.GreetingFactory

internal class DefaultGreetingFactoryImpl : GreetingFactory {
    override fun greeting(): String = "Hello from default variant!"
}