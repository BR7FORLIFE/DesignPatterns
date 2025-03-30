package com.desingpattern.DesignPatternCreations.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton si = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        si.getMessage();
        s2.getMessage();

        System.out.println(si == s2);
    }
}
