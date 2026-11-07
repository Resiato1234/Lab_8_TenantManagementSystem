
package com.example.tenantmanagementsystem.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tenantmanagementsystem.data.model.Tenant

// Defines the database tables and database version.
@Database(
    entities = [Tenant::class],
    version = 1
)
abstract class TenantDatabase : RoomDatabase() {

    // Provides access to the DAO.
    abstract fun tenantDao(): TenantDao

    companion object {

        // Holds the single database instance used by the application.
        @Volatile
        private var INSTANCE: TenantDatabase? = null

        // Returns the existing database or creates it if necessary.
        fun getDatabase(context: Context): TenantDatabase {

            return INSTANCE ?: synchronized(this) {

                val database = Room.databaseBuilder(
                    context.applicationContext,
                    TenantDatabase::class.java,
                    "tenant_database"
                ).build()

                // Store the database instance for future use.
                INSTANCE = database

                database
            }
        }
    }
}
