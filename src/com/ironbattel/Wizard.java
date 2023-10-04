package com.ironbattel;
public class Wizard extends Character implements IAttacker {
    private int mana;    private int intelligence;
    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);        this.mana = mana;
        this.intelligence = intelligence;    }
    public int getMana() {
        return mana;    }
    public void setMana(int mana) {
        this.mana = mana;    }
    public int getIntelligence() {
        return intelligence;    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;    }
    @Override
    public void attack(Character target) {        int damage = 0;
        if (mana <= 50 && mana >= 10) {            damage = intelligence;
            System.out.println("Firball " + damage + " damage.");            System.out.println(super.getName() + getHp());
        } else if (mana <= 9 && mana >= 1) {
            damage = intelligence;
            System.out.println("Stafhit " + damage + " damage.");            System.out.println(super.getName() + getHp());
        }        target.setHp(target.getHp() - damage);
        if (target.getHp() <= 0) {            target.setAlive(false);
        }
    }}