package com.chstammler.springBackend.model.entity

import com.chstammler.springBackend.model.enums.Role
import jakarta.persistence.*



// User base class thar gets inherited by Admin, Employer and Joseeker
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
abstract class User (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(unique = true)
    val email: String,
    val password: String,

    @Enumerated(EnumType.STRING)
    val role: Role,
    val isActive: Boolean
)