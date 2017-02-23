// Javacore / Tanchenko A.
/*
 * 1. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A до B включительно.
 * 2. Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно.
 * 3. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно.
 */

//import java.util.Scanner;
//import java.io.*;
import java.util.Arrays;

class Dz4_123 {
  
  static  int getSummFromAtoB(int a, int b) {
    int sum=0;
    for(int i = a;i<=b;i++){sum+=i;}  
    return sum;}
  
  static  int getMultFromAtoB(int a, int b) {
    int mult=1;
    for(int i = a;i<=b;i++){mult*=i;}  
    return mult;}
  
  static  int getSummSQRT_FromAtoB(int a, int b) {
    int sum=0;
    for(int i = a;i<=b;i++){sum+=i*i;}  
    return sum;}
  
  
    public static void main(String[] args) {
      
    // Input user data block  
      int a=1;
      int b=3;
    ////////////////////////  
      
      System.out.println ("Summ from "+a+" to "+b+" is "+getSummFromAtoB(a,b));
      System.out.println ("Multiplication from "+a+" to "+b+" is "+getMultFromAtoB(a,b));
      System.out.println ("Summ of x^2 from "+a+" to "+b+" is "+getSummSQRT_FromAtoB(a,b));
      
   } 
 }
