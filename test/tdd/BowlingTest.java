package tdd;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class BowlingTest{
	Bowling game;
	
	@BeforeEach
	void init() {
		game= new Bowling();
	
	}
	@Test
	void testt() {
		assertEquals("hello world maria",game.helloworld("maria"));
	}
	
}


