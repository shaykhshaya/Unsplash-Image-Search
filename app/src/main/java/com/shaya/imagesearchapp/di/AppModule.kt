package com.shaya.imagesearchapp.di

import com.shaya.imagesearchapp.api.UnsplashApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


//to get instance of unsplashapi
@Module //to turn it into dagger module
@InstallIn(ApplicationComponent::class)
object AppModule {

    //Make two methods which knows how to make objects what we need
    //want to return retrofit instance form this method
    @Provides  //using provide annotation, converting the method into dagger provide method, which tells dagger how to create object, in this case retrofit object
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(UnsplashApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    //Responsible of returning the instance of UnsplashApi
    @Provides
    @Singleton
    fun provideUnsplashApi(retrofit: Retrofit): UnsplashApi =
        retrofit.create(UnsplashApi::class.java)
}