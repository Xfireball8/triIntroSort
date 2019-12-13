package com.tests;

import com.company.Tas;

import java.util.ArrayList;

public class TestTas {
    Tas tas = new Tas();

    public TestTas(){
        testAjouter();
        testSupprimer();
    }

    private void testAjouter(){
        Integer[] tab = {5,10,78,3,2,888,25,78,4,50,0,12,32,33,654,209};

        for (int i = 0; i < tab.length; i++) {
            tas.ajouter(tab[i]);
        }

        tas.print();
    }

    private void testSupprimer() {
        Integer[] tabTrié = {0,2,3,4,5,10,12,25,32,33,50,78,78,209,654};
        ArrayList<Integer> tab = new ArrayList<Integer>();
        Integer temp = null;

        do {
            temp = tas.supprimer();

            if (temp != null) {
                tab.add(temp);
            }
        } while (temp != null);

        // Tester l'égalité entre les deux tableau
        Boolean test_ok = true;

        for (int i = 0; i < tabTrié.length; i++) {
            if (!tab.get(i).equals(tabTrié[i])){
                test_ok = false;
            }
        }

        if (test_ok) {
            System.out.println("Test Suppression Ok !");
        } else {
            System.out.println("Test Supression Echoué");
        }
    }
}
