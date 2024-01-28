package com.se7en.expencestracker.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.util.Date

@Entity(tableName = "purchase_list")
data class PurchaseList (

    @ColumnInfo(name = "purchase_list_id")
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val name: String,

    val price: String,

    val dateAdded: Date

)

