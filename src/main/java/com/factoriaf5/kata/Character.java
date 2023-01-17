package com.factoriaf5.kata;

public class Character {

    private int initHealth = 1000;
    private int actualHealth = initHealth;
    private int initDamage = 200;
    private int actualDamage = initDamage;
    private int initSanation = 50;
    private int actualSanation = initSanation;
    private int initLevel = 1;
    private int actualLevel = initLevel;
    private boolean alive = true;

    public Character() {
        this.initHealth = getInitHealth();
        this.actualHealth = getActualHealth();
        this.initDamage = getInitDamage();
        this.actualDamage = getActualDamage();
        this.initSanation = getInitSanation();
        this.actualSanation = getActualSanation();
        this.initLevel = getInitLevel();
        this.actualLevel = getActualLevel();
        this.alive = isAlive();
    }
    public int getInitHealth() {
        return initHealth;
    }
    public void setInitHealth(int initHealth) {
        this.initHealth = initHealth;
    }
    public int getActualHealth() {
        return actualHealth;
    }
    public void setActualHealth(int actualHealth) {
        this.actualHealth = actualHealth;
    }
    public int getInitDamage() {
        return initDamage;
    }
    public void setInitDamage(int initDamage) {
        this.initDamage = initDamage;
    }
    public int getActualDamage() {
        return actualDamage;
    }
    public void setActualDamage(int actualDamage) {
        this.actualDamage = actualDamage;
    }
    public int getInitSanation() {
        return initSanation;
    }
    public void setInitSanation(int initSanation) {
        this.initSanation = initSanation;
    }
    public int getActualSanation() {
        return actualSanation;
    }
    public void setActualSanation(int actualSanation) {
        this.actualSanation = actualSanation;
    }
    public int getInitLevel() {
        return initLevel;
    }
    public void setInitLevel(int initLevel) {
        this.initLevel = initLevel;
    }
    public int getActualLevel() {
        return actualLevel;
    }
    public void setActualLevel(int actualLevel) {
        this.actualLevel = actualLevel;
    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive; 
    }

    public void attackCharacter(Character character) {
        if(this.equals(character)) return;
        if(character.getActualLevel() > 5){
            character.setActualDamage(300);
        }
        character.actualHealth -= this.initDamage;
        setActualHealth(character.actualHealth);
        if(character.actualHealth <= 0){
            this.actualHealth = 0;
            setActualHealth(character.actualHealth);
            character.setAlive(false);
        }
    }

    public void healCharacter(Character character) {
        if(this.actualHealth > 0 && this.actualHealth < 1000){
        character.actualHealth += this.initSanation; 
        }
        setActualHealth(character.actualHealth);
    }

    public void attackDamageLevel(Character character1, Character character2) {
        int level1 = character1.actualLevel;
        int level2 = character2.actualLevel;
        int result = 0;
        for(int i = level1; i <= level2; i++ ){
            result++;
        }
        if(result > 5){
            character1.setActualHealth(100);
        }
    }
}
