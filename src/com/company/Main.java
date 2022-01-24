package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON  = BUILDER.setPrettyPrinting().create();
    public static void main(String[] args) {
        // write your code here
        Bus bus1 =new Bus("Volvo");
        Bus bus2 =new Bus("DAF");
        Bus bus3 =new Bus("Renault");
        Driver driver1 = new Driver("Petr");
        Driver driver2 = new Driver("Askar");
        Driver driver3 = new Driver("Uson");
        State state1 = new State("base");


        Depo[]  depo = {
                new Depo(1, bus1, driver1, state1),
                new Depo(2, bus2, driver2, state1),
                new Depo(3, bus3, driver3, state1),
        };
        for (int i = 0; i < depo.length; i++) {
            System.out.println(depo[i]);
        }
        Depo2[] depos2 = {
                new Depo2(1, bus1, null, new State("On Base")),
                new Depo2(2, bus2, null, new State("On Base")),
                new Depo2(3, bus3, null, new State("On Base"))};
        System.out.println("#  | Bus       |  Driver  |  State");
        for (int i = 0; i < depos2.length; i++) {

       }
        String depos = GSON.toJson(depos2);
        write(depos2);
        System.out.println(depos);
        System.out.println(readFile());

    }


    private static void writeBus(String obj) {
        Path write = Paths.get("./bus.gson");
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.getMessage();


    }
    private static void writeDepo(String obj){
        Path write=Paths.get("./depo.json");
        try {
            Files.writeString(write,obj,StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch (IOException e) {
            e.getMessage();

    }


    private static String readFile() {
        String json = "";
        try {
            FileReader fr = new FileReader("./bus.gson");
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
