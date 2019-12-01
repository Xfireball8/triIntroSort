package com.company;

public class Tas {
   private Integer[] elems;
   private Integer initialBufferSize;
   private Integer numberOfrealloc;
   private static Integer vide = Integer.MIN_VALUE;

   public Tas() {
       this.initialBufferSize = 1000;
       this.numberOfrealloc = 1;
       this.elems = new Integer[numberOfrealloc*initialBufferSize];
       initTas(this.elems);
   }

    /** Fonction d'initialisation du tas.
     *
     * @param elems - Le tas dans un tableau.
     */
   private void initTas(Integer[] elems){
       for (int i = 0; i < initialBufferSize*numberOfrealloc; i++){
           elems[i] = vide;
       }
   }

    /** Fonction de récupération de l'indice du sous arbre gauche.
     *
     * @param indice - indice du noeud
     * @return Indice Sous Arbre Gauche
     */
   private Integer indiceSousArbreGauche(Integer indice){
       return indice*2;
   }

    /** Fonction de récupération de l'indice du sous arbre droit.
     *
     * @param indice - indice du noeud.
     * @return Indice Sous Arbre Droit
     */
   private Integer indiceSousArbreDroit(Integer indice){
       return (indice*2)+1;
   }

    /** Fonction de récupération de l'indice du père d'un noeud.
     *
     * @param indice - indice du noeud
     * @return
     */
   private Integer indiceDuPere(Integer indice){
       return (indice%2 == 1) ? (indice-1)/2 : indice/2;
   }


}
