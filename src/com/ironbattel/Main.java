package com.ironbattel;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Battle between Warrior & Wizard");
        System.out.println("Enter the Names of Warrior & Wizard");
        String warriorName = scanner.nextLine();
        String wizardName = scanner.nextLine();

        Warrior warrior = new Warrior(warriorName, getRandomNumber(100, 200), getRandomNumber(10, 50), getRandomNumber(1, 10));
        Wizard wizard = new Wizard(wizardName, getRandomNumber(100, 200), getRandomNumber(10, 50), getRandomNumber(1, 50));

        while (warrior.isAlive() && wizard.isAlive()) {
            Character firstAttacker = chooseAttacker(warrior, wizard);
            if (firstAttacker == warrior) {
                warrior.attack(wizard);
                System.out.println(warrior.getName() + " Warrior attacks " + wizard.getName() + " Wizard.");
            } else {
                wizard.attack(warrior);
                System.out.println(wizard.getName() + " Wizard attacks " + warrior.getName() + " Warrior.");
            }
            if (!wizard.isAlive()) {
                System.out.println(warrior.getName() + " Warrior is the winner!");
            } else if (!warrior.isAlive()) {
                System.out.println(wizard.getName() + " Wizard is the winner!");
            } else {
                System.out.println("Both are still alive!");
            }
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted.");
            }
        }
        scanner.close();
    }
    public static Character chooseAttacker(Warrior warrior1, Wizard wizard1) {
        Random random = new Random();
        int result = random.nextInt(10) + 1;

        return (result > 5) ? warrior1 : wizard1;
    }
    static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
