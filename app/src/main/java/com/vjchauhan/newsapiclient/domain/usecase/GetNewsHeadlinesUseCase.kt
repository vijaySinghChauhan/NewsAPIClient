package com.vjchauhan.newsapiclient.domain.usecase

import com.vjchauhan.newsapiclient.data.model.APIResponse
import com.vjchauhan.newsapiclient.data.util.Resource
import com.vjchauhan.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country : String, page : Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country,page)
    }
}