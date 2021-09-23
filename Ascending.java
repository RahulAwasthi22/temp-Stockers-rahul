package com.rahulawasthi.module1;

public class Ascending {

	public Ascending() {        
        
        //Initialize array     
        double [] arr = new double [] {45.2,62.6,53.5,95.3,105.2};     
        double temp = 0;    
            
        //Displaying elements of original array        
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        for (int i = 0; i < arr.length; i++) { 
        	System.out.print(arr[i] + " "); 
        }
        }    
    
}