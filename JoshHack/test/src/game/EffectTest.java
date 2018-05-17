package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EffectTest</code> contains tests for the class <code>{@link Effect}</code>.
 *
 * @generatedBy CodePro at 5/17/18 2:55 PM
 * @author asims
 * @version $Revision: 1.0 $
 */
public class EffectTest {
	/**
	 * Run the Effect(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:55 PM
	 */
	@Test
	public void testEffect_1()
		throws Exception {
		int duration = 1;

		Effect result = new Effect(duration);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDone());
	}

	/**
	 * Run the Effect(Effect) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:55 PM
	 */
	@Test
	public void testEffect_2()
		throws Exception {
		Effect other = new Effect(1);

		Effect result = new Effect(other);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDone());
	}

	/**
	 * Run the boolean isDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:55 PM
	 */
	@Test
	public void testIsDone_1()
		throws Exception {
		Effect fixture = new Effect(0);

		boolean result = fixture.isDone();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:55 PM
	 */
	@Test
	public void testIsDone_2()
		throws Exception {
		Effect fixture = new Effect(1);

		boolean result = fixture.isDone();

		// add additional test code here
		assertEquals(false, result);
	}

	

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 2:55 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 2:55 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/17/18 2:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EffectTest.class);
	}
}