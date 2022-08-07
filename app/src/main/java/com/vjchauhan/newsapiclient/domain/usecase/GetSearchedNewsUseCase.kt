package com.vjchauhan.newsapiclient.domain.usecase

import com.vjchauhan.newsapiclient.data.model.APIResponse
import com.vjchauhan.newsapiclient.data.util.Resource
import com.vjchauhan.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
         return newsRepository.getSearchedNews(country,searchQuery,page)
     }
}