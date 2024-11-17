package com.ebac.caue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Parte1 {
    public static void main(String[] args) {
        // Parte 1 do exercício:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por virgulas");
        String input = scanner.next();
        String[] names = input.split(",");

        Arrays.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}