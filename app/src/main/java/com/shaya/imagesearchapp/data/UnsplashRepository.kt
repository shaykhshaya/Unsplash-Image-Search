package com.shaya.imagesearchapp.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.shaya.imagesearchapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

/**to get the object of AppModule available at our repository*/
// Need this repository at our viewModel

@Singleton
/**@inject because we want dagger to pass the unsplashApi for the Repository */
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {

    fun getsSearchResult(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 20,
                maxSize = 100,
                enablePlaceholders = false //goes on scrolling, which takes lot of data hence it is false
            ),
            pagingSourceFactory = { UnsplashPagingSource(unsplashApi, query) }
        ).liveData

}