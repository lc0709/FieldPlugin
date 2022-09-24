plugins {
    kotlin("jvm") version "1.7.10"
}

group = "kr.ellies"
version = "1.0-SNAPSHOT"

tasks.withType(JavaCompile::class.java){
    options.encoding = "UTF-8"
}
repositories {
    mavenCentral()
    mavenLocal()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://mvn.lumine.io/repository/maven-public/")

}

dependencies {
    implementation("io.papermc.paper:paper-api:1.19.2-R0.1-SNAPSHOT")
    implementation("io.lumine:Mythic-Dist:5.0.3-SNAPSHOT")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}