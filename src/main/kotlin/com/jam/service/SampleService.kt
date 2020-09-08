package com.jam.service

import org.springframework.stereotype.Service

@Service
class SampleService {
    private var data : String? = null

    fun setData(data: String) {
        this.data = data
    }

    fun getData() : String {
        return data ?: ""
    }

}