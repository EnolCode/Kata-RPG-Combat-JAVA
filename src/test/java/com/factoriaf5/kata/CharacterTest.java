package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    private RangeCharacter legolas = new RangeCharacter(12);
    private MeleeCharacter mcGregor = new MeleeCharacter(2);
    private MeleeCharacter topuria = new MeleeCharacter(2);

    Faction archers = new Faction("archers");
    public CharacterTest() {
        archers.addCharacter(legolas);
        strikers.addCharacter(mcGregor);
        strikers.addCharacter(topuria);
    }

    Faction strikers = new Faction("strikers");
    // strikers.addCharacter(mcGregor);

    @Test
    public void Health_is_1000() {
        assertEquals(1000,legolas.getInitHealth());
    }

    @Test
    public void level_is_1() {
        assertEquals(1,mcGregor.getInitLevel());
    }

    @Test
    public void Character_Is_Alive() {
        assertEquals(true,mcGregor.isAlive());
    }

    // Nexts Tasks

    @Test
    public void checked_damage() {
        mcGregor.attackCharacter(legolas);
        assertEquals(800, legolas.getActualHealth());
    }

    @Test
    public void character_is_die() {
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        assertEquals(false, mcGregor.isAlive() );
    }

    @Test
    public void checked_sanation() {
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        mcGregor.healCharacter(mcGregor);
        assertEquals(450, mcGregor.getActualHealth());
    } 

    @Test
    public void checked_damage_myself() {
        mcGregor.attackCharacter(mcGregor);
        assertEquals(1000, mcGregor.getActualHealth());
    }

      @Test
    public void checked_damage_level() {
        legolas.setActualLevel(100);
        topuria.setActualLevel(12);
        topuria.attackCharacter(legolas);
        assertEquals(900, legolas.getActualHealth());
    }

    @Test
    public void meleeCharacter_can_attack() {
        topuria.attackCharacter(legolas);
        
        assertEquals(800, legolas.getActualHealth());
    }

    @Test
    public void meleeCharacter_cant_attack() {
        MeleeCharacter miCharacter = new MeleeCharacter(3);
        Character youCharacter = new Character();  

        miCharacter.attackCharacter(youCharacter);
        
        assertEquals(1000, youCharacter.getActualHealth());
    }

    @Test
    public void RangeCharacter_can_attack() { 

        legolas.attackCharacter(mcGregor);
        
        assertEquals(800, mcGregor.getActualHealth());
    }

    @Test
    public void RangeCharacter_cant_attack() {
        RangeCharacter miCharacter = new RangeCharacter(21);
        Character youCharacter = new Character();  

        miCharacter.attackCharacter(youCharacter);
        
        assertEquals(1000, youCharacter.getActualHealth());
    }
}
