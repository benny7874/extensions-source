import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "World Journal"
    versionCode = 1
    contentWarning = ContentWarning.SAFE
    libVersion = "1.6"

    source {
        name = "世界日報－紐約"
        lang = "zh"
        baseUrl = "https://www.worldjournal.com"
    }
}
