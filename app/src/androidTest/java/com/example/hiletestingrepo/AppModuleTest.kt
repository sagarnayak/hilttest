package com.example.hiletestingrepo

import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Named
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [AppModule::class]
)
object AppModuleTest {

    @Singleton
    @Provides
    fun providesFakeRepo(): SuperRepo {
        return FakeRepo()
    }

    @Singleton
    @Provides
    @Named("two")
    fun providesRealRepoTwo(): SuperRepo {
        return RealRepoTwo()
    }
}