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

public class EmployeeSignature {
	
	private String employeeSignature;
	private String employeeSignatureDate;
	
	/**
	 * @return the employeeSignature
	 */
	public String getEmployeeSignature() {
		return employeeSignature;
	}
	/**
	 * @param employeeSignature the employeeSignature to set
	 */
	public void setEmployeeSignature(String employeeSignature) {
		this.employeeSignature = employeeSignature;
	}
	/**
	 * @return the employeeSignatureDate
	 */
	public String getEmployeeSignatureDate() {
		return employeeSignatureDate;
	}
	/**
	 * @param employeeSignatureDate the employeeSignatureDate to set
	 */
	public void setEmployeeSignatureDate(String employeeSignatureDate) {
		this.employeeSignatureDate = employeeSignatureDate;
	}
}
