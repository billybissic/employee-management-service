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

public class EmployeeReference {

	private String referenceEmployerName;
	private String referencePositionTitle;
	private String referenceCompanyName;
	private String referenceCompanyPhone;
	
	/**
	 * @return the referenceEmployerName
	 */
	public String getReferenceEmployerName() {
		return referenceEmployerName;
	}
	/**
	 * @param referenceEmployerName the referenceEmployerName to set
	 */
	public void setReferenceEmployerName(String referenceEmployerName) {
		this.referenceEmployerName = referenceEmployerName;
	}
	/**
	 * @return the referencePositionTitle
	 */
	public String getReferencePositionTitle() {
		return referencePositionTitle;
	}
	/**
	 * @param referencePositionTitle the referencePositionTitle to set
	 */
	public void setReferencePositionTitle(String referencePositionTitle) {
		this.referencePositionTitle = referencePositionTitle;
	}
	/**
	 * @return the referenceCompanyName
	 */
	public String getReferenceCompanyName() {
		return referenceCompanyName;
	}
	/**
	 * @param referenceCompanyName the referenceCompanyName to set
	 */
	public void setReferenceCompanyName(String referenceCompanyName) {
		this.referenceCompanyName = referenceCompanyName;
	}
	/**
	 * @return the referenceCompanyPhone
	 */
	public String getReferenceCompanyPhone() {
		return referenceCompanyPhone;
	}
	/**
	 * @param referenceCompanyPhone the referenceCompanyPhone to set
	 */
	public void setReferenceCompanyPhone(String referenceCompanyPhone) {
		this.referenceCompanyPhone = referenceCompanyPhone;
	}
}
