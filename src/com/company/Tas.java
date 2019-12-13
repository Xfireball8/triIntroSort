package com.company;

public class Tas {
   private Integer []tas;
   private static final Integer racine = 1;
   public Tas(){
        tas = new Integer[1000];
        initialiser();
   }

   private int len(){
       int len = 0;
       int i = racine;

       while(this.tas[i] != null) {
           len++;
           i++;
       }

       return len;
   }

   private void initialiser() {
       for (int i = 0; i < 1000; i++){
           tas[i] = null;
       }
   }

   private void permuter(Integer i1, Integer i2){
       Integer temp = tas[i1];
       tas[i1] = tas[i2];
       tas[i2] = temp;
   }

   public void ajouter(Integer elem){
        Integer p = len() + 1;
        tas[p] = elem;
        Integer i = p;

        while (i > 1 && tas[(i%2 == 1 ? i-1 : i)/2] > tas[i]) {
            permuter(i, (i%2 == 1 ? i-1 : i)/2);
            i = (i%2 == 1 ? i-1 : i)/2;
        }
   }

   public Integer supprimer(){
        Integer min = tas[racine];
        Integer p = len();
        Integer i = racine;
        Boolean fini = false;

        tas[racine] = tas[p];
        tas[p] = null;
        p = len();

        while (i <= (p%2==1 ? (p-1)/2 : p/2) && !fini) {
            Integer j = 0;
            if (p == i*2 || tas[i*2] < tas[(i*2)+1]) {
                j = 2*i;
            } else {
                j = (2*i) + 1;
            }

            if (tas[i] > tas[j]) {
                permuter(i,j);
                i = j;
            } else {
                fini = true;
            }
        }

        return min;
   }

   public void print() {
       System.out.println(toString(racine, ""));
   }

   private String toString(Integer i_node, String chaine){
       if (tas[i_node*2] == null && tas[(i_node*2)+1] == null) {
           return chaine + tas[i_node] + "\n";
       } else {
           return toString((i_node*2)+1, chaine+"    ") +
                   chaine + tas[i_node] + "\n" +
                   toString((i_node*2), chaine+"    ");
       }
   }
}
