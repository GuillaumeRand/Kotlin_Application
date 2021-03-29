package com.epitech.epicture.config

/**
 * Configuration class, it contains data used across the entire application
 */
class Config {
    companion object {
        const val CLIENT_ID: String = "46b221d18e1f905"
        const val REDIRECT_URI: String = "https://www.epicture.eu/callback"
        const val CLIENT_SECRET: String = "d9cd23bd0a58073b39bde13e1d06adc8514c219b"
        const val ACCESS_TOKEN_KEY: String = "access_token"
        const val CLIENT_ID_KEY: String = "client_id"
        const val CLIENT_SECRET_KEY: String = "client_secret"
        const val GRANT_TYPE_KEY: String = "grant_type"
        const val GRANT_TYPE: String = "refresh_token"
        const val REFRESH_TOKEN_KEY: String = "refresh_token"
        const val ACCOUNT_USERNAME_KEY: String = "account_username"
        const val ACCOUNT_ID_KEY: String = "account_id"
        const val PAGE_INITIAL_IDX = 0
        val FORMATS_EXTENSION = mapOf(
                "image/jpeg" to ".jpg",
                "image/gif" to ".gif",
                "image/png" to ".png"
        )
    }
}