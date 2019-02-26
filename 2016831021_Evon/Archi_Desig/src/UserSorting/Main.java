/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSorting;

import java.util.ArrayList;
import java.util.Collections;
import javafx.print.Collation;

/**
 *
 * @author user
 */
public class Main {

    public Main() {
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        
        arrayList.add(12) ;
        arrayList.add(20) ;
        arrayList.add(32) ;
        arrayList.add(2) ;
        arrayList.add(5) ;
        arrayList.add(21) ;
        arrayList.add(1) ;
        arrayList.add(10) ;
        arrayList.add(3) ;
       
        ImSort bImSort = new ImSort(new Bubble());
        bImSort.sort(arrayList);
        
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        
    }
    
}
