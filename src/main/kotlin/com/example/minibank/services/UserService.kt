package com.example.minibank.services

import com.example.minibank.models.User
import com.example.minibank.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun save(user: User): User {
        return this.userRepository.save(user)
    }
}