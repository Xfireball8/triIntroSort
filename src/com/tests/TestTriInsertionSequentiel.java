package com.tests;

import com.company.TriInsertionSequentiel;

import java.util.Arrays;

public class TestTriInsertionSequentiel {

    public TestTriInsertionSequentiel(){
        System.out.println("= == =  TEST TRI INSERTION SEQUENTIEL = == =");
        Integer[] tab = {5,10,78,3,2,888,25,78,4,50,0,12,32,33,654,209};
        System.out.println("Tableau Non Trié : " + Arrays.toString(tab));
        new TriInsertionSequentiel().trier(tab, tab.length-1);
        System.out.println("Tableau trié : " + Arrays.toString(tab));
    }
}
