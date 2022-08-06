package com.example.otusqakotlin

import com.example.otusqakotlin.common.CustomTestRunner
import com.example.otusqakotlin.common.TestSteps

fun main() {
    val testRule = TestSteps()
    val testRunner = CustomTestRunner<TestSteps>()

    testRunner.run {
        runTest(testRule) {
            firstTest()
        }
    }
}

fun firstTest() {
    println("Test passed")
}

