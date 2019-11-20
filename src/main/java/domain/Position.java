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

@Document(collection="open_positions")
public class Position {
	@Id
	private String _id;
	private String positionTitle;
	private String positionType;
	private String positionDescription;
	private String applicationType;
	private String positionStatus;
	
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
	 * @return the positionTitle
	 */
	public String getPositionTitle() {
		return positionTitle;
	}
	/**
	 * @param positionTitle the positionTitle to set
	 */
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}
	/**
	 * @return the positionType
	 */
	public String getPositionType() {
		return positionType;
	}
	/**
	 * @param positionType the positionType to set
	 */
	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}
	/**
	 * @return the positionDescription
	 */
	public String getPositionDescription() {
		return positionDescription;
	}
	/**
	 * @param positionDescription the positionDescription to set
	 */
	public void setPositionDescription(String positionDescription) {
		this.positionDescription = positionDescription;
	}
	/**
	 * @return the applicationType
	 */
	public String getApplicationType() {
		return applicationType;
	}
	/**
	 * @param applicationType the applicationType to set
	 */
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	/**
	 * @return the positionStatus
	 */
	public String getPositionStatus() {
		return positionStatus;
	}
	/**
	 * @param positionStatus the positionStatus to set
	 */
	public void setPositionStatus(String positionStatus) {
		this.positionStatus = positionStatus;
	}
}
