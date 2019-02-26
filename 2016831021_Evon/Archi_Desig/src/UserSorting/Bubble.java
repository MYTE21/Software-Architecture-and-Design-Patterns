/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Bubble implements sortInterface{

    @Override
    public void sort(ArrayList<Integer> arrayList) {
        int arrayLength = arrayList.size();
        
        for(int j=0;j<arrayList.size();j++){		
            for(int i=j+1;i<arrayList.size();i++){
				if((arrayList.get(i)).compareTo(arrayList.get(j))<0){
					
					Integer t = arrayList.get(j);
					arrayList.set( j, arrayList.get(i));
                                        arrayList.set(i, t);
				}
			}
        }
    }
    
}
