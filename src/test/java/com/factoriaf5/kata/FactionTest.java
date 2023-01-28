package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactionTest {

    private RangeCharacter legolas = new RangeCharacter(12);
    private MeleeCharacter mcGregor = new MeleeCharacter(2);
    private MeleeCharacter topuria = new MeleeCharacter(2);
    Faction archers = new Faction("archers");
    Faction strikers = new Faction("strikers");
    

    @Test
    void add_character_faction() {
        archers.addCharacter(legolas);

        assertEquals("archer", legolas.getFaction().getName());
    }

    @Test
    void character_dont_attack_allies() {
        archers.addCharacter(legolas);
        archers.addCharacter(mcGregor);
        mcGregor.attackCharacter(legolas);
        assertEquals(1000, mcGregor.getActualHealth());
    }

    @Test
    void character_attack() {
        archers.addCharacter(legolas);
        strikers.addCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        assertEquals(800, mcGregor.getActualHealth());
    }

    @Test
    void enemys_cant_heal(){
        archers.addCharacter(legolas);
        strikers.addCharacter(mcGregor);
        strikers.addCharacter(topuria);
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        topuria.healCharacter(mcGregor);
        assertEquals(600, mcGregor.getActualHealth());

        
    }

}
