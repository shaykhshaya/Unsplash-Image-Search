package com.shaya.imagesearchapp.api

import com.shaya.imagesearchapp.data.UnsplashPhoto

// UnsplashResponse contains UnsplashPhoto objects
data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)