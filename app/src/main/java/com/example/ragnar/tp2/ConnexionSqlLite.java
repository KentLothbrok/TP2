package com.example.ragnar.tp2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by ragnar on 24/11/2017.
 */

public class ConnexionSqlLite extends SQLiteOpenHelper{

    public ConnexionSqlLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version); }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DatabaseSQLite.TABLE_USER);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseSQLite.TABLE_USER);
        onCreate(db);

    }
}
