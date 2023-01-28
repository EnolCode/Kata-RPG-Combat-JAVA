package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactionTest {

    private RangeCharacter legolas = new RangeCharacter(12);
    private MeleeCharacter mcGregor = new MeleeCharacter(2);
    private MeleeCharacter topuria = new MeleeCharacter(2);
    Faction archers = new Faction("archers");
    Faction strikers = new Faction("strikers");
    

    public FactionTest() {
        strikers.addCharacter(mcGregor);
        strikers.addCharacter(topuria);
        // archers.addCharacter(legolas);
    }

    @Test
    void add_character_faction() {
        archers.addCharacter(legolas);
        assertEquals("archers", legolas.getFaction().getName());
    }

    @Test
    void character_dont_attack_allies() {
        mcGregor.attackCharacter(topuria);
        assertEquals(1000, topuria.getActualHealth());
    }

    @Test
    void character_attack() {
        legolas.attackCharacter(mcGregor);
        assertEquals(800, mcGregor.getActualHealth());
    }

    @Test
    void enemys_cant_heal(){
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        legolas.healCharacter(mcGregor);
        assertEquals(600, mcGregor.getActualHealth());
    }

    @Test
    void allies_can_heal(){
        legolas.attackCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        topuria.healCharacter(mcGregor);
        assertEquals(650, mcGregor.getActualHealth());
    }

}
