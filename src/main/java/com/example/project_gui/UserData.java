package com.example.project_gui;

import java.util.ArrayList;

public class UserData {
    private ArrayList<String> answersKinematik;
    private ArrayList<String> answersDynamik;
    private ArrayList<String> answersStatik;
    private ArrayList<String> answersMolecular;
    private ArrayList<String> answersElectroDynamik;
    private ArrayList<String> answersQuantum;

    public ArrayList<String> getUserInputKinematik() {return answersKinematik;}
    public ArrayList<String> getUserInputDynamik() {return answersDynamik;}
    public ArrayList<String> getUserInputStatik() {return answersStatik;}
    public ArrayList<String> getUserInputMolecular() {return answersMolecular;}
    public ArrayList<String> getUserInputElectroDynamik() {return answersElectroDynamik;}
    public ArrayList<String> getUserInputQuantum() {return answersQuantum;}


    public void setUserInputKinematik(ArrayList<String> answersKinematik) {this.answersKinematik = answersKinematik;}
    public void setUserInputDynamik(ArrayList<String> answersDynamik) {this.answersDynamik = answersDynamik;}
    public void setUserInputStatik(ArrayList<String> answersStatik) {this.answersStatik = answersStatik;}
    public void setUserInputMolecular(ArrayList<String> answersMolecular) {this.answersMolecular = answersMolecular;}
    public void setUserInputElectroDynamik(ArrayList<String> answersElectroDynamik) {this.answersElectroDynamik = answersElectroDynamik;}
    public void setUserInputQuantum(ArrayList<String> answersQuantum) {this.answersQuantum = answersQuantum;}


}
