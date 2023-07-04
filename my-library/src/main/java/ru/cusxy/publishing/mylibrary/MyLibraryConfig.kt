package ru.cusxy.publishing.mylibrary

import ru.cusxy.publishing.mylibrary.internal.GreetingFactory
import ru.cusxy.publishing.mylibrary.internal.default

object MyLibraryConfig {

    val greeting: String = GreetingFactory.default.greeting()
}