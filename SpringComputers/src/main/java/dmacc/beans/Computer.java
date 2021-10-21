package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Noah Chung - nmchung
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */

@Entity
public class Computer {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String manufacturerName;
	private int yearReleased;
	
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(String name) {
		super();
		this.name = name;
	}
	public Computer(String name, String manufacturerName, int yearReleased) {
		super();
		this.name = name;
		this.manufacturerName = manufacturerName;
		this.yearReleased = yearReleased;
	}
	public Computer(long id, String name, String manufacturerName, int yearReleased) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturerName = manufacturerName;
		this.yearReleased = yearReleased;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", manufacturerName=" + manufacturerName + ", yearReleased="
				+ yearReleased + "]";
	}
}
