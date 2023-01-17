package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void Health_is_1000() {
        Character miCharacter = new Character();
        assertEquals(1000,miCharacter.getInitHealth());
    }

    @Test
    public void level_is_1() {
        Character miCharacter = new Character();
        assertEquals(1,miCharacter.getInitLevel());
    }

    @Test
    public void Character_Is_Alive() {
        Character miCharacter = new Character();
        assertEquals(true,miCharacter.isAlive());
    }

    // Nexts Tasks

    @Test
    public void checked_damage() {
        Character miCharacter = new Character();
        Character youCharacter = new Character();
        youCharacter.attackCharacter(miCharacter);
        assertEquals(800, miCharacter.getActualHealth());
    }

    @Test
    public void character_is_die() {
        Character miCharacter = new Character();
        Character youCharacter = new Character();
        youCharacter.attackCharacter(miCharacter);
        youCharacter.attackCharacter(miCharacter);
        youCharacter.attackCharacter(miCharacter);
        youCharacter.attackCharacter(miCharacter);
        youCharacter.attackCharacter(miCharacter);
        youCharacter.attackCharacter(miCharacter);
        assertEquals(false, miCharacter.isAlive() );
    }

    @Test
    public void checked_sanation() {
        Character miCharacter = new Character();
        miCharacter.setActualLevel(10);
        Character youCharacter = new Character();
        youCharacter.setActualLevel(1);
        youCharacter.attackCharacter(miCharacter);
        youCharacter.attackCharacter(miCharacter);
        youCharacter.attackCharacter(miCharacter);
        youCharacter.healCharacter(miCharacter);
        assertEquals(450, miCharacter.getActualHealth());
    } 

    @Test
    public void checked_damage_myself() {
        Character miCharacter = new Character();
        miCharacter.attackCharacter(miCharacter);
        assertEquals(1000, miCharacter.getActualHealth());
    }

    // @Test
    // public void checked_damage_level() {
    //     Character miCharacter = new Character();
    //     miCharacter.setActualLevel(10);
    //     Character youCharacter = new Character();
    //     youCharacter.setActualLevel(1);
    //     miCharacter.attackDamageLevel(miCharacter,youCharacter);
    //     assertEquals(100, youCharacter.getActualHealth());
    // }

      @Test
    public void checked_damage_level() {
        Character miCharacter = new Character();
        miCharacter.setActualLevel(10);
        Character youCharacter = new Character();
        miCharacter.attackCharacter(youCharacter);
        assertEquals(700, youCharacter.getActualHealth());
    }

    
    
}
