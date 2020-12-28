package com.example.bustowork.data.api.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class ServiceKeyInterceptor() : Interceptor {

    companion object {
        const val serviceKey: String = "%2FqLT4nES96Lq7p7QX4loIY6IEngeztq9OGAA5ubrzGVFlD39ZnAlcU8SmmsyzlzaPLpjlW7DCLk3msWLPqjZig%3D%3D"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url.newBuilder().addEncodedQueryParameter("serviceKey", serviceKey).build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}