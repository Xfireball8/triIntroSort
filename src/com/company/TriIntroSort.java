package com.company;

public class TriIntroSort {
    private Integer K;
    private Integer S;

    public TriIntroSort(Integer k, Integer s) {
        K = k;
        S = s;
    }

    public void trier(Integer[] tab){
        triRapide(tab, 0, tab.length-1,0);
    }

    private void triRapide(Integer[] tab, Integer start, Integer end, Integer profondeur){
        if ((end-start) + 1 < S) {
            // On termine en tri seq.
            Integer tailleInterval = (end-start)+1;
            Integer[] temp = new Integer[tailleInterval];
            recopie(tab,temp,start,end,0,tailleInterval-1);
            new TriInsertionSequentiel().trier(temp, tailleInterval-1);
            recopie(temp,tab,0,tailleInterval-1,start,end);
        } else if (profondeur > K*(Math.log(profondeur)/Math.log(2))) {
            Integer tailleInterval = (end-start)+1;
            Integer[] temp = new Integer[tailleInterval];
            recopie(tab,temp,start,end,0,tailleInterval-1);
            new TriTas().tri(temp);
            recopie(temp,tab,0,tailleInterval-1,start,end);
        } else{
            Integer i_pivot = null;

            if (start < end) {
                i_pivot = partition(tab, start, end);
                triRapide(tab, i_pivot+1, end,profondeur+1);
                triRapide(tab, start, i_pivot-1,profondeur+1);
            }
        }
    }

    private Integer partition(Integer[] tab, Integer start, Integer end) {
        Integer pivot = null;
        Integer i_courant_bas = null;
        Integer i_courant_haut = null;

        permuter(tab, start, median(tab,start, end, (start+end)/2));

        i_courant_bas = start+1;
        i_courant_haut = end;

        while (i_courant_bas <= i_courant_haut) {
            while (tab[i_courant_haut] >= tab[start] && i_courant_bas <= i_courant_haut){
                i_courant_haut--;
            }

            while (tab[i_courant_bas] < tab[start] && i_courant_bas <= i_courant_haut){
                i_courant_bas++;
            }

            if (i_courant_bas < i_courant_haut) {
                permuter(tab, i_courant_bas, i_courant_haut);
                i_courant_haut--;
                i_courant_bas++;
            }
        }
        permuter(tab, i_courant_haut, start);
        return i_courant_haut;
    }

    private Integer median(Integer[] tab, Integer i_start, Integer i_end, Integer i_middle){
        if ((tab[i_start] >= tab[i_middle] && tab[i_middle] >= tab[i_end]) ||
                (tab[i_end] >= tab[i_middle] && tab[i_middle] >= tab[i_start]))
        {
            return i_middle;
        } else if ((tab[i_middle] >= tab[i_start] && tab[i_start] >= tab[i_end]) ||
                (tab[i_end] >= tab[i_start] && tab[i_start] >= tab[i_middle]))
        {
            return i_start;
        } else {
            return i_end;
        }
    }

    private void permuter(Integer[] tab, Integer i1, Integer i2){
        Integer temp = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = temp;
    }

    private void recopie(Integer[] tab1, Integer[] tab2,
                         Integer s1,Integer e1,
                         Integer s2,Integer e2){
        Integer i = s1;
        Integer j = s2;

        while (i <= e1 && j <= e2){
            tab2[j] = tab1[i];

            i++;
            j++;
        }
    }
}
