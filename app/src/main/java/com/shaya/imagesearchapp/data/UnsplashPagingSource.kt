package com.shaya.imagesearchapp.data

import androidx.paging.PagingSource
import com.shaya.imagesearchapp.api.UnsplashApi
import retrofit2.HttpException
import java.io.IOException

private const val UNSPLASH_STARTING_PAGE_INDEX = 1


//PagingSource is a class that actually knows how to load data form REST Api and turn it into pages
class UnsplashPagingSource(
    private val unsplashApi: UnsplashApi,
    private val query: String
) : PagingSource<Int, UnsplashPhoto>() {    //Int is used to distinguish between pages and second argument is the type of data to fill these pages.


    //triggger the api request and converts the data into pagers
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UnsplashPhoto> {
        val position = params.key ?: UNSPLASH_STARTING_PAGE_INDEX

        return try {
            val response = unsplashApi.searchPhotos(query, position, params.loadSize)
            val photos = response.results

            LoadResult.Page(
                data = photos,
                prevKey = if (position == UNSPLASH_STARTING_PAGE_INDEX) null else position - 1,
                nextKey = if (photos.isEmpty()) null else position + 1// Here .isEmpty in photolist, we get back empty means its the last photo
            )
        } catch (exception: IOException) {//when no internet connection
            LoadResult.Error(exception)
        } catch (exception: HttpException) {//error in link or no data at the end point
            LoadResult.Error(exception)
        }
    }
}

/**
Now we need to use this Paging source to construct paging data which we need to feed recycler view adapter
Unsplash repository will extract this data for us*/
