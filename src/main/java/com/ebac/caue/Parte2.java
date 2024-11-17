package com.ebac.caue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        // Parte 2 do exercício:
        List<String> male = new ArrayList<String>();
        List<String> female = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nome e seu sexo separado por '-' e com M (para masculino) ou F (para feminino)");
        System.out.println("Para digitar outros nomes e sexos, separe usando virgula");

        String input = scanner.next();
        String[] peoples = input.split(",");
        for (String people : peoples) {
            String[] peopleInfo = people.split("-");
            if (peopleInfo[1].equalsIgnoreCase("M")) {
                male.add(peopleInfo[0]);
                continue;
            }
            female.add(peopleInfo[0]);
        }

        System.out.println("Grupo feminino:");
        for (String people : female) {
            System.out.println(people);
        }

        System.out.println("Grupo masculino:");
        for (String people : male) {
            System.out.println(people);
        }

        scanner.close();
    }
}
