/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Billy Bissic
 *
 */
@Document(collection="entertainer_biographies")
public class EntertainerBiography {
	private String _id;
	private String entertainerStageName;
	private String bigoraphicalContent;
	private String profileImage;
	
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
	 * @return the entertainerStageName
	 */
	public String getEntertainerStageName() {
		return entertainerStageName;
	}
	/**
	 * @param entertainerStageName the entertainerStageName to set
	 */
	public void setEntertainerStageName(String entertainerStageName) {
		this.entertainerStageName = entertainerStageName;
	}
	/**
	 * @return the bigoraphicalContent
	 */
	public String getBigoraphicalContent() {
		return bigoraphicalContent;
	}
	/**
	 * @param bigoraphicalContent the bigoraphicalContent to set
	 */
	public void setBigoraphicalContent(String bigoraphicalContent) {
		this.bigoraphicalContent = bigoraphicalContent;
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
