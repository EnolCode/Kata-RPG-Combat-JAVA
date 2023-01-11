package com.factoriaf5.kata;

public class Character {
    private  Integer health = 1000;
    private Integer level = 1;
    private Boolean alive = true;
    
    public Character() {
        this.health = getHealth();
        this.level = getLevel();
        this.alive = getAlive();
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public Integer damage (Integer dmg){
        return  dmg - this.health;
    }

}
