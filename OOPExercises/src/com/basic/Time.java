package com.basic;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		String hour = "", minute = "", second = "";
		if (this.hour < 10) {
			hour = "0" + this.hour;
		} else {
			hour = "" + this.hour;
		}
		if (this.minute < 10) {
			minute = "0" + this.minute;
		} else {
			minute = "" + this.minute;
		}
		if (this.second < 10) {
			second = "0" + this.second;
		} else {
			second = "" + this.second;
		}

		return hour + ":" + minute + ":" + second;
	}

	public Time nextSecond() {
		if (second == 59 && minute == 59 && hour == 23) {
			second = minute = hour = 0;
		} else if(second == 59 && minute == 59) {
			second=minute=0;
			hour++;
		} else if(second == 59) {
			second=0;
			minute++;
		} else {
			second++;
		}
		//Time updated = new Time(hour, minute, second);

		return this;
	}

	public Time previousSecond() {
		if (second == 0 && minute == 0 && hour == 0) {
			second = minute = 59;
			hour = 23;
		} else if(second == 0 && minute == 0) {
			second=minute=59;
			hour--;
		} else if(second == 0) {
			second=59;
			minute--;
		} else {
			second--;
		}
		//Time updated = new Time(hour, minute, second);

		return this;
	}

}
