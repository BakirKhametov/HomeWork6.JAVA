package org.example.HW1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS", 32, 2000, 17, "Linux");
        Laptop laptop2 = new Laptop("HP", 8, 512, 15, "Windows");
        Laptop laptop3 = new Laptop("Lenovo", 16, 1000, 16, "Windows");
        Laptop laptop4 = new Laptop("Apple", 16, 1000, 16, "MacOS");
        Laptop laptop5 = new Laptop("Acer", 8, 512, 13, "Windows");
        Laptop laptop6 = new Laptop("Samsung", 16, 1000, 17, "Linux");

        Set<Laptop> allLaptop = new HashSet<>();
        allLaptop.add(laptop1);
        allLaptop.add(laptop2);
        allLaptop.add(laptop3);
        allLaptop.add(laptop4);
        allLaptop.add(laptop5);
        allLaptop.add(laptop6);

        System.out.println(search(allLaptop));
    }

    public static List<Laptop> search(Set<Laptop> newLaptop) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите название фирмы: ASUS, HP, Lenovo, Apple, Acer, Samsung \n либо введите: none, если эта строка поиска Вас не интересует");
        String nameLaptop = scan.nextLine();
        System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 8, 16, 32 \n либо введите 0, если эта строка поиска Вас не интересует");
        Integer RAM = Integer.valueOf(scan.nextLine());
        System.out.println("Укажите объем постоянной памяти в Гб\nВналичии : 512, 1000, 2000 \n либо введите 0, если эта строка поиска Вас не интересует");
        Integer diskValue = Integer.valueOf(scan.nextLine());
        System.out.println("Укажите диагональ экрана в дюймах\nВналичии:14.2, 15.6, 16.2, 17.1, 17.3 \n либо введите 0, если эта строка поиска Вас не интересует");
        Integer diagonalScreen = Integer.parseInt(scan.nextLine());
        System.out.println("Укажите операционную систему ноутбука\nВналичии : Linux, Windows, MacOS \n либо введите: none, если эта строка поиска Вас не интересует");
        String enterOS = scan.nextLine();

        List<Laptop> listLaptop = new ArrayList<>();
        for (Laptop tempLaptop : newLaptop) {
            if (nameLaptop.equals(tempLaptop.name) || nameLaptop.equals("none")) {
                if (RAM.equals(tempLaptop.RAM) || RAM == 0) {
                    if (diskValue.equals(tempLaptop.hardDisk) || diskValue == 0) {
                        if (diagonalScreen.equals(tempLaptop.screenDiagonal) || diagonalScreen == 0) {
                            if (enterOS.equals(tempLaptop.OS) || enterOS.equals("none")) {
                                listLaptop.add(tempLaptop);
                            }
                        }
                    }
                }
            }
            else {
                System.out.println("Ошибка! Некорректное значение");
            }

        }
        return listLaptop;
    }
}

