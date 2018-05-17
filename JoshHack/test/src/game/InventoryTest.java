package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 5/17/18 1:56 PM
 * @author asims
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		int max = 1;

		Inventory result = new Inventory(max);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isFull());
	}

	/**
	 * Run the void add(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.add(item);

		// add additional test code here
		assertEquals(item, fixture.get(0));
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");
		fixture.add(item);
		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testContains_3()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Item[] getItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testGetItems_1()
		throws Exception {
		Inventory fixture = new Inventory(1);

		Item[] result = fixture.getItems();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(null, result[0]);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testIsFull_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		fixture.add(new Item(',', new Color(1), "", ""));
		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testIsFull_2()
		throws Exception {
		Inventory fixture = new Inventory(1);

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testIsFull_3()
		throws Exception {
		Inventory fixture = new Inventory(1);

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");
		fixture.add(item);

		fixture.remove(item);

		// add additional test code here
		assertFalse(fixture.contains(item));
	}

		/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 1:56 PM
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
	 * @generatedBy CodePro at 5/17/18 1:56 PM
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
	 * @generatedBy CodePro at 5/17/18 1:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}