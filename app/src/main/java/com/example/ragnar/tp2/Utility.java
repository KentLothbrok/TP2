package com.example.ragnar.tp2;

/**
 * Created by ragnar on 17/01/2018.
 */

public class Utility {

    public static final String TABLA_USUARIO="user";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="name";
    public static final String CAMPO_TELEFONO="telef";
    public static final String CREAR_TABLA_USUARIO="CREATE TABLE " + ""+TABLA_USUARIO+" ("+CAMPO_ID+" " + "INTEGER, "+CAMPO_NOMBRE+" TEXT,"+CAMPO_TELEFONO+" TEXT)";

    //ConstanT CHAMP table PETS/animaux
    public static final String TABLA_PETS="pets";
    public static final String CHAMP_ID_PETS="id_pets";
    public static final String CHAMP_NAME_PETS="name_pets";
    public static final String CHAMP_RACE_PETS="race_pets";
    public static final String CHAMP_ID_PROPITIER="id_propietier";
    public static final String CREAR_TABLA_PETS="CREATE TABLE " + ""+TABLA_PETS+" ("+CHAMP_ID_PETS+" INTEGER PRIMARY KEY AUTOINCREMENT, " +CHAMP_NAME_PETS+" TEXT, "+CHAMP_RACE_PETS+" TEXT,"+CHAMP_ID_PROPITIER+" INTEGER)";

}


