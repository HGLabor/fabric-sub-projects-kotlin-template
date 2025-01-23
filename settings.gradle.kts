pluginManagement {
	repositories {
		mavenCentral()
		maven(url = "https://maven.fabricmc.net/") {
			name = "Fabric"
		}
		gradlePluginPortal()
	}
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

rootProject.name = "template"
include(":api")
include(":client")

// prefix all submodules with the name of the root project
changeProjectNames(rootProject.name, rootProject)

fun changeProjectNames(prefix: String, parent: ProjectDescriptor) {
	parent.children.forEach {
		it.name = "${prefix}-${it.name}"
		changeProjectNames(prefix, it)
	}
}
