# JenkinsTest - CI/CD Pipeline Demo

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.3-green)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.9.9-orange)](https://maven.apache.org/)
[![Jenkins](https://img.shields.io/badge/Jenkins-2.492.2-red)](https://www.jenkins.io/)

## Overview
`JenkinsTest` is a demonstration project showcasing a Continuous Integration and Continuous Deployment (CI/CD) pipeline using **Jenkins** and a **Spring Boot** application. The repository contains a simple Spring Boot app (`JenkinsDemo`) and a Jenkins pipeline configuration to automate building, testing, and staging deployments across Development, UAT, and Production environments.

This project was created to explore CI/CD workflows, integrating Jenkins with GitHub for automated triggers on code pushes.

## Project Structure
- **`JenkinsDemo/`**: A Spring Boot application with a basic test suite.
  - `pom.xml`: Maven configuration for dependencies and build.
  - `src/main/java/com/george/JenkinsDemoApplication.java`: Main application class.
  - `src/test/`: Unit tests for validation.
- **Jenkins Pipeline**: Defined in `DevPipeline`, automating the CI/CD process.

## Features
- **CI/CD Pipeline**:
  - **Development Stage**: Builds and tests the Spring Boot app (`mvn clean install`).
  - **UAT Stage**: Simulates deployment to User Acceptance Testing (placeholder).
  - **Production Stage**: Simulates production deployment (placeholder).
- **GitHub Integration**: Triggers on pushes to the `main` branch.
- **Spring Boot**: Lightweight app with a test case to verify context loading.

## Prerequisites
- **Java**: 17 or higher (tested with OpenJDK 23.0.2).
- **Maven**: 3.9.9 or compatible.
- **Jenkins**: 2.492.2 with Git and Maven plugins.
- **Git**: For cloning and pushing changes.

## Setup and Usage

### Local Build
1. Clone the repository:
   ```bash
   git clone https://github.com/Jujuwryy/JenkinsTest.git
   cd JenkinsTest/JenkinsDemo
