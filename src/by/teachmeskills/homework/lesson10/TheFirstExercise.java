package by.teachmeskills.homework.lesson10;

import java.util.Arrays;

public class TheFirstExercise {

    static String str = "1111-dip-7777-muv-3s9g";

    public static void digitOutput() {
        //String str = "1111-dip-7777-muv-3s9g";
        String digitBlock = getStr();
        String[] digitBlockArr = digitBlock.split("-");
        System.out.println(String.valueOf(digitBlockArr[0]) + String.valueOf(digitBlockArr[2]));
    }

    public static void letterSubstitution() {
        String letterToStar = getStr();
        //StringBuilder stringBuilder = new StringBuilder(letterToStar);
        String[] letterToStarArr = letterToStar.split("-");
        letterToStarArr[1] =letterToStarArr[3]="***";
        letterToStar=String.valueOf(letterToStarArr);
        System.out.println(letterToStar);
        //stringBuilder.setCharAt(6,'*').setCharAt(7,'*').setCharAt(8,'*').;
        //letterToStar = letterToStar.replace("dip","***").replace("muv","***");
        //System.out.println(letterToStar);
    }


    public static String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
