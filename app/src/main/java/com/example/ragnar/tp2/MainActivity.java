package com.example.ragnar.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnexionSqlLiteHelper conn=new ConnexionSqlLiteHelper(this,"bd_users",null,1);
    }

    public void onClick(View view) {
        Intent miIntent=null;
        switch (view.getId()){
            /*
            case R.id.btnOptionRegistry: miIntent=new Intent(MainActivity.this,RegistryUsersActivity.class);
            break;
            case R.id.btnRegistryPets:   miIntent=new Intent(MainActivity.this,RegistryPetsActivity.class);
            break;
            case R.id.btnQuery1 :  miIntent=new Intent(MainActivity.this,QueriesUsersActivity.class);
             break;
             case R.id.btnConsultaSpinner: miIntent=new Intent(MainActivity.this,QueriesComboActivity.class);
             break;
             case R.id.btnQueryList: miIntent=new Intent(MainActivity.this,QueriesListViewActivity.class);
             break;
             case R.id.btnQueryListPets: miIntent=new Intent(MainActivity.this,ListPetsActivity.class);
             break;
             case R.id.btnQueryListUserRecycler: miIntent=new Intent(MainActivity.this,ListUserRecycler.class);
            break;
            */
        }

        if (miIntent!=null){
            startActivity(miIntent);
        }
    }
}
