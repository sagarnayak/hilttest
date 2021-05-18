package com.example.hiletestingrepo

class RealRepo : SuperRepo {
    override fun login(): String {
        return "real one"
    }
}