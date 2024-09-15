package com.andwati.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.defaultRequest

class ktorClient {
    private val client = HttpClient(OkHttp){
        defaultRequest { url("https://rickandmortyapi.com/api/") }
    }
}