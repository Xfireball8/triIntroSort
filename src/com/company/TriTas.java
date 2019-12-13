package com.company;

public class TriTas {

    public Integer[] tri(Integer[] tabEntiers){
        Tas tas = new Tas();
        Integer[] res = new Integer[tabEntiers.length];

        for (int i = 0; i < tabEntiers.length; i++){
            tas.ajouter(tabEntiers[i]);
        }

        for (int i = 0; i < tabEntiers.length; i++){
            res[i] = tas.supprimer();
        }

        return res;
    }

    private void initialiserTab(Integer[] tab, int size){
        for (int i =0; i < size; i++) {
            tab[i] = null;
        }
    }
}
