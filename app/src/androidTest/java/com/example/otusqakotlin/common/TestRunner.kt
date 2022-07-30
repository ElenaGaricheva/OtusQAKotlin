package com.example.otusqakotlin.common

interface TestRunner<T> {
    fun runTest(steps: T, test: () -> Unit)
}