import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("flavor-type")

    productFlavors {
        create("dev") {
            dimension = "flavor-type"
            applicationId = "com.example.flutter_demo.dev"
            resValue(type = "string", name = "app_name", value = "flutter_demo Dev")
        }
        create("prod") {
            dimension = "flavor-type"
            applicationId = "com.example.flutter_demo"
            resValue(type = "string", name = "app_name", value = "flutter_demo")
        }
    }
}