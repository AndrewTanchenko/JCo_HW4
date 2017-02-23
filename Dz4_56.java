// Javacore / Tanchenko A.
/*
 * 5.  Дано целое число N (> 0). Найти произведение N! = 1·2·…·N (N–факториал). 
 * Чтобы избежать целочисленного переполнения, вычислять это произведение с помощью вещественной переменной и вывести его как вещественное число.
 * 6. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK (целого типа) определяется следующим образом: 
 * F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … . Вывести элементы F1, F2, ..., FN.
 */

//import java.util.Scanner;
//import java.io.*;
import java.util.Arrays;

class Dz4_56 {
  
  static  float getFactorial(int n) {
    float f_n=1;
    if(n!=0){for(int i = 1;i<=Math.abs(n);i++){f_n*=(float)(i);} }
    else {f_n=0;}
    return f_n;}
  
  static  int[] getFibonachi(int n) {
    int[] fi=new int[n];
    if(n==1){fi[0]=1;}
    if(n==2){fi[0]=1;fi[1]=1;}  
    if(n>2){
     fi[0]=1;
     fi[1]=1;
      for(int i = 2;i<=n-1;i++){
        fi[i]=fi[i-2]+fi[i-1];} }
    return fi;}
  
    public static void main(String[] args) {
      
    // Input user data block  
      int n=2;
    ////////////////////////  
      
      System.out.println ("Factorial "+n+" equal "+getFactorial(n));
      System.out.println ("Fibonachi "+n+" equal "+Arrays.toString(getFibonachi(n)));
      
   } 
 }