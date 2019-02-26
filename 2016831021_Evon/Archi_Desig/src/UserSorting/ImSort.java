/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSorting;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ImSort {
    private sortInterface s ;
    
    public ImSort(sortInterface s){
        this.s = s ;
    }
    
    public void sort(ArrayList<Integer>arrayList){
        s.sort(arrayList);
    }
    
}
