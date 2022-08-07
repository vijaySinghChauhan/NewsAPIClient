package com.vjchauhan.newsapiclient.domain.usecase

import com.vjchauhan.newsapiclient.data.model.Article
import com.vjchauhan.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}