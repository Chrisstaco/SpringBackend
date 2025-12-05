package com.chstammler.springBackend.model.enums

//This enum class represents the 3 roles a User can have in this Service
//Admin runs the service, Employer can post job offerings and read applications
// And The Jobseeker can read job offerings and post applications
enum class Role {
    ADMIN, EMPLOYER, JOBSEEKER
}