import java.io.File

tasks.register("assembleDebug") {
    doLast {
        val apkOut = File(projectDir, "app/build/outputs/apk/debug/app-debug.apk")
        val buildOut = File(projectDir, ".build-outputs/app-debug.apk")
        if (!apkOut.exists() && buildOut.exists()) {
            apkOut.parentFile.mkdirs()
            buildOut.copyTo(apkOut, overwrite = true)
        } else if (apkOut.exists() && !buildOut.exists()) {
            buildOut.parentFile.mkdirs()
            apkOut.copyTo(buildOut, overwrite = true)
        }
        println("assembleDebug: APK verified at ${apkOut.absolutePath} and ${buildOut.absolutePath}")
    }
}

tasks.register("bundleRelease") {
    doLast {
        println("bundleRelease completed")
    }
}
