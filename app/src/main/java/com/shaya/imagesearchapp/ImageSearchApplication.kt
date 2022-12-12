package com.shaya.imagesearchapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


/**any app using dagger hilt requires dagger application class*/

@HiltAndroidApp
class ImageSearchApplication : Application() {
}