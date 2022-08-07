package com.vjchauhan.newsapiclient.presentation.di

import com.vjchauhan.newsapiclient.data.db.ArticleDAO
import com.vjchauhan.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.vjchauhan.newsapiclient.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO):NewsLocalDataSource{
      return NewsLocalDataSourceImpl(articleDAO)
    }

}













