package com.chstammler.springBackend.model.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Application(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @ManyToOne
    val jobSeeker: JobSeeker,
    @ManyToOne
    val jobOffering: JobOffering,
    val applicationDate: LocalDate= LocalDate.now(),
    @Lob
    val coverLetter: String? = null
)
