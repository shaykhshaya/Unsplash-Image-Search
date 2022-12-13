
# UNSPLASH

The app, 'UNSPLASH' can search the Unsplash API for images and display them in RecyclerView. For this, we have used android MVVM architecture, Paging 3, Glide, Retrofit, Couroutines, the Navigation Component, View Binding and Dagger Hilt.


## Acknowledgements

 - [MVVM architechture](https://developer.android.com/topic/architecture?gclid=Cj0KCQiA4uCcBhDdARIsAH5jyUnSnU7gYYdDxpL0TvpBrvr0uSEAqJpnCqOyL5mQnhY5OaP95fwgKLkaAomrEALw_wcB&gclsrc=aw.ds)
 - [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview)
 - [Glide](https://bumptech.github.io/glide/int/compose.html?utm_source=developer.android.com&utm_medium=referral)
 - [Retrofit](https://developer.android.com/codelabs/basic-android-kotlin-training-getting-data-internet#4)
 - [Couroutines](https://developer.android.com/kotlin/coroutines)
 - [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started)
 - [View Binding](https://developer.android.com/topic/libraries/view-binding)
 - [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android)


## Unsplash API Reference

#### Search photos

```http
  GET /search/photos
```

| Parameter    | Description                |
| :--------   | :------------------------- |
| query |  Search terms|
|page |Page number to retrieve. (Optional; default: 1)|
|per_page|Number of items per page. (Optional; default: 10)|




## Screenshots

![Home Screen](https://user-images.githubusercontent.com/119520622/207369425-682057f1-7e9f-4785-be4e-95f4a723dca2.png)
![Search_screen](https://user-images.githubusercontent.com/119520622/207369450-cc1e6f6a-3f28-43a7-8fbd-2b6eaeeece7d.png)
![Detail Screen](https://user-images.githubusercontent.com/119520622/207369464-f3fc0ea0-da20-4adc-b050-0f4488965462.png)

