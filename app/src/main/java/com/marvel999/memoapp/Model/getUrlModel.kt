package com.marvel999.memoapp.Model

data class getUrlModelkt(
    val author: String,
    val nsfw: Boolean,
    val postLink: String,
    val preview: List<String>,
    val spoiler: Boolean,
    val subreddit: String,
    val title: String,
    val ups: Int,
    val url: String
)

