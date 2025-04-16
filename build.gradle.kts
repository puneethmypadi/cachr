plugins {
    id("java")
}

group = "io.github.pmypadi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.38")
    implementation("org.springframework:spring-context:5.3.34")
    implementation("org.java-websocket:Java-WebSocket:1.6.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}