package com.pawar.inventory.entity;

import java.time.LocalDateTime;

import com.pawar.inventory.entity.Lpn;
import com.pawar.inventory.entity.Item;
import com.pawar.inventory.entity.Location;
import com.pawar.inventory.entity.Lpn;

public class Inventory {

	private int inventory_id;
	

	private Lpn lpn;
	
	
	private Item item;
	private float on_hand_qty;	
	private Location location;
	private String locn_class;
	private LocalDateTime created_dttm;
	private LocalDateTime last_updated_dttm;
	private String created_source;
	private String last_updated_source;

	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Inventory(int inventory_id, Lpn lpn, Item item, float on_hand_qty, Location location,
			String locn_class, LocalDateTime created_dttm, LocalDateTime last_updated_dttm, String created_source,
			String last_updated_source) {
		this.inventory_id = inventory_id;
		this.lpn = lpn;
		this.item = item;
		this.on_hand_qty = on_hand_qty;
		this.location = location;
		this.locn_class = locn_class;
		this.created_dttm = created_dttm;
		this.last_updated_dttm = last_updated_dttm;
		this.created_source = created_source;
		this.last_updated_source = last_updated_source;
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}

	public Lpn getLpn() {
		return lpn;
	}

	public void setLpn(Lpn lpn) {
		this.lpn = lpn;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public float getOn_hand_qty() {
		return on_hand_qty;
	}

	public void setOn_hand_qty(float on_hand_qty) {
		this.on_hand_qty = on_hand_qty;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getLocn_class() {
		return locn_class;
	}

	public void setLocn_class(String locn_class) {
		this.locn_class = locn_class;
	}

	public LocalDateTime getCreated_dttm() {
		return created_dttm;
	}

	public void setCreated_dttm(LocalDateTime created_dttm) {
		this.created_dttm = created_dttm;
	}

	public LocalDateTime getLast_updated_dttm() {
		return last_updated_dttm;
	}

	public void setLast_updated_dttm(LocalDateTime last_updated_dttm) {
		this.last_updated_dttm = last_updated_dttm;
	}

	public String getCreated_source() {
		return created_source;
	}

	public void setCreated_source(String created_source) {
		this.created_source = created_source;
	}

	public String getLast_updated_source() {
		return last_updated_source;
	}

	public void setLast_updated_source(String last_updated_source) {
		this.last_updated_source = last_updated_source;
	}

	@Override
	public String toString() {
		return "Inventory [inventory_id=" + inventory_id + ", lpn=" + lpn + ", item=" + item
				+ ", created_dttm=" + created_dttm + ", last_updated_dttm=" + last_updated_dttm + ", created_source="
				+ created_source + ", last_updated_source=" + last_updated_source + "]";
	}
	
	

	
}
