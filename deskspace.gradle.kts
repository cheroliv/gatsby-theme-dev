buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
//    @Suppress("GradlePackageUpdate")
//    dependencies {
//        testImplementation(gradleTestKit())
//        testImplementation("org.junit.jupiter:junit-jupiter:${properties["junit_jupiter_version"] as String?}")
//        implementation(kotlin("stdlib", properties["kotlin_version"] as String?))
//        implementation(kotlin("reflect", properties["kotlin_version"] as String?))
//        testImplementation("org.apache.logging.log4j:log4j-api:2.14.1")
//        testImplementation("org.apache.logging.log4j:log4j-core:2.14.1")
//        implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
//        implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.0")
//    }
}

plugins {
    val kotlinVersion = "1.6.0"
    kotlin("jvm") version (kotlinVersion)
    kotlin("plugin.serialization") version (kotlinVersion)
//    `java-gradle-plugin`
//    `kotlin-dsl`
//    checkstyle
//    id("com.google.cloud.tools.jib") version ("3.1.4")
}


@Suppress("GradlePackageUpdate")
dependencies {
    testImplementation(gradleTestKit())
    testImplementation("org.junit.jupiter:junit-jupiter:${properties["junit_jupiter_version"] as String?}")
    implementation(kotlin("stdlib", properties["kotlin_version"] as String?))
    implementation(kotlin("reflect", properties["kotlin_version"] as String?))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.0")
}

repositories {
    mavenCentral()
}

group = "education.cccp.deskspace"
version = "0.0.1-SNAPSHOT"

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

interface Deliverable {
    fun create()
    fun run()
    fun deploy()
}

class JbakeSite(val path: String) : Deliverable {
    override fun create() {
        println("create JbakeSite")
    }

    override fun run() {
        println("run JbakeSite")
    }

    override fun deploy() {
        println("deploy JbakeSite")
    }

}


class JhipsterMonolithWebapp(val path: String) : Deliverable {
    override fun create() {
        println("create JhipsterMonolithWebapp")
    }

    override fun run() {
        println("run JhipsterMonolithWebapp")
    }

    override fun deploy() {
        println("deploy JhipsterMonolithWebapp")
    }

}

class DeliverableItem(val path: String) : Deliverable {
    override fun create() {
        println("create JhipsterMonolithWebapp")
    }

    override fun run() {
        println("run JhipsterMonolithWebapp")
    }

    override fun deploy() {
        println("deploy JhipsterMonolithWebapp")
    }

}

tasks.register<DefaultTask>("hello") {
    doLast { println("Hello!") }
}

//tasks.register<DefaultTask>("HelloWorld") {
//    doFirst {
//        description = "Delete directory build/resources"
//        group = "build"
//        println("helloworld!")
//        logger.info("helloworld!")
//    }
//}

//TODO: deskspace tasks
//créer une webapps:hipster-monolith
//~/src/deskspace/webapps/hipster-monolith jhipster --skip-client --skip-install --skip-git
//TODO: article skeleton
//https://docs.gradle.org/current/userguide/custom_plugins.html
