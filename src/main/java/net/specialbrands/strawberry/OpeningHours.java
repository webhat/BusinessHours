/*
 * Copyright (c) 2013 Daniël W. Crompton <info+straw@specialbrands.net>
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
/**
 * 
 */
package net.specialbrands.strawberry;

public class OpeningHours {
	/**
	 * 
	 */
	private String[] open;
	private String[] close;
	private int openHour;
	private int openMinute;
	private int closeHour;
	private int closeMinute;

	/**
	 * @param _open
	 * @param _close
	 * @param businessHourCalculator
	 *            TODO
	 */
	public OpeningHours(String _open, String _close) {
		open = _open.split(":");
		openHour = new Integer(open[0]);
		openMinute = new Integer(open[1]);

		close = _close.split(":");
		closeHour = new Integer(close[0]);
		closeMinute = new Integer(close[1]);
	}

	/**
	 * @deprecated
	 * @return the close
	 */
	public String[] getClose() {
		return close;
	}

	/**
	 * @deprecated
	 * @param close
	 *            the close to set
	 */
	public void setClose(String[] close) {
		this.close = close;
	}

	/**
	 * @deprecated
	 * @return the open
	 */
	public String[] getOpen() {
		return open;
	}

	/**
	 * @deprecated
	 * @param open
	 *            the open to set
	 */
	public void setOpen(String[] open) {
		this.open = open;
	}

	/**
	 * @return
	 */
	public int getOpenHour() {
		// TODO Auto-generated method stub
		return openHour;
	}

	/**
	 * @return
	 */
	public int getOpenMinute() {
		// TODO Auto-generated method stub
		return openMinute;
	}

	/**
	 * @return
	 */
	public int getCloseHour() {
		// TODO Auto-generated method stub
		return closeHour;
	}

	/**
	 * @return
	 */
	public int getCloseMinute() {
		// TODO Auto-generated method stub
		return closeMinute;
	}
}