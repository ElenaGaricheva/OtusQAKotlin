package com.example.otusqakotlin

import com.example.otusqakotlin.common.CustomTestRunner

fun main() {
        val testRunner = CustomTestRunner()
        testRunner.run {

            runTest(testSteps) {
                firstTest()
            }

        }
    }

    fun firstTest() {
       println("Test passed")
    }

