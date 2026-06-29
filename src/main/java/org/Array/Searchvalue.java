package org.Array;

public class Searchvalue {

    public boolean search(String[][] arr, String value){
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j].equals(value))
                  return true;


                }
            }
        return false;
        }
    }

