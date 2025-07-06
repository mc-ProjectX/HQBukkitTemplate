plugins {
    id("hq.shared")
    id("hq.shadow")
    id("kr.hqservice.resource-generator.bukkit")
}

bukkitResourceGenerator {
    main = "kr.project-x."
    name = "${extra["projectName"]}"
    apiVersion = "1.13"
    depend = listOf("HQFramework")
    libraries = excludedRuntimeDependencies()
}

dependencies {
    compileOnly(libs.paper.api)
    compileOnly(framework.core)
    runtimeOnly(project(":modules:core"))
    runtimeOnly(project(":modules:api"))
}
