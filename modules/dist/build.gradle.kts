import resourcegenerator.bukkit.excludedRuntimeDependencies

plugins {
    id("hq.shared")
    id("hq.resource-generator")
}

bukkitResourceGenerator {
    main = "kr.hqservice."
    name = ""
    apiVersion = "1.13"
    libraries = excludedRuntimeDependencies()
}

dependencies {
    compileOnly(libs.spigot.api)
    compileOnly(framework.core)
}

tasks.jar {
    archiveBaseName.set(project.rootProject.name)
    archiveVersion.set("")
    archiveClassifier.set("")
    destinationDirectory.set(file(rootProject.projectDir.path + "/build_outputs"))
}