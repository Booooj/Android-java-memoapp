package com.example.memo2.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Memo {
    @PrimaryKey
    public int mid;

    @ColumnInfo(content = "content")
    public String content;
}
