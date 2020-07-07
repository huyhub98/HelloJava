package com.quanghuy.company;

import java.util.Scanner;

public class Leader extends Employee {
	private int teamSize;
	final double luongCoBan = 10000000;
	double bonus1 = 0.5;
	double bonus2 = 0.1;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhập số người kinh nghiệm trong team:");
		this.teamSize = new Scanner(System.in).nextInt();
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("Số người kinh nghiệm trong team: " + this.teamSize);
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double bonus() {
		if (teamSize > 10) {
			return luongCoBan * bonus1;
		} else {
			return luongCoBan * bonus2;
		}
	}
}