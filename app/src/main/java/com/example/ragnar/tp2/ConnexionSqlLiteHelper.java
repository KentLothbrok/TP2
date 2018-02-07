package com.example.ragnar.tp2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ragnar on 17/01/2018.
 */

public class ConnexionSqlLiteHelper extends SQLiteOpenHelper {

    public ConnexionSqlLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utility.CREAR_TABLA_USUARIO);
        db.execSQL(Utility.CREAR_TABLA_PETS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS " + Utility.TABLA_USUARIO);
        db.execSQL("DROP TABLE IF EXISTS "+ Utility.TABLA_PETS);
        onCreate(db);

    }
}