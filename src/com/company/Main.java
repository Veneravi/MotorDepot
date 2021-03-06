package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON  = BUILDER.setPrettyPrinting().create();
    public static void main(String[] args) {
        Bus bus1 =new Bus("Volvo");
        Bus bus2 =new Bus("DAF");
        Bus bus3 =new Bus("Renault");
        Driver driver1 = new Driver("Petr");
        Driver driver2 = new Driver("Askar");
        Driver driver3 = new Driver("Uson");
        State state1 = new State("base");
        Bus[] buss = {bus1, bus2, bus3};



        Depo[]  depo = {
                new Depo(1, bus1, driver1, state1),
                new Depo(2, bus2, driver2, state1),

                new Depo(3, bus3, driver3, state1),
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите id Водителя: ");
        int ojekt = sc.nextInt();


        for (Depo i: depo) {
            if (i.getId() == ojekt){
                System.out.println(i+"\n");
            }
        }
        for (int i = 0; i < depo.length; i++) {
            System.out.println(depo[i]);
        }
        Depo2[] depos2 = {
                new Depo2(1, bus1, null, new State("On Base")),
                new Depo2(2, bus2, null, new State("On Base")),
                new Depo2(3, bus3, null, new State("On Base"))};
        System.out.println("#  | Bus       |  Driver  |  State");
        for (int i = 0; i < depos2.length; i++) {
            System.out.println(depos2[i]);
        }
        System.out.println("\n");
        Driver[] dr = {
                new Driver(1, "Petr"),
                new Driver(2, "Asan"),
                new Driver(3, "Uson"),
        };
        for (Driver a: dr) {
            System.out.println(" id:  driver-"+ a.getId() + " name: " + a.getName());
        }
        System.out.println("\n# |  Driver       |  Bus\n" +
                "——+———————————————+————————————+");
        for (Driver b: dr) {
            System.out.println(b.getId()+" |"+ b.getName()+"           |");
        }




        String allCars = GSON.toJson(bus1);
        write(allCars);
        System.out.println(allCars);
        System.out.println(readFile());
    }
    private static void write(String obj) {
        Path write = Paths.get(String.valueOf("./gson.gson"));
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.getMessage();
        }

    }

    private static String readFile() {
        String json = "";
        try {
            FileReader fr = new FileReader(String.valueOf("./gson.gson"));
            int a;
            while ((a = fr.read()) != -1) {
                json += (char) a;
            }
            return json;
        } catch (IOException e) {
            e.getMessage();
        }
        return json;
    }

}


