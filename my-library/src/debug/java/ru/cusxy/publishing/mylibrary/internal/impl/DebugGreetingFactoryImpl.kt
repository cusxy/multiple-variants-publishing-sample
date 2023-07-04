package ru.cusxy.publishing.mylibrary.internal.impl

import ru.cusxy.publishing.mylibrary.internal.GreetingFactory

internal class DebugGreetingFactoryImpl : GreetingFactory {
    override fun greeting(): String = "Hello from debug variant!"
}