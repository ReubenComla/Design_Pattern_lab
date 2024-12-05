package singletonExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoonRoverTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

import org.junit.jupiter.api.Test;

public class MoonRoverTest {
    @Test
    public void testStateCycle() {
        MoonRover rover = new MoonRover();
        rover.performAction(); // Idle -> Move
        rover.performAction(); // Move -> CollectSamples
        rover.performAction(); // CollectSamples -> Idle
    }
}
