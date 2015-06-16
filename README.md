# Calabash
This branch contains two tests using JUnit3, one AndroidTestCase and one ActivityInstrumentation, both of these tests run either on a physical device or will run in an android virtual machine.

## Installation
1. You need Ruby 2.1.3 for Calabash to work correctly I recommend RVM to keep things clean. [https://rvm.io/](https://rvm.io/)
2. You will need bundler `gem install bundler`
3. Install the calabash-android gem: `bundle`

## How to run
You can run the test cases from the command line using:
```
./gradlew clean build  
calabash-android run "$(pwd)/app/build/outputs/apk/app-debug.apk"
```
