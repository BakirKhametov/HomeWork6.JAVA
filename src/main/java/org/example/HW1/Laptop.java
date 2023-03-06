package org.example.HW1;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

@Data
//@AllArgsConstructor

public class Laptop {
    List<Laptop> laptops;
    String name;
    Integer RAM;
    Integer hardDisk;
    Integer screenDiagonal;
    String OS;

    public Laptop(String name, Integer RAM, Integer hardDisk, Integer screenDiagonal, String OS) {
        this.laptops = new ArrayList<>();
        this.name = name;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
        this.screenDiagonal = screenDiagonal;
        this.OS = OS;
    }

    public String getName() {return name;}
    public Integer getRAM() {return RAM;}
    public Integer getDisk() {return hardDisk;}
    public Integer getDiagonal() {return screenDiagonal;}
    public String getOS() {return OS;}

    @Override
    public String toString() {
        return "Laptop [Название= " + name + ", ОЗУ= " + RAM + ", Жесткий диск= " + hardDisk + ", Диагональ экрана= " + screenDiagonal + ", Операционка= " + OS + "]";
    }

    public List<Laptop> search(Set<Laptop> newLaptop) {
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
                    if (diskValue.equals(tempLaptop.hardDisk) || diagonalScreen == 0) {
                        if (diagonalScreen.equals(tempLaptop.screenDiagonal) || diagonalScreen == 0) {
                            if (enterOS.equals(tempLaptop.OS) || enterOS.equals("none")) {
                                listLaptop.add(tempLaptop);
                            }
                        }
                    }
                }
            }

        }
        return listLaptop;
    }
}

