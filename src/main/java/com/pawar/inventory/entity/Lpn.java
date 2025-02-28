package com.pawar.inventory.entity;

import java.time.LocalDateTime;

import com.pawar.inventory.entity.Item;


public class Lpn {
	

	private int lpn_id;
	private String lpn_name;
	private Item item;
	private int quantity;
	private float length;
	private float width;
	private float height;
	private float weight;
	private float volume;
	private int lpn_facility_status;
	private LocalDateTime created_dttm;
	private LocalDateTime last_updated_dttm;
	private String created_source;
	private String last_updated_source;

	public Lpn() {
		// TODO Auto-generated constructor stub
	}

	public Lpn(int lpn_id, String lpn_name, Item item, int quantity, float length, float width, float height,
			float weight, float volume,int lpn_facility_status, LocalDateTime created_dttm, LocalDateTime last_updated_dttm, String created_source,
			String last_updated_source) {
		super();
		this.lpn_id = lpn_id;
		this.lpn_name = lpn_name;
		this.item = item;
		this.quantity = quantity;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.volume = volume;
		this.lpn_facility_status = lpn_facility_status;
		this.created_dttm = created_dttm;
		this.last_updated_dttm = last_updated_dttm;
		this.created_source = created_source;
		this.last_updated_source = last_updated_source;
	}

	public int getLpn_id() {
		return lpn_id;
	}

	public void setLpn_id(int lpn_id) {
		this.lpn_id = lpn_id;
	}

	public String getLpn_name() {
		return lpn_name;
	}

	public void setLpn_name(String lpn_name) {
		this.lpn_name = lpn_name;
	}
	
	
	

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public int getLpn_facility_status() {
		return lpn_facility_status;
	}

	public void setLpn_facility_status(int lpn_facility_status) {
		this.lpn_facility_status = lpn_facility_status;
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
		return "Lpn [lpn_id=" + lpn_id + ", lpn_name=" + lpn_name + ", item=" + item + ", quantity=" + quantity
				+ ", length=" + length + ", width=" + width + ", height=" + height + ", weight=" + weight + ", volume="
				+ volume + ", lpn_facility_status=" + lpn_facility_status + ", created_dttm=" + created_dttm
				+ ", last_updated_dttm=" + last_updated_dttm + ", created_source=" + created_source
				+ ", last_updated_source=" + last_updated_source + "]";
	}

	

}
