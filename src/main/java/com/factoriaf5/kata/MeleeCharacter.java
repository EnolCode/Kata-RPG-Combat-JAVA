package com.factoriaf5.kata;

public class MeleeCharacter extends Character{

    
    public MeleeCharacter(int distanceEnemy) {
        setRange(2); 
        setDistanceEnemy(distanceEnemy);
    }

    public boolean canAttackRange(){
        if(getDistanceEnemy() <= getRange()){
            return true;
        }
        return false ;
    }

    @Override
    public void attackCharacter(Character character) {
        if(canAttackRange()){
            super.attackCharacter(character);
        }
    }
}
