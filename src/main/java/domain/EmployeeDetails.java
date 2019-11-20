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
public class EmployeeDetails {

	private String emailAddress;
	private String phoneNumber;
	private String staffPosition;
	private String employeeSummary;
	private String profileImage;
	
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
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the staffPosition
	 */
	public String getStaffPosition() {
		return staffPosition;
	}
	/**
	 * @param staffPosition the staffPosition to set
	 */
	public void setStaffPosition(String staffPosition) {
		this.staffPosition = staffPosition;
	}
	/**
	 * @return the employeeSummary
	 */
	public String getEmployeeSummary() {
		return employeeSummary;
	}
	/**
	 * @param employeeSummary the employeeSummary to set
	 */
	public void setEmployeeSummary(String employeeSummary) {
		this.employeeSummary = employeeSummary;
	}
	/**
	 * @return the profileImage
	 */
	public String getProfileImage() {
		return profileImage;
	}
	/**
	 * @param profileImage the profileImage to set
	 */
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
}
