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

public class EmployeeEducation {

	private String schoolName;
	private String location;
	private Integer yearsAttended;
	private String major;
	private String degreeRecieved;
	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}
	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the yearsAttended
	 */
	public Integer getYearsAttended() {
		return yearsAttended;
	}
	/**
	 * @param yearsAttended the yearsAttended to set
	 */
	public void setYearsAttended(Integer yearsAttended) {
		this.yearsAttended = yearsAttended;
	}
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * @return the degreeRecieved
	 */
	public String getDegreeRecieved() {
		return degreeRecieved;
	}
	/**
	 * @param degreeRecieved the degreeRecieved to set
	 */
	public void setDegreeRecieved(String degreeRecieved) {
		this.degreeRecieved = degreeRecieved;
	}
}
