package com.mycompany;

/**
 * Created by kornel on 25.05.17.
 */
public class Pesel {
    Integer[] number;


    public Pesel(String p) {
        number = new Integer[p.length()];

        for (int i = 0; i < p.length(); i++) {
            number[i] = Integer.parseInt(String.valueOf(p.charAt(i)));  //Exception in this line
        }
    }

    public boolean isCorrect() {
        if (controlSum() == number[10])
            return true;
        else
            return false;


    }

    private Integer controlSum() {
        String controlSumString = "";

        Integer controlSum = 9 * number[0]
                + 7 * number[1]
                + 3 * number[2]
                + 1 * number[3]
                + 9 * number[4]
                + 7 * number[5]
                + 3 * number[6]
                + 1 * number[7]
                + 9 * number[8]
                + 7 * number[9];
        controlSumString = controlSum.toString();


        Integer[] numberTemp = new Integer[controlSumString.length()];
        for (int i = 0; i < numberTemp.length; i++) {
            numberTemp[i] = Integer.parseInt(String.valueOf(controlSumString.charAt(i)));  //Exception in this line
        }

        Integer sumModuloTen = controlSum % 10;
        return sumModuloTen;
    }

}
