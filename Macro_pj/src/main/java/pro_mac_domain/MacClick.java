package pro_mac_domain;

import jakarta.persistence.Entity;

@Entity
public class MacClick {
	
	private Long id;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private int x4;
	private int y4;
	private int x5;
	private int y5;
	private int x6;
	private int y6;
	
	public MacClick() {
		
	}
	public MacClick(Long id, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6,
			int y6) {
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
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public int getX3() {
		return x3;
	}
	public void setX3(int x3) {
		this.x3 = x3;
	}
	public int getY3() {
		return y3;
	}
	public void setY3(int y3) {
		this.y3 = y3;
	}
	public int getX4() {
		return x4;
	}
	public void setX4(int x4) {
		this.x4 = x4;
	}
	public int getY4() {
		return y4;
	}
	public void setY4(int y4) {
		this.y4 = y4;
	}
	public int getX5() {
		return x5;
	}
	public void setX5(int x5) {
		this.x5 = x5;
	}
	public int getY5() {
		return y5;
	}
	public void setY5(int y5) {
		this.y5 = y5;
	}
	public int getX6() {
		return x6;
	}
	public void setX6(int x6) {
		this.x6 = x6;
	}
	public int getY6() {
		return y6;
	}
	public void setY6(int y6) {
		this.y6 = y6;
	}
	
}
