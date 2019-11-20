/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import domain.EntertainerApplication;

/**
 * @author Billy Bissic
 *
 */
public interface EntertainerApplicationRepository extends MongoRepository<EntertainerApplication, String> {

}
