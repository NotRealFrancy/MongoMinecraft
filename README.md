### Compilation

MongoSpigot is built with [Gradle](https://gradle.org/).
If you have it installed run: ``gradlew build`` in the interested project module.

### Including into your projects

To use this library follow these steps:
1) Add the MongoMinecraft plugin for your server.
2) Add ``` depend: [MongoSpigot] ``` (here use MongoMinecraft version you need)
3) Add MongoDB dependency into your build.gradle or pom.xml:

#### Maven:
```xml
<dependency>
    <groupId>org.mongodb</groupId>
    <artifactId>mongodb-driver-sync</artifactId>
    <version>4.11.0</version>
</dependency>
```

#### Gradle:
```groovy
dependencies {
    implementation 'org.mongodb:mongodb-driver-sync:4.11.0'
}
```