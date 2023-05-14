package com.click.pro.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MacClick2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String x1;
	private String y1;
	private String x2;
	private String y2;
	private String x3;
	private String y3;
	private String x4;
	private String y4;
	private String x5;
	private String y5;
	private String x6;
	private String y6;
	private String interval1;
	private String interval2;
	private String interval3;
	private String interval4;
	private String interval5;
	private String interval6;
	private String roop;
	private String indb;
	
	public MacClick2() {
		
	}



	public MacClick2(Long id, String x1, String y1, String x2, String y2, String x3, String y3, String x4, String y4,
			String x5, String y5, String x6, String y6, String interval1, String interval2, String interval3,
			String interval4, String interval5, String interval6, String roop, String indb) {
		super();
		this.id = id;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		this.x5 = x5;
		this.y5 = y5;
		this.x6 = x6;
		this.y6 = y6;
		this.interval1 = interval1;
		this.interval2 = interval2;
		this.interval3 = interval3;
		this.interval4 = interval4;
		this.interval5 = interval5;
		this.interval6 = interval6;
		this.roop = roop;
		this.indb = indb;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getX1() {
		return x1;
	}



	public void setX1(String x1) {
		this.x1 = x1;
	}



	public String getY1() {
		return y1;
	}



	public void setY1(String y1) {
		this.y1 = y1;
	}



	public String getX2() {
		return x2;
	}



	public void setX2(String x2) {
		this.x2 = x2;
	}



	public String getY2() {
		return y2;
	}



	public void setY2(String y2) {
		this.y2 = y2;
	}



	public String getX3() {
		return x3;
	}



	public void setX3(String x3) {
		this.x3 = x3;
	}



	public String getY3() {
		return y3;
	}



	public void setY3(String y3) {
		this.y3 = y3;
	}



	public String getX4() {
		return x4;
	}



	public void setX4(String x4) {
		this.x4 = x4;
	}



	public String getY4() {
		return y4;
	}



	public void setY4(String y4) {
		this.y4 = y4;
	}



	public String getX5() {
		return x5;
	}



	public void setX5(String x5) {
		this.x5 = x5;
	}



	public String getY5() {
		return y5;
	}



	public void setY5(String y5) {
		this.y5 = y5;
	}



	public String getX6() {
		return x6;
	}



	public void setX6(String x6) {
		this.x6 = x6;
	}



	public String getY6() {
		return y6;
	}



	public void setY6(String y6) {
		this.y6 = y6;
	}



	public String getInterval1() {
		return interval1;
	}



	public void setInterval1(String interval1) {
		this.interval1 = interval1;
	}



	public String getInterval2() {
		return interval2;
	}



	public void setInterval2(String interval2) {
		this.interval2 = interval2;
	}



	public String getInterval3() {
		return interval3;
	}



	public void setInterval3(String interval3) {
		this.interval3 = interval3;
	}



	public String getInterval4() {
		return interval4;
	}



	public void setInterval4(String interval4) {
		this.interval4 = interval4;
	}



	public String getInterval5() {
		return interval5;
	}



	public void setInterval5(String interval5) {
		this.interval5 = interval5;
	}



	public String getInterval6() {
		return interval6;
	}



	public void setInterval6(String interval6) {
		this.interval6 = interval6;
	}



	public String getRoop() {
		return roop;
	}



	public void setRoop(String roop) {
		this.roop = roop;
	}



	public String getIndb() {
		return indb;
	}



	public void setIndb(String indb) {
		this.indb = indb;
	}

	@Override
	public String toString() {
		return "MacClick2 [id=" + id + ", x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", x3=" + x3
				+ ", y3=" + y3 + ", x4=" + x4 + ", y4=" + y4 + ", x5=" + x5 + ", y5=" + y5 + ", x6=" + x6 + ", y6=" + y6
				+ "]";
	}
	
	
}
