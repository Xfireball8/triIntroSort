package com.company;

public class TriIntroSort {
    Integer initialBufferSize = 1000;
    Integer[] elems = new Integer[initialBufferSize];

    public TriIntroSort(){

    }



    /** Tri par insertion d'un tableau en entrée.
     * @param elems - Tableau d'entier à trier.
     */
    private void triInsertion(Integer[] elems){
        for (int i = 0; i < elems.length; i++) {
            Integer temp = elems[i];

            Integer j;
            for (j = i; j > 0 && elems[j-1] > temp; j--){
                elems[j] = elems[j-1];
            }
        }
    }


    /** Tri par tas d'un tableau en entrée.
     * @param elems - Tableau d'entier à trier.
     */
    private void triTas(Integer[] elems){

    }
}
