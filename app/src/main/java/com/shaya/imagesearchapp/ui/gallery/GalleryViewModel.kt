package com.shaya.imagesearchapp.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.shaya.imagesearchapp.data.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
    ) : ViewModel() {

        private val currentQuery = MutableLiveData(DEFAULT_QUERY)

        //val photos = repository.getsSearchResult("cats")
        val photos = currentQuery.switchMap { queryString ->//this should be the new live data value when the search value changes
            repository.getsSearchResult(queryString).cachedIn(viewModelScope) //.chatchedIn to chatch this new live data

        }

    fun searchPhotos(query: String) {//we call this method from fragment when we search from searchview
        currentQuery.value = query
    }

    companion object{
        private const val DEFAULT_QUERY = "cats"
    }

}