package com.example.project_gui;

import java.util.ArrayList;

public class UserData {
    private ArrayList<String> answersKinematik;
    private ArrayList<String> answersDynamik;
    private ArrayList<String> answersStatik;

    public ArrayList<String> getUserInputKinematik() {return answersKinematik;}
    public ArrayList<String> getUserInputDynamik() {return answersDynamik;}
    public ArrayList<String> getUserInputStatik() {return answersStatik;}

    public void setUserInputKinematik(ArrayList<String> answersKinematik) {this.answersKinematik = answersKinematik;}
    public void setUserInputDynamik(ArrayList<String> answersDynamik) {this.answersDynamik = answersDynamik;}
    public void setUserInputStatik(ArrayList<String> answersStatik) {this.answersStatik = answersStatik;}

}
