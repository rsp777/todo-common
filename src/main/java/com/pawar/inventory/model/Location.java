package com.pawar.inventory.model;

import java.time.LocalDateTime;

public class Location {
	

	private int locn_id;
	private String locnBrcd;
	private String locnClass;
	private double length;
	private double width;
	private double height;
	private double maxWeight;
	private double maxVolume;
	private double maxQty;
	private double occupiedQty;	
	private double currVol;
	private double currWeight;
	private LocalDateTime createdDttm;
	private LocalDateTime lastUpdatedDttm;
	private String createdSource;
	private String lastUpdatedSource;

	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(int locn_id, String locnBrcd, String locnClass, double length, double width, double height,
			double maxWeight, double maxVolume, double maxQty,double occupiedQty, double currVol, double currWeight,
			LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource, String lastUpdatedSource) {
		super();
		this.locn_id = locn_id;
		this.locnBrcd = locnBrcd;
		this.locnClass = locnClass;
		this.length = length;
		this.width = width;
		this.height = height;
		this.maxWeight = maxWeight;
		this.maxVolume = maxVolume;
		this.maxQty = maxQty;
		this.occupiedQty = occupiedQty;
		this.currVol = currVol;
		this.currWeight = currWeight;
		this.createdDttm = createdDttm;
		this.lastUpdatedDttm = lastUpdatedDttm;
		this.createdSource = createdSource;
		this.lastUpdatedSource = lastUpdatedSource;
	}

	public int getLocn_id() {
		return locn_id;
	}

	public void setLocn_id(int locn_id) {
		this.locn_id = locn_id;
	}

	public String getLocn_brcd() {
		return locnBrcd;
	}

	public void setLocn_brcd(String locnBrcd) {
		this.locnBrcd = locnBrcd;
	}

	public String getLocn_class() {
		return locnClass;
	}

	public void setLocn_class(String locnClass) {
		this.locnClass = locnClass;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getMax_weight() {
		return maxWeight;
	}

	public void setMax_weight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getMax_volume() {
		return maxVolume;
	}

	public void setMax_volume(double maxVolume) {
		this.maxVolume = maxVolume;
	}

	public double getMax_qty() {
		return maxQty;
	}

	public void setMax_qty(double maxQty) {
		this.maxQty = maxQty;
	}

	public double getOccupied_qty() {
		return occupiedQty;
	}

	public void setOccupied_qty(double occupiedQty) {
		this.occupiedQty = occupiedQty;
	}
	public double getCurr_vol() {
		return currVol;
	}

	public void setCurr_vol(double currVol) {
		this.currVol = currVol;
	}

	public double getCurr_weight() {
		return currWeight;
	}

	public void setCurr_weight(double currWeight) {
		this.currWeight = currWeight;
	}

	public LocalDateTime getCreated_dttm() {
		return createdDttm;
	}

	public void setCreated_dttm(LocalDateTime createdDttm) {
		this.createdDttm = createdDttm;
	}

	public LocalDateTime getLast_updated_dttm() {
		return lastUpdatedDttm;
	}

	public void setLast_updated_dttm(LocalDateTime lastUpdatedDttm) {
		this.lastUpdatedDttm = lastUpdatedDttm;
	}

	public String getCreated_source() {
		return createdSource;
	}

	public void setCreated_source(String createdSource) {
		this.createdSource = createdSource;
	}

	public String getLast_updated_source() {
		return lastUpdatedSource;
	}

	public void setLast_updated_source(String lastUpdatedSource) {
		this.lastUpdatedSource = lastUpdatedSource;
	}

	@Override
	public String toString() {
		return "Location [locn_id=" + locn_id + ", locnBrcd=" + locnBrcd + ", locnClass=" + locnClass + ", length="
				+ length + ", width=" + width + ", height=" + height + ", maxWeight=" + maxWeight + ", maxVolume="
				+ maxVolume + ", maxQty=" + maxQty + ", occupiedQty=" + occupiedQty + ", currVol=" + currVol
				+ ", currWeight=" + currWeight + ", createdDttm=" + createdDttm + ", lastUpdatedDttm="
				+ lastUpdatedDttm + ", createdSource=" + createdSource + ", lastUpdatedSource="
				+ lastUpdatedSource + "]";
	}

	


}
