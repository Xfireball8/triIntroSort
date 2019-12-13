package com.company;

public class TriInsertionSequentiel {

    public void trier(Integer[] tab, Integer indice){
        if (indice >= 0) {
            Integer k = null;
            Integer retenue = null;
            trier(tab, indice-1);

            k = indice-1;
            retenue = tab[indice];

            while (k>= 0 && tab[k] >retenue) {
                tab[k+1] = tab[k];
                k = k-1;
            }

            tab[k+1] = retenue;
        }
    }
}
