package com.monotonic.collections._3_lists;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.monotonic.collections.common.Product;

public class ShipmentTest {

	public static Product door = new Product("Wooden Door", 35);

	public static Product floorPanel = new Product("Floor Panel", 25);

	public static Product window = new Product("Glass Window", 10);

	private Shipment shipment = new Shipment();

	@Test
	public void shouldAddItems() {
		shipment.add(door);
		shipment.add(window);

		assertThat(shipment, contains(door, window));
	}

	@Test
	public void shouldReplaceItems() {
		shipment.add(door);
		shipment.add(window);

		assertTrue(shipment.replace(door, floorPanel));
		assertThat(shipment, contains(floorPanel, window));
	}

	@Test
	public void shouldNotReplaceItems() {

		shipment.add(window);

		assertFalse(shipment.replace(door, floorPanel));
		assertThat(shipment, contains(window));
	}

	@Test
	public void shouldIdentifyVanRequirements() {
		shipment.add(door);
		shipment.add(window);
		shipment.add(floorPanel);
		
		shipment.prepare();
		
		assertThat(shipment.getLightVanProducts(), contains(window));
		assertThat(shipment.getHeavyVanProducts(), contains(floorPanel,door));
	}


}
