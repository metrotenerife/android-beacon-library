/**
 * 
 * Metropolitano de Tenerife S.A.
 * http://www.metrotenerife.com/
 * 
 */
package org.altbeacon.beacon;

import java.util.Comparator;

/**
 * The <code>Utils</code> class is used for utility classes and methods.
 */
public final class Utils {

	private static final String TAG = "Utils";
	
	private Utils() { }
	
	/**
	 * This class defines a way of comparing two beacons using their relative 
	 * distance to the central device (e.g., mobile phone).
	 */
	public static class BeaconProximityComparator implements Comparator<Beacon> {
		@Override
		public int compare(Beacon b1, Beacon b2) {
			if(b1.getDistance() < b2.getDistance()) return -1;
			if(b1.getDistance() > b2.getDistance()) return 1;
			return 0;
		}
	}
}
