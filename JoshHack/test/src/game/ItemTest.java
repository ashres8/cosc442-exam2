package game;

import java.awt.Color;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ItemTest</code> contains tests for the class <code>{@link Item}</code>.
 *
 * @generatedBy CodePro at 5/17/18 2:44 PM
 * @author asims
 * @version $Revision: 1.0 $
 */
public class ItemTest {
	/**
	 * Run the Item(char,Color,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		String appearance = "";

		Item result = new Item(glyph, color, name, appearance);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.name());
		assertEquals(0, result.rangedAttackValue());
		assertEquals(1, result.thrownAttackValue());
		assertEquals('', result.glyph());
		assertEquals("", result.details());
		assertEquals("", result.appearance());
		assertEquals(0, result.foodValue());
		assertEquals(0, result.attackValue());
		assertEquals(null, result.quaffEffect());
		assertEquals(0, result.defenseValue());
	}

	/**
	 * Run the Item(char,Color,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testItem_2()
		throws Exception {
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		String appearance = null;

		Item result = new Item(glyph, color, name, appearance);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.name());
		assertEquals(0, result.rangedAttackValue());
		assertEquals(1, result.thrownAttackValue());
		assertEquals('', result.glyph());
		assertEquals("", result.details());
		assertEquals("", result.appearance());
		assertEquals(0, result.foodValue());
		assertEquals(0, result.attackValue());
		assertEquals(null, result.quaffEffect());
		assertEquals(0, result.defenseValue());
	}

	/**
	 * Run the void addWrittenSpell(String,int,Effect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testAddWrittenSpell_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		String name = "";
		int manaCost = 1;
		Effect effect = new Effect(1);

		fixture.addWrittenSpell(name, manaCost, effect);

		// add additional test code here
		assertEquals(name, fixture.writtenSpells().get(0).name());
	}

   /**
	 * Run the String appearance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testAppearance_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		String result = fixture.appearance();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.attackValue();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Color color() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		Color result = fixture.color();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=0,g=0,b=1]", result.toString());
		assertEquals(1, result.getBlue());
		assertEquals(0, result.getRed());
		assertEquals(255, result.getAlpha());
		assertEquals(0, result.getGreen());
		assertEquals(-16777215, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testDefenseValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.defenseValue();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String details() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testDetails_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		String result = fixture.details();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String details() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testDetails_2()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		String result = fixture.details();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int foodValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testFoodValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.foodValue();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the char glyph() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		char result = fixture.glyph();

		// add additional test code here
		assertEquals('', result);
	}

	/**
	 * Run the void modifyAttackValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testModifyAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyAttackValue(amount);

		// add additional test code here
		assertEquals(amount, fixture.attackValue());
	}

	/**
	 * Run the void modifyDefenseValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testModifyDefenseValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyDefenseValue(amount);

		// add additional test code here
		assertEquals(amount, fixture.defenseValue());
	}

	/**
	 * Run the void modifyFoodValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testModifyFoodValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyFoodValue(amount);

		// add additional test code here

		assertEquals(amount, fixture.foodValue());
	}

	/**
	 * Run the void modifyRangedAttackValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testModifyRangedAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyRangedAttackValue(amount);

		// add additional test code here
		assertEquals(amount, fixture.rangedAttackValue());
	}

	/**
	 * Run the void modifyThrownAttackValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testModifyThrownAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyThrownAttackValue(amount);

		// add additional test code here
		assertTrue(amount <= fixture.thrownAttackValue());
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		String result = fixture.name();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Effect quaffEffect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testQuaffEffect_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		Effect result = fixture.quaffEffect();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDone());
	}

	/**
	 * Run the int rangedAttackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testRangedAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.rangedAttackValue();

		// add additional test code here
		assertEquals(0, result);
	}

	
	/**
	 * Run the int thrownAttackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testThrownAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.thrownAttackValue();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the List<Spell> writtenSpells() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	@Test
	public void testWrittenSpells_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		List<Spell> result = fixture.writtenSpells();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 2:44 PM
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
	 * @generatedBy CodePro at 5/17/18 2:44 PM
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
	 * @generatedBy CodePro at 5/17/18 2:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ItemTest.class);
	}
}