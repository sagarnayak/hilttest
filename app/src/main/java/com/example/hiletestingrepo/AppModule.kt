package com.example.hiletestingrepo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesRealRepo(): SuperRepo {
        return RealRepo()
    }

    @Singleton
    @Provides
    @Named("two")
    fun providesRealRepoTwo(): SuperRepo {
        return RealRepoTwo()
    }
}