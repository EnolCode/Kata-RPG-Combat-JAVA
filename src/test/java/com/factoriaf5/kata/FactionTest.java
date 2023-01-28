package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactionTest {

    @Test
    void add_character_faction() {
        RangeCharacter legolas = new RangeCharacter(10);
        Faction archer = new Faction("archer");
        archer.addCharacter(legolas);

        assertEquals("archer", legolas.getFaction().getName());
    }

    @Test
    void character_dont_attack_allies() {
        RangeCharacter legolas = new RangeCharacter(10);
        RangeCharacter mcGregor = new RangeCharacter(10);
        Faction archers = new Faction("archer");
        archers.addCharacter(legolas);
        archers.addCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        assertEquals(1000, mcGregor.getActualHealth());
    }

    @Test
    void character_attack_() {
        RangeCharacter legolas = new RangeCharacter(10);
        RangeCharacter mcGregor = new RangeCharacter(10);
        Faction archers = new Faction("archer");
        Faction strikers = new Faction("archer2");
        archers.addCharacter(legolas);
        strikers.addCharacter(mcGregor);
        legolas.attackCharacter(mcGregor);
        assertEquals(800, mcGregor.getActualHealth());
    }

}
