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

public class EmployeeEmploymentPosition {

	private String desiredPosition;
	private String availableStartDate;
	private String desiredPay;
	private String desiredEmploymentType;
	
	/**
	 * @return the desiredPosition
	 */
	public String getDesiredPosition() {
		return desiredPosition;
	}
	/**
	 * @param desiredPosition the desiredPosition to set
	 */
	public void setDesiredPosition(String desiredPosition) {
		this.desiredPosition = desiredPosition;
	}
	/**
	 * @return the availableStartDate
	 */
	public String getAvailableStartDate() {
		return availableStartDate;
	}
	/**
	 * @param availableStartDate the availableStartDate to set
	 */
	public void setAvailableStartDate(String availableStartDate) {
		this.availableStartDate = availableStartDate;
	}
	/**
	 * @return the desiredPay
	 */
	public String getDesiredPay() {
		return desiredPay;
	}
	/**
	 * @param desiredPay the desiredPay to set
	 */
	public void setDesiredPay(String desiredPay) {
		this.desiredPay = desiredPay;
	}
	/**
	 * @return the desiredEmploymentType
	 */
	public String getDesiredEmploymentType() {
		return desiredEmploymentType;
	}
	/**
	 * @param desiredEmploymentType the desiredEmploymentType to set
	 */
	public void setDesiredEmploymentType(String desiredEmploymentType) {
		this.desiredEmploymentType = desiredEmploymentType;
	}
}
