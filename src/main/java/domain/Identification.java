/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import java.sql.Date;

/**
 * @author Billy Bissic
 *
 */
public class Identification {
	private String driversLicenseNumber;
	private Date birthday;
	private Integer age;
	
	/**
	 * @return the driversLicenseNumber
	 */
	public String getDriversLicenseNumber() {
		return driversLicenseNumber;
	}
	/**
	 * @param driversLicenseNumber the driversLicenseNumber to set
	 */
	public void setDriversLicenseNumber(String driversLicenseNumber) {
		this.driversLicenseNumber = driversLicenseNumber;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
}
