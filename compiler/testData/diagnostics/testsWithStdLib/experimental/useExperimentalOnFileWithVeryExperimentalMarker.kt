// !USE_EXPERIMENTAL: kotlin.RequiresOptIn
// FILE: api.kt

package api

@RequiresOptIn(RequiresOptIn.Level.WARNING)
annotation class ExperimentalAPI

@ExperimentalAPI
@RequiresOptIn(RequiresOptIn.Level.WARNING)
annotation class VeryExperimentalAPI

@ExperimentalAPI
@VeryExperimentalAPI
fun f() {}

@ExperimentalAPI
fun g() {}

// FILE: usage.kt

@file:OptIn(ExperimentalAPI::class, VeryExperimentalAPI::class)
package usage

import api.*

fun usage() {
    f()
    g()
}
