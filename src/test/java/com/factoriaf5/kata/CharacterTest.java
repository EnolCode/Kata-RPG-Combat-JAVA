package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void Health_is_1000() {
        Character miCharacter = new Character();
        assertEquals(1000,miCharacter.getHealth());
    }

    @Test
    public void level_is_1() {
        Character miCharacter = new Character();
        assertEquals(1,miCharacter.getLevel());
    }

    @Test
    public void Character_Is_Alive() {
        Character miCharacter = new Character();
        assertEquals(true,miCharacter.getAlive());
    }

    // Nexts Tasks

    @Test
    public void damaged() {
        Character miCharacter = new Character();
        miCharacter.damage(500);
        assertEquals(500,miCharacter.getHealth());
    }
}
