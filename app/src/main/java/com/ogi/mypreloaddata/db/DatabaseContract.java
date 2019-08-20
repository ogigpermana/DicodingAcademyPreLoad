package com.ogi.mypreloaddata.db;

import android.provider.BaseColumns;

public class DatabaseContract {
    static String TABLE_NAME = "table_mahasiswa";

    static final class MahasiswaColumns implements BaseColumns{
        static String NAME = "name";
        static String NIM = "nim";
    }
}
