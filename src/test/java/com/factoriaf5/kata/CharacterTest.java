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
        youCharacter.setDamage(miCharacter);
        assertEquals(800, miCharacter.getActualHealth());
    }

    @Test
    public void character_is_die() {
        Character miCharacter = new Character();
        Character youCharacter = new Character();
        youCharacter.setDamage(miCharacter);
        youCharacter.setDamage(miCharacter);
        youCharacter.setDamage(miCharacter);
        youCharacter.setDamage(miCharacter);
        youCharacter.setDamage(miCharacter);
        youCharacter.setDamage(miCharacter);
        assertEquals(false, miCharacter.isAlive() );
    }

    @Test
    public void checked_sanation() {
        Character miCharacter = new Character();
        Character youCharacter = new Character();
        youCharacter.setDamage(miCharacter);
        youCharacter.setDamage(miCharacter);
        youCharacter.setDamage(miCharacter);
        youCharacter.setSanation(miCharacter);
        assertEquals(450, miCharacter.getActualHealth());
    }

    @Test
    public void 5_levels_more() {
        Character miCharacter = new Character();
        Character youCharacter = new Character();
        miCharacter.setInitLevel(10);
        youCharacter.setInitLevel(1);
        assertEquals(450, miCharacter.getActualHealth());
    }




}
