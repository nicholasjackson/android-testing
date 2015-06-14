# JUnit3 TestCase and ActivityInstrumentaionTestCase Examples
This branch contains two tests using JUnit3, one AndroidTestCase and one ActivityInstrumentation, both of these tests run either on a physical device or will run in an android virtual machine.

## How to run
You can either run the test cases from AndroidStudio using the Test configuration or from the command line using Gradle `./gradlew connectedCheck`.

## TestCase (HyperspaceJumpTest)
"Travelin' through hyperspace ain't like dustin' crops, boy! Without precise calculations we could fly right through a star or bounce too close to a supernova, and that'd end your trip real quick, wouldn't it?"

And thats why you need unit tests, this example looks at how you can write some simple unit tests for your nav computer.

TestCase is the simplest testing class in the Android framework.

### Documentation:
[http://developer.android.com/reference/junit/framework/TestCase.html](http://developer.android.com/reference/junit/framework/TestCase.html)

## ActivityInstrumentaionTestCase2 (MainActivityTest)
This is a simple test which allows us to check that one action on the UI correctly triggers another action.  Remember even R2 makes mistakes and the last thing you need when trying to escape the Death Star is a hyperdrive failure.

### Documentation:
[https://developer.android.com/reference/android/test/ActivityInstrumentationTestCase2.html](https://developer.android.com/reference/android/test/ActivityInstrumentationTestCase2.html)
[https://developer.android.com/training/activity-testing/activity-basic-testing.html](https://developer.android.com/training/activity-testing/activity-basic-testing.html)
