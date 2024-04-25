package com.example.demo.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Movies {
	@Id
	@Column
	private int mid;
	@Column
	private String mname;
	@Column
	private String mgenre;
	@Column
	private double mratings;
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMgenre() {
		return mgenre;
	}

	public void setMgenre(String mgenre) {
		this.mgenre = mgenre;
	}

	public double getMratings() {
		return mratings;
	}

	public void setMratings(double mratings) {
		this.mratings = mratings;
	}

	
	
}
