package com.ironbattel;

public class Warrior extends Character implements IAttacker {
    private int stamina;    private int strength;
    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);        this.stamina = stamina;
        this.strength = strength;    }
    public Warrior(String id, boolean isAlive, int stamina, int strength) {
        super(id, isAlive);        this.stamina = stamina;
        this.strength = strength;    }
    public int getStamina() {
        return stamina;    }
    public int getStrength() {
        return strength;    }
    public void setStamina(int stamina) {
        this.stamina = stamina;    }
    public void setStrength(int strength) {
        this.strength = strength;    }
    @Override
    public void attack(Character target) {        int damage = 0;
        if (stamina <= 50 && stamina >= 11) {            damage = strength;
            System.out.println("Heavy Attack with " + damage + " damage.");            System.out.println(super.getName() + getHp());
        } else if (stamina <= 10 && stamina >= 1) {
            damage = strength;            System.out.println("Weak Attack with " + damage + " damage.");
            System.out.println(super.getName() + getHp());
        }        target.setHp(target.getHp() - damage);
        if (target.getHp() <= 0) {            target.setAlive(false);
        }    }
}