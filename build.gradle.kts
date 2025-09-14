plugins {
    id("java")
}

group = "org.robote"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("com.github.bailuk:java-gtk:0.5.0")
}

tasks.test {
    useJUnitPlatform()
}