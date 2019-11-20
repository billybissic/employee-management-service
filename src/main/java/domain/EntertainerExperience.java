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

public class EntertainerExperience {
	
	private String nameOfVenue;
	private String city;
	private String state;
	private Integer lengthOfEmploymentYears;
	private Integer lengthOfEmploymentMonths;
	
	/**
	 * @return the nameOfVenue
	 */
	public String getNameOfVenue() {
		return nameOfVenue;
	}
	/**
	 * @param nameOfVenue the nameOfVenue to set
	 */
	public void setNameOfVenue(String nameOfVenue) {
		this.nameOfVenue = nameOfVenue;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the lengthOfEmploymentYears
	 */
	public Integer getLengthOfEmploymentYears() {
		return lengthOfEmploymentYears;
	}
	/**
	 * @param lengthOfEmploymentYears the lengthOfEmploymentYears to set
	 */
	public void setLengthOfEmploymentYears(Integer lengthOfEmploymentYears) {
		this.lengthOfEmploymentYears = lengthOfEmploymentYears;
	}
	/**
	 * @return the lengthOfEmploymentMonths
	 */
	public Integer getLengthOfEmploymentMonths() {
		return lengthOfEmploymentMonths;
	}
	/**
	 * @param lengthOfEmploymentMonths the lengthOfEmploymentMonths to set
	 */
	public void setLengthOfEmploymentMonths(Integer lengthOfEmploymentMonths) {
		this.lengthOfEmploymentMonths = lengthOfEmploymentMonths;
	}
}
