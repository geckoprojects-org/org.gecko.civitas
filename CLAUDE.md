# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a **Civitas prototype** project focused on asset management and alarm systems. It's built using **OSGi/Eclipse Modeling Framework (EMF)** with **bnd tools** for OSGi bundle management and **Gradle** as the build system.

### Core Architecture

- **OSGi-based**: Uses bnd workspace with OSGi bundles for modular architecture
- **EMF Models**: Ecore models define domain entities (Asset, Person, Location, Alarms, GDPR compliance)
- **Data In Motion Stack**: Uses Gecko libraries for OSGi integration, testing, and tooling
- **Model-Driven**: Generates Java code from .ecore models using fennecEMF code generation

### Key Models (src: org.civitas.prototype.model/model/)
- `civitas-base.ecore`: Core entities (Asset, Person, AssetOperator, Location, Contact)
- `civitas-alarm.ecore`: Alarm system modeling
- `civitas-gdpr.ecore`: GDPR compliance modeling

## Development Commands

### Build & Test
```bash
# Full build and test
./gradlew build

# Clean build
./gradlew clean build

# Build specific module
./gradlew :org.civitas.prototype.model:build

# Release (creates OSGi bundles)
./gradlew release
```

### Development Workflow
```bash
# Assemble without tests
./gradlew assemble

# Run unit tests with JaCoCo coverage
./gradlew test

# Run OSGi integration tests
./gradlew testOSGi

# Clean cache (bnd workspace cache)
./gradlew cleanCache
```

### Code Quality
- **JaCoCo**: Coverage reports generated in `build/reports/jacoco/`
- **SonarQube**: Configured for code quality analysis
- **JUnit 5**: Testing framework with OSGi integration

## Project Structure

### Key Directories
- `org.civitas.prototype.model/`: Main EMF model bundle
  - `model/`: Ecore and GenModel files
  - `src/`: Generated and hand-written Java code
  - `data/`: Sample XMI model instances
- `cnf/`: bnd workspace configuration
- `build/`: Gradle build outputs

### Important Configuration Files
- `cnf/build.bnd`: OSGi workspace configuration with library imports
- `settings.gradle`: Multi-module Gradle setup with bnd workspace plugin
- `build.gradle`: Root build with JaCoCo, SonarQube, and JUnit setup
- `Jenkinsfile`: CI/CD pipeline for main/snapshot branches

## EMF Model Generation

### Creating ECore Models with GenModel
When creating new .ecore models, follow these steps:
1. Create the .ecore model file in `model/` directory
2. Generate the corresponding .genmodel file from the .ecore model
3. Configure GenModel with required annotations:
   - `modelName`: Use appropriate model name
   - `complianceLevel`: 17.0
   - `copyrightText`: Use standard Data In Motion copyright text
   - `resource`: XMI
   - `oSGiCompatible`: true (exact case)
   - `prefix`: Set appropriate prefix for the model

### Code Generation
- Code generation is commented out in `bnd.bnd` (lines 7-13) for performance
- Uncomment `-generate` instruction to regenerate Java classes from models
- Uses `fennecEMF` generator with output to `src/` directory
- GenModel settings follow Data In Motion standards (Java 17, OSGi-compatible)

## Libraries & Dependencies

### Core Libraries (cnf/build.bnd)
- `geckoDIMC`: Data In Motion configuration and tooling
- `geckoOSGi-Test`: OSGi testing support  
- `geckoJacoco`: Test coverage integration
- `geckoEMF`: EMF/OSGi integration
- `fennecCamel`: Apache Camel integration
- `geckoEMFUtil`: EMF utilities for Jakarta RS

### Testing
- JUnit 5 Platform with OSGi integration
- Mockito for mocking
- AssertJ for fluent assertions
- Test reports in `generated/test-reports/`

## Deployment & Release

- **Snapshot builds**: Deploy to `cnf/release/` for development
- **Release builds**: Version-controlled releases via Jenkins
- **Repository**: Uses Maven Central and custom Gecko repositories
- **Baselining**: Enabled for API compatibility checking