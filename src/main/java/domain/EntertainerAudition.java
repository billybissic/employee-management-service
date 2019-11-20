/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Billy Bissic
 *
 */

@Document(collection="entertainer-auditions")
public class EntertainerAudition {

	@Id
	private String _id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String homePhoneNumber;
	private String cellPhoneNumber;
	private String auditionDate;
	private String auditionTime;
	private String auditionResults;
	
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * @return the homePhoneNumber
	 */
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	/**
	 * @param homePhoneNumber the homePhoneNumber to set
	 */
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}
	/**
	 * @return the cellPhoneNumber
	 */
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}
	/**
	 * @param cellPhoneNumber the cellPhoneNumber to set
	 */
	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}
	/**
	 * @return the auditionDate
	 */
	public String getAuditionDate() {
		return auditionDate;
	}
	/**
	 * @param auditionDate the auditionDate to set
	 */
	public void setAuditionDate(String auditionDate) {
		this.auditionDate = auditionDate;
	}
	/**
	 * @return the auditionTime
	 */
	public String getAuditionTime() {
		return auditionTime;
	}
	/**
	 * @param auditionTime the auditionTime to set
	 */
	public void setAuditionTime(String auditionTime) {
		this.auditionTime = auditionTime;
	}
	/**
	 * @return the auditionResults
	 */
	public String getAuditionResults() {
		return auditionResults;
	}
	/**
	 * @param auditionResults the auditionResults to set
	 */
	public void setAuditionResults(String auditionResults) {
		this.auditionResults = auditionResults;
	}
}
