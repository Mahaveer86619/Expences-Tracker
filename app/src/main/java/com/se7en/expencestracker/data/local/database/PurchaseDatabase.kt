package com.se7en.expencestracker.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.se7en.expencestracker.data.local.dao.PurchaseDao
import com.se7en.expencestracker.data.local.dao.TransactionDao
import com.se7en.expencestracker.data.local.model.Purchase

@Database(
    entities = [Purchase::class, TransactionDatabase::class],
    version = 1
)
abstract class RoomDatabase: RoomDatabase() {

    abstract val purchaseDao: PurchaseDao
    abstract val transactionDao: TransactionDao

}