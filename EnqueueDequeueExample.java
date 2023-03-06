/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema8;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class EnqueueDequeueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteros para encolar (introduce un número negativo para terminar):");
        int number = scanner.nextInt();

        while (number >= 0) {
            queue.offer(number); // Encolar número
            number = scanner.nextInt(); // Pedir otro número
        }

        System.out.println("Números desencolados:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Desencolar número y mostrarlo
        }
    }
}

    

