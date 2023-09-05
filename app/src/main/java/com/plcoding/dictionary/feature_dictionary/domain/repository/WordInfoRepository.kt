package com.plcoding.dictionary.feature_dictionary.domain.repository

import com.plcoding.dictionary.core.util.Resource
import com.plcoding.dictionary.feature_dictionary.domain.model.WordInfo
import java.util.concurrent.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>


}