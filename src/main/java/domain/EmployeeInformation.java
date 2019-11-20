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

public class EmployeeInformation {
	
	private String phone;
	private String emailAddress;
	private boolean elgibleForEmployment;
	private boolean isUsVeteran;
	private boolean backgrounCheckAgreement;
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the elgibleForEmployment
	 */
	public boolean isElgibleForEmployment() {
		return elgibleForEmployment;
	}
	/**
	 * @param elgibleForEmployment the elgibleForEmployment to set
	 */
	public void setElgibleForEmployment(boolean elgibleForEmployment) {
		this.elgibleForEmployment = elgibleForEmployment;
	}
	/**
	 * @return the isUsVeteran
	 */
	public boolean isUsVeteran() {
		return isUsVeteran;
	}
	/**
	 * @param isUsVeteran the isUsVeteran to set
	 */
	public void setUsVeteran(boolean isUsVeteran) {
		this.isUsVeteran = isUsVeteran;
	}
	/**
	 * @return the backgrounCheckAgreement
	 */
	public boolean isBackgrounCheckAgreement() {
		return backgrounCheckAgreement;
	}
	/**
	 * @param backgrounCheckAgreement the backgrounCheckAgreement to set
	 */
	public void setBackgrounCheckAgreement(boolean backgrounCheckAgreement) {
		this.backgrounCheckAgreement = backgrounCheckAgreement;
	}
}
