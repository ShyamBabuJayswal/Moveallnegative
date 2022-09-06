package com.company;

public class Main {
    static void moveallnegativeelement(int arr[],int m){
        if(m==0 || m==1 ){
            return;
        }
        int[] a=new int[m];
        int i=0;
        for(int x=0;x<m;x++) {
            if (arr[i] >= 0) {
                a[i] = arr[x];
                i++;
            }}
            for(int x=0;x<m;x++) {
                if (arr[i] < 0) {
                    a[i] = arr[x];
                    i++;
                }
        }
        for(int x=0;x<m;x++){
            arr[x]=a[x];
        }
    }


    public static void main(String[] args) {
	
    }
}
