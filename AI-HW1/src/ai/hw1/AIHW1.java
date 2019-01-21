/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.hw1;

 import java.util.Scanner;

 public class AIHW1 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int Number = input.nextInt();
        System.out.println("List Of All Numbers Which Devisor Of " + Number);
        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.print(i + " | ");
            }

         }
     }}
