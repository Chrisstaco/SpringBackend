package com.chstammler.springBackend.model.entity

import com.chstammler.springBackend.model.enums.ExperienceLevel
import com.chstammler.springBackend.model.enums.JobType
import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class JobOffering(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val jobTitle: String,
    @Lob
    val description: String,
    @Enumerated(EnumType.STRING)
    val jobType: JobType,
    val salaryMin: Double,
    val salaryMax: Double,
    val currency: String = "USD",
    @Enumerated(EnumType.STRING)
    val experienceLevel: ExperienceLevel,
    val publishDate: LocalDate,
    val postDate: LocalDate = LocalDate.now(),
    val isActive: Boolean = false,
    @ManyToOne
    val employer: Employer,
    @ElementCollection
    val tags: List<String> =emptyList(),
    )
