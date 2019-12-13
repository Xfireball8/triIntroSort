package com.tests;

import com.company.TriIntroSort;

import java.util.Arrays;

public class TestTriIntroSort {
    public TestTriIntroSort(){
        Integer[] test1 = {5,10,78,3,2,888,25,78,4,50,0,12,32,33,654,209};
        Integer[] test2 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        Integer[] test3 = {12,5,4,32,5};

        TriIntroSort triIntroSort = new TriIntroSort(2,16);

        triIntroSort.trier(test1);
        triIntroSort.trier(test2);
        triIntroSort.trier(test3);

        System.out.println("== = ==  TEST TRI INTRO SORT == = ==");
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test3));
    }
}
