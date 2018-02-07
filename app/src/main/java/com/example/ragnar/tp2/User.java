package com.example.ragnar.tp2;

import java.io.Serializable;

/**
 * Created by ragnar on 24/11/2017.
 */

public class User implements Serializable{

    public Integer id;
    public String prenom;
    public String telephone;
    public String adresse;

    public User(Integer id, String prenom, String telephone, String adresse){

        this.id=id;
        this.prenom=prenom;
        this.telephone=telephone;
        this.adresse=adresse;

    }

    public Integer getId(){
        return id;
    }

    public String getPrenom(){
        return prenom;
    }

    public String getTelephone(){
        return telephone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;

    }
}
