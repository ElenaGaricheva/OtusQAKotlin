package com.example.otusqakotlin.common

import kotlin.reflect.full.declaredFunctions

class CustomTestRunner<T>: TestRunner<T> {

    override fun runTest(steps: T, test: () -> Unit) {

        val methods = steps!!::class.declaredFunctions

        methods.forEach {
            if (it.name.startsWith("before")) {
                it.call(steps)
            }
        }

        test()

        methods.forEach {
            if (it.name.startsWith("after")) {
                it.call(steps)
            }
        }
    }
}

class TestSteps() {
    fun before() {
        println("Prepare data")
    }

    fun after() {
        println("Clean data")
    }
}