plugins {
    application
}

repositories {
    mavenCentral()
}

java {
    version = 17
}

dependencies {
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
