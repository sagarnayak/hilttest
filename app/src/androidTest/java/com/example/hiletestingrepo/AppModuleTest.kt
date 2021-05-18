package com.example.hiletestingrepo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModuleTest {

    @Singleton
    @Provides
    @Named("test")
    fun providesFakeRepo(): SuperRepo {
        return FakeRepo()
    }
}