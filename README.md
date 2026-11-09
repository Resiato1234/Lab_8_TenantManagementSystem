# Tenant Management System

## Project Overview
The Tenant Management System is an Android application developed using Kotlin. It helps users manage tenant information by allowing them to add and view tenant records.

## Features
- Add new tenant records.
- View saved tenant information.
- Store tenant records using a local Room database.
- Display tenant information using LiveData.
- Manage application data through the ViewModel and Repository architecture.

## Technologies Used
- Kotlin
- Android Studio
- Room Database
- ViewModel
- LiveData
- Kotlin Coroutines
- Git and GitHub

## Application Architecture

The application follows the MVVM (Model-View-ViewModel) architecture.

- **UI Layer:** Displays application screens and handles user interaction.
- **ViewModel:** Manages UI-related data and exposes it through LiveData.
- **Repository:** Acts as the connection between the ViewModel and the data source.
- **Room Database:** Provides local storage for tenant records.
- **DAO:** Defines database operations for inserting and retrieving tenant records.

## Group Contributions

| Group Member | Contribution |
171762 - Stage 1 Project Lead, responsible for setting up the GitHub repository, adding group collaborators, configuring the `.gitignore`, organizing the project into `ui` and `data` packages, updating file references, and ensuring the application built and ran successfully.

177877- Stage 2: ViewModel. Created the TenantViewModel in the ui.viewmodel package to handle business logic. Set up LiveData for the tenant list, total rent, and formatted text for the screens, and added the necessary lifecycle dependencies to the Gradle files.

170398 - Stage 3: Room database 
The app's local database was built using Room so that tenants are saved on the phone and survive closing the app. `Tenant` was turned into a Room entity (a table with `name`, `phone`, `rent` and an auto-generated `id`), `TenantDao` was created with `insertTenant()` and `getAllTenants()` (which returns `LiveData`, sorted by name), and `TenantDatabase` was created to give the whole app one shared database instance. The KSP plugin and Room libraries were also added to both `build.gradle.kts` files.

170966 – Stage 4: Screens. Connected the Dashboard, Add Tenant, and View Tenants Fragments to the shared TenantViewModel. Implemented Data Binding on the Dashboard, LiveData observation on the View Tenants screen, and updated Add Tenant to save tenant details through the ViewModel instead of directly accessing the Repository. Changes were reviewed, approved, and merged into "main".

145937 - In Stage 5, I connected the app to the Room database so that tenant records are saved permanently and survive even when the app is closed. I updated the tenant repository to act as the single entry point for the data, and I modified the tenantviewmodel to save new tenants in the background using coroutines so the screen never freezes. Thanks to our layered architecture, I upgraded the entire storage system without having to change a single line of code in the visual screens.

## Installation
1. Download the `app-release.apk` file from the GitHub Releases section.
2. Install the APK on an Android device.
3. Open the Tenant Management System.

## Release
**Version:** v1.0

The first release includes the tenant management functionality and local database integration.
