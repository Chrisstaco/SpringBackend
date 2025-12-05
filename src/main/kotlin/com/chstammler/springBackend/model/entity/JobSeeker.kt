package com.chstammler.springBackend.model.entity

import com.chstammler.springBackend.model.enums.Role
import jakarta.persistence.*
import org.hibernate.engine.transaction.internal.jta.JtaStatusHelper.isActive
import java.time.LocalDateTime

@Entity
data class JobSeeker(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    override val id: Long = 0,
    @Column(unique = true)
    override val email: String,
    override val password: String,
    val firstname: String,
    val lastname: String,
    val phoneNumber: String? = null,
    @Lob
    val cv: ByteArray? = null,
    val skills: String, // Jason array
    val education: String,
    override val isActive: Boolean,
    val registerDate: LocalDateTime = LocalDateTime.now(),
    override val role: Role = Role.JOBSEEKER
    ): User(id, email, password, role, isActive)
