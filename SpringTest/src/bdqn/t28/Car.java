package bdqn.t28;

import javax.annotation.Resource;

public class Car {
	
	private String pingpai;
	private String  yanse;
	private String  zhuanmaidian;
	private int jiage;

	public String getPingpai() {
		return pingpai;
	}

	public void setPingpai(String pingpai) {
		this.pingpai = pingpai;
	}

	public String getYanse() {
		return yanse;
	}

	public void setYanse(String yanse) {
		this.yanse = yanse;
	}

	public String getZhuanmaidian() {
		return zhuanmaidian;
	}

	public void setZhuanmaidian(String zhuanmaidian) {
		this.zhuanmaidian = zhuanmaidian;
	}

	public int getJiage() {
		return jiage;
	}

	public void setJiage(int jiage) {
		this.jiage = jiage;
	}

	public Car(String pingpai, String yanse, String zhuanmaidian) {
		super();
		this.pingpai = pingpai;
		this.yanse = yanse;
		this.zhuanmaidian = zhuanmaidian;
	}
	
	public Car(String pingpai, String yanse, int jiage) {
		super();
		this.pingpai = pingpai;
		this.yanse = yanse;
		this.jiage = jiage;
	}

	
	@Override
	public String toString() {
		return "Car [pingpai=" + pingpai + ", yanse=" + yanse + ", zhuanmaidian=" + zhuanmaidian + ", jiage=" + jiage
				+ "]";
	}




}
