package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    @Test
    public void getYearOfBirth() {
        Actor actor = new Actor("Kerep perek", 1974);
        assertEquals("Kerep perek", actor.getName());
    }
}