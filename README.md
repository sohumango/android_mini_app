# android_mini_app

base on: https://github.com//minimal-android-project.git

This repository explores how simple it can be to set up a valid,
working Android project. You will need:

* One `.java` activity source file, placed in its appropriate package
  directory
* One `AndroidManifest.xml`
* One `build.gradle`
  * Certainly this is optional, as you can build the project using
    command line tools from the Android SDK. But let's not complicate
    things unnecessarily.

## How to build

```
$ git clone https://github.com/sohumango/android_mini_app.git
$ gradle build
```

## Notes

[Gradle Wrapper]: https://gradle.org/docs/current/userguide/gradle_wrapper.html
[build.gradle]: build.gradle

This project makes a few assumptions about your environment in order
to build correctly:

* You have `gradle` installed, for Mac: brew install gradle
* You have `JAVA_HOME` set up.
* You have `ANDROID_HOME` set to the root folder of your Android SDK installation.
* SDK and build tools versions are hardcoded in [build.gradle][] to `23`, respectively.

Additionally, the folder structure relies on the source set convention
expected by the Gradle Android plugin:

```
project
  ├── README.md
  ├── build.gradle
  └── src
      └── main
          ├── AndroidManifest.xml
          └── java
              └── com
                  └── minimal
                      └── MainActivity.java
```
