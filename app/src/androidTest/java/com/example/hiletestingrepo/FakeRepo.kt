package com.example.hiletestingrepo

class FakeRepo : SuperRepo {
    override fun login(): String {
        return "fake"
    }
}