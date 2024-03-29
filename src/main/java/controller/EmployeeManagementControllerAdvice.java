/**
* MIT License
*
* Copyright (c) 2018 Billy Bissic
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
**/
package controller;

import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import exception.BartenderApplicationAlreadyExistsException;
import exception.BartenderApplicationNotFoundException;
import exception.EntertainerApplicationAlreadyExistsException;
import exception.EntertainerApplicationNotFoundException;
import exception.EntertainerAuditionAlreadyExistsException;
import exception.EntertainerAuditionNotFoundException;
import exception.NoDataAvailableException;
import exception.OpenPositionNotFoundException;
import exception.StaffMemberAlreadyExistsException;
import exception.StaffMemberNotFoundException;

/**
 * @author Billy Bissic
 *
 */

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class EmployeeManagementControllerAdvice {

	@ExceptionHandler(BartenderApplicationAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors barTenderApplicationAlreadyExistsException(BartenderApplicationAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(BartenderApplicationNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors barTenderApplicationNotFoundException(BartenderApplicationNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EntertainerApplicationAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors entertainerApplicationAlreadyExistsException(EntertainerApplicationAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EntertainerApplicationNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors entertainerApplicationNotFoundException(EntertainerApplicationNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EntertainerAuditionAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors entertainerAuditionAlreadyExistsException(EntertainerAuditionAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(EntertainerAuditionNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors entertainerAuditionNotFoundException(EntertainerAuditionNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(OpenPositionNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors openPositionNotFoundException(OpenPositionNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(StaffMemberAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors staffMemberAlreadyExistsException(StaffMemberAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ExceptionHandler(StaffMemberNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors staffMemberNotFoundException(StaffMemberNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
