package org.gonzalez.patricio.sample.data

import java.util.UUID

// this package name has NOTHING to do with org.gonzalez.patricio.sample

data class Person(
    var id: String = UUID.randomUUID().toString(),
    var name: String,
    var age: Int,
)

