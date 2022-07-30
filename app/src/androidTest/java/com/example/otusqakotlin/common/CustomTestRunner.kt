package com.example.otusqakotlin.common

class CustomTestRunner: TestRunner<TestSteps> {
    val testSteps = TestSteps()

    override fun runTest(steps: TestSteps, test: () -> Unit){

        steps.before {
            println("Prepare data")
        }

        test()

        steps.after {
            println("Clear data")
        }
    }
}

class TestSteps() {
    fun before(action: () -> Any) {
        action()
    }

    fun after(action: () -> Any) {
        action()
    }
}