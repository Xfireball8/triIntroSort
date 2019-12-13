package com.tests;

import com.company.TriTas;

import java.util.Arrays;

public class TestTriTas {

    public TestTriTas(){
        System.out.println("= == =  TEST TRI TAS = == =");
        Integer[] tab = {5,10,78,3,2,888,25,78,4,50,0,12,32,33,654,209};
        System.out.println("Tableau Non Trié : " + Arrays.toString(tab));
        System.out.println("Tableau trié : " + Arrays.toString(new TriTas().tri(tab)));
    }
}
