/**
 * 
 */
package net.specialbrands.strawberry;

/**
 * @author danielcrompton
 * 
 */
enum DayOfWeek {

	SUNDAY(0), //
	MONDAY(1), //
	TUESDAY(2), //
	WEDNESDAY(3), //
	THURSDAY(4), //
	FRIDAY(5), //
	SATURDAY(6);
	/*
	 * SUNDAY("sun", 0), // MONDAY("mon", 1), // TUESDAY("tue", 2), //
	 * WEDNESDAY("wed", 3), // THURSDAY("thu", 4), // FRIDAY("fri", 5), //
	 * SATURDAY("sat", 6);
	 */

	public int dow;

	DayOfWeek(int _dow) {
		this.dow = _dow;
	}
}
