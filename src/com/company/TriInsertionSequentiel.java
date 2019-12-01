package com.company;

public final class TriInsertionSequentiel {

    /** Méthode qui fait le tri à insertion séquentiel.
     *
     * @param tab - Tableau d'entier non trié.
     * @return Tableau d'entier trié.
     */

    public Integer[] trier(Integer[] tab){
        int s_tab = tab.length;

        for (int i = 1; i < s_tab-1; i++){
            int temp = tab[i];
            int j = i;
            for ( ; j > 0 && tab[j-1] > temp; j--) {
                tab[j] = tab[j-1];
            }

            tab[j] = temp;
        }

        return tab;
    }
}
