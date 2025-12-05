package com.chstammler.springBackend.model.entity

import com.chstammler.springBackend.model.enums.Role
import io.jsonwebtoken.security.Password
import jakarta.persistence.*

@Entity
data class Admin(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    override val id: Long =0,
    @Column(unique = true)
    override val email: String,
    override val password: String,
    val name: String,
    override val role: Role = Role.ADMIN,
    override val isActive: Boolean = false,
): User(id,email,password, role,isActive)
