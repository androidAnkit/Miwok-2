package com.example.miwok;

import androidx.annotation.NonNull;

public class reportCard {

    private String mname;
    private String EnglishGrade;
    private String HindiGrade;
    private String MathGrade;

    public reportCard(){

    }

    public reportCard(String name, String EnglishGrade,String HindiGrade, String MathGrade ){
        this.mname = name;
        this.EnglishGrade = EnglishGrade;
        this.HindiGrade = HindiGrade;
        this.MathGrade = MathGrade;
    }

    public String getMname(){
        return mname;
    }
    public void setMname(String name){
        this.mname = name;
    }

    public String getEnglishGrade() {
        return EnglishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        EnglishGrade = englishGrade;
    }

    public String getHindiGrade() {
        return HindiGrade;
    }

    public void setHindiGrade(String hindiGrade) {
        HindiGrade = hindiGrade;
    }

    public String getMathGrade() {
        return MathGrade;
    }

    public void setMathGrade(String mathGrade) {
        MathGrade = mathGrade;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
