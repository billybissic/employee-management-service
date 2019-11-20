/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */

package application;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Billy Bissic
 *
 */
@Component
@ConfigurationProperties
public class UploadProperties {
	
	/* Global Properties */
	private String employeeSaveDirectory;
	private String applicationSaveDirectory;
	
	/**
	 * @return the employeeSaveDirectory
	 */
	public String getEmployeeSaveDirectory() {
		return employeeSaveDirectory;
	}
	/**
	 * @param employeeSaveDirectory the employeeSaveDirectory to set
	 */
	public void setEmployeeSaveDirectory(String employeeSaveDirectory) {
		this.employeeSaveDirectory = employeeSaveDirectory;
	}
	/**
	 * @return the applicationSaveDirectory
	 */
	public String getApplicationSaveDirectory() {
		return applicationSaveDirectory;
	}
	/**
	 * @param applicationSaveDirectory the applicationSaveDirectory to set
	 */
	public void setApplicationSaveDirectory(String applicationSaveDirectory) {
		this.applicationSaveDirectory = applicationSaveDirectory;
	}
}
