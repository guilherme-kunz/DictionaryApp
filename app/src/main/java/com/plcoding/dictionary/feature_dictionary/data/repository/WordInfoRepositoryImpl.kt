package com.plcoding.dictionary.feature_dictionary.data.repository

import com.plcoding.dictionary.feature_dictionary.data.local.WordInfoDao
import com.plcoding.dictionary.feature_dictionary.data.remote.DictionaryApi

class WordInfoRepositoryImpl(
    private val api: DictionaryApi,
    private val dao: WordInfoDao
) {
}