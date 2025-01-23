dependencies {
  api(project(":template-api", configuration = "namedElements"))

  modApi(libs.bundles.fabric)
  modApi(libs.bundles.silk)
  modApi(libs.bundles.performance)
}
