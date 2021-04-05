package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printPrimers();
    }
    public static boolean isPrimers(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        else {
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printPrimers(){
        int i =2;
        while (i <= 100){
            if(isPrimers(i)){
                System.out.println(i);
            }
            i++;
        }
    }
}
