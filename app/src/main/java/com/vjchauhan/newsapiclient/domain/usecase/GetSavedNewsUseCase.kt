package com.vjchauhan.newsapiclient.domain.usecase

import com.vjchauhan.newsapiclient.data.model.Article
import com.vjchauhan.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}