package com.chstammler.springBackend.model.entity

import com.chstammler.springBackend.model.enums.Role
import jakarta.persistence.*

@Entity
data class Employer(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    override val id: Long,
    @Column(unique = true)
    override val email: String,
    override val password: String,
    val companyName: String,
    val phoneNumber: String,
    val url: String,
    val industry: String,
    val companySize: String,
    @Lob
    val jobDescription: String,
    val address: String,
    override val isActive: Boolean = false,
    override val role: Role = Role.EMPLOYER
): User(id, email, password, role, isActive)
