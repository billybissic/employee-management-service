/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

/**
 * @author Billy Bissic
 *
 */

public class EntertainerInformation {
	private String phone;
	private String hireDate;
	private EmergencyContact emergencyContacts;
	private Identification identification;
	private String stageName;
	private String highestLevelOfEducation;
	private boolean hasDancedBefore;
	
	/**
	 * @return the stageName
	 */
	public String getStageName() {
		return stageName;
	}
	/**
	 * @param stageName the stageName to set
	 */
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
	/**
	 * @return the hasDancedBefore
	 */
	public boolean isHasDancedBefore() {
		return hasDancedBefore;
	}
	/**
	 * @param hasDancedBefore the hasDancedBefore to set
	 */
	public void setHasDancedBefore(boolean hasDancedBefore) {
		this.hasDancedBefore = hasDancedBefore;
	}
}
