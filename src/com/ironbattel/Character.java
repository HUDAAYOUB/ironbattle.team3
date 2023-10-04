package com.ironbattel;
import java.util.Random;
public abstract class Character implements IAttacker {
    private String id;    private String name;
    private int hp;    private static boolean isAlive = true;
    public Character(String name, int hp) {
        this.name = name;        this.hp = hp;
    }
    public Character(String id, boolean isAlive) {        this.id = id;
        this.isAlive = isAlive;    }
    public String getId() {
        return id;    }
    public void setId(String id) {
        this.id = id;    }
    public String getName() {
        return name;    }
    public void setName(String name) {
        this.name = name;    }
    public int getHp() {
        return hp;    }
    public void setHp(int hp) {
        this.hp = hp;    }
    public boolean isAlive() {        return isAlive;
    }
    public void setAlive(boolean alive) {        isAlive = alive;
    }
    @Override    public void attack() {
    }
    public abstract void attack(Character target);
}