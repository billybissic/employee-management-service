/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import application.UploadProperties;
import domain.BartenderApplication;
import domain.EntertainerApplication;
import domain.EntertainerAudition;
import domain.Position;
import domain.StaffMember;
import exception.BartenderApplicationNotFoundException;
import exception.EntertainerApplicationNotFoundException;
import exception.EntertainerAuditionNotFoundException;
import exception.NoDataAvailableException;
import exception.OpenPositionNotFoundException;
import exception.StaffMemberNotFoundException;
import repository.BartenderApplicationRepository;
import repository.EntertainerApplicationRepository;
import repository.EntertainerAuditionRepository;
import repository.OpenPositionRepository;
import repository.StaffMemberRepository;

/**
 * @author Billy Bissic
 *
 */

@Controller
@RequestMapping(path="/api/EmployeeManagementService")
public class EmployeeManagementController {

	private UploadProperties properties;
	
	@Autowired
	public void setApp(UploadProperties properties) {
		this.properties = properties;
		System.out.println("Application Save Directory: " + properties.getApplicationSaveDirectory());
		System.out.println("Employee Image Save Directory: " + properties.getEmployeeSaveDirectory());
	}
	
	@Autowired
	private BartenderApplicationRepository barTenderApplicationRepository;
	@Autowired
	private EntertainerApplicationRepository entertainerApplicationRepository;
	@Autowired
	private EntertainerAuditionRepository entertainerAuditionRepository;
	@Autowired
	private StaffMemberRepository staffMemberRepository;
	@Autowired
	private OpenPositionRepository openPositionRepository;
	
	/* Bartender application */
	@RequestMapping(path="/getAllBarTenderApplications", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllBarTenderApplications() {
		
		try
		{
			Iterable<BartenderApplication> applications = barTenderApplicationRepository.findAll();
			if (applications == null) {
				throw new NoDataAvailableException();
			}
			
			return new ResponseEntity<Iterable<BartenderApplication>>(applications, HttpStatus.OK);
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/getBarTenderApplicationById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllBarTenderApplicationById(@RequestParam String _id) {
		
		try
		{
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(_id);
			if(bartenderApplication == null) {
				throw new BartenderApplicationNotFoundException();
			}
			return new ResponseEntity<BartenderApplication>(bartenderApplication, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/deleteBarTenderApplicationById/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteBarTenderApplicationById(@PathVariable String _id)
	{
		try
		{
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(_id);
			if(bartenderApplication == null) {
				throw new BartenderApplicationNotFoundException();
			}
			barTenderApplicationRepository.delete(bartenderApplication);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/createNewPosition", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createNewPosition(@RequestBody Position newOpenPosition) {
		try 
		{
			openPositionRepository.insert(newOpenPosition);
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/updatePosition", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> updatePosition(@RequestBody Position openPosition) {
		try
		{
			Position position = openPositionRepository.findOne(openPosition.get_id());
			
			if(position == null) {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
			openPositionRepository.save(openPosition);
			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="closePosition", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> closePosition(@RequestBody Position openPosition) {
		try
		{
			Position position = openPositionRepository.findOne(openPosition.get_id());
			
			if(position == null) {
				return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
			}
			openPositionRepository.save(openPosition);
			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deletePosition", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> deletePosition(@RequestBody Position openPosition) {
		try
		{
			Position position = openPositionRepository.findOne(openPosition.get_id());
			if(position == null) {
				throw new OpenPositionNotFoundException();
			}
			openPositionRepository.delete(openPosition);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}

	@RequestMapping(path="/createOrUpdateBartenderApplication", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createOrUpdateBartenderApplication(@RequestBody BartenderApplication application) {
		try {
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(application.get_id());
			
			if(bartenderApplication == null) {
				throw new BartenderApplicationNotFoundException();
			}
			return new ResponseEntity<BartenderApplication>(bartenderApplication, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteEntertainerApplicationById/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteEntertainerApplicationById(@PathVariable String _id)
	{
		try
		{
			EntertainerApplication entertainerApplication = entertainerApplicationRepository.findOne(_id);
			if(entertainerApplication == null) {
				throw new EntertainerApplicationNotFoundException();
			}
			entertainerApplicationRepository.delete(entertainerApplication);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}

	@RequestMapping(path="/createOrUpdateEntertainerApplication", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createOrUpdateEntertainerApplication(@RequestBody EntertainerApplication application) {
		try 
		{
			EntertainerApplication entertainerApplication = entertainerApplicationRepository.findOne(application.get_id());
			
			if (entertainerApplication == null) {
				entertainerApplicationRepository.insert(entertainerApplication);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			else
			{
				entertainerApplicationRepository.save(entertainerApplication);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/* Entertainer audition */
	@RequestMapping(path="/getAllEntertainerAuditions", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllEntertainerAuditions() {
		
		try
		{
			Iterable<EntertainerAudition> auditions = entertainerAuditionRepository.findAll();
			if (auditions == null) {
				throw new NoDataAvailableException();
			}
			
			return new ResponseEntity<Iterable<EntertainerAudition>>(auditions, HttpStatus.OK);
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/getEntertainerAuditionById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getEntertainerAuditionById(@RequestParam String _id) {
		
		try
		{
			EntertainerAudition audition = entertainerAuditionRepository.findOne(_id);
			if(audition == null)
			{
				throw new EntertainerAuditionNotFoundException();
			}
			return new ResponseEntity<EntertainerAudition>(audition, HttpStatus.OK);
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/deleteEntertainerAuditionById/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteEntertainerAuditionById(@PathVariable String _id)
	{
		try
		{
			BartenderApplication bartenderApplication = barTenderApplicationRepository.findOne(_id);
			if(bartenderApplication == null) {
				throw new BartenderApplicationNotFoundException();
			}
			barTenderApplicationRepository.delete(bartenderApplication);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/createOrupdateEntertainerAudition", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createOrUpdateEntertainerAudition(@RequestBody EntertainerAudition audition) {
		try 
		{
			EntertainerAudition entertainerAudition = entertainerAuditionRepository.findOne(audition.get_id());
			
			if (entertainerAudition == null) {
				entertainerAuditionRepository.insert(entertainerAudition);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			else
			{
				entertainerAuditionRepository.save(entertainerAudition);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	/* Staff member */
	@RequestMapping(path="/getAllStaffMembers", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllStaffMembers() {
		
		try
		{
			Iterable<StaffMember> staffmembers = staffMemberRepository.findAll();
			if (staffmembers == null) {
				throw new NoDataAvailableException();
			}
			
			return new ResponseEntity<Iterable<StaffMember>>(staffmembers, HttpStatus.OK);
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/getStaffMemberById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getStaffMemberById(@RequestParam String _id) {
		
		try
		{
			StaffMember staffMember = staffMemberRepository.findOne(_id);
			if(staffMember == null) {
				throw new StaffMemberNotFoundException();
			}
			return new ResponseEntity<StaffMember>(staffMember, HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
		
	}
	
	@RequestMapping(path="/deleteStaffMemberById/{_id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteStaffMemberById(@PathVariable String _id)
	{
		try
		{
			StaffMember staffMember = staffMemberRepository.findOne(_id);
			if(staffMember == null) {
				throw new StaffMemberNotFoundException();
			}
			staffMemberRepository.delete(staffMember);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/createOrUpdateStaffMember", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createOrUpdateStaffMember(@RequestBody StaffMember member) {
		try 
		{
			StaffMember staffMember = staffMemberRepository.findOne(member.get_id());
			
			if (staffMember == null) {
				staffMemberRepository.insert(staffMember);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			else
			{
				staffMemberRepository.save(staffMember);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@CrossOrigin(origins = "http://someOriginsURLs")
	@RequestMapping(value="/uploadApplicationImage")
	public ResponseEntity<?> uploadApplicationImage(@RequestParam("files") MultipartFile[] files) {
	
	String uploadDirectory = this.properties.getApplicationSaveDirectory();
	System.out.println(uploadDirectory);
	
	StringBuilder fileNames = new StringBuilder();
	
	for(MultipartFile file: files) {
	Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
	System.out.println(fileNameAndPath);
	
	fileNames.append(file.getOriginalFilename() + " ");
	try {
		Files.write(fileNameAndPath, file.getBytes());
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://someOriginsURLs")
	@RequestMapping(value="/uploadEmployeeImage")
	public ResponseEntity<?> uploadEmployeeImage(@RequestParam("files") MultipartFile[] files) {
	
		String uploadDirectory = this.properties.getEmployeeSaveDirectory();
		System.out.println(uploadDirectory);
	
		StringBuilder fileNames = new StringBuilder();
	
		for(MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			System.out.println(fileNameAndPath);
	
			fileNames.append(file.getOriginalFilename() + " ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://someOriginsURLs")
	@RequestMapping(value = "/getEmployeeImageJpeg", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getEmployeeImageJpeg(@RequestParam String imageName) throws IOException {
		String uploadDirectory = this.properties.getEmployeeSaveDirectory();
		System.out.println(uploadDirectory);
	
		Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
		byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
		String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
		return ResponseEntity
				.ok()
				.contentType(MediaType.IMAGE_JPEG)
				.body(bytes);
	}
	
	@CrossOrigin(origins = "http://someOriginsURLs")
	@RequestMapping(value = "/getEmployeeImageGif", method = RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
	public ResponseEntity<byte[]> getEmployeeImageGif(@RequestParam String imageName) throws IOException {
	String uploadDirectory = this.properties.getEmployeeSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
		.ok()
		.contentType(MediaType.IMAGE_GIF)
		.body(bytes);
	}
	
	@CrossOrigin(origins = "http://someOriginsURLs")
	@RequestMapping(value = "/getEmployeeImagePng", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> getEmployeeImagePng(@RequestParam String imageName) throws IOException {
	String uploadDirectory = this.properties.getEmployeeSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
		.ok()
		.contentType(MediaType.IMAGE_PNG)
		.body(bytes);
	}
	
	@CrossOrigin(origins = "http://someOriginsURLs")
	@RequestMapping(value = "/getApplicationImageJpeg", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getApplicationImageJpeg(@RequestParam String imageName) throws IOException {
	String uploadDirectory = this.properties.getEmployeeSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
		.ok()
		.contentType(MediaType.IMAGE_JPEG)
		.body(bytes);
	}
	
	@CrossOrigin(origins = "http://someOriginsURLs")
	@RequestMapping(value = "/getApplicationImageGif", method = RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
	public ResponseEntity<byte[]> getApplicationImageGif(@RequestParam String imageName) throws IOException {
	String uploadDirectory = this.properties.getEmployeeSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
	.ok()
	.contentType(MediaType.IMAGE_GIF)
	.body(bytes);
	}
	
	@CrossOrigin(origins = "http://someOriginsURLs")
	@RequestMapping(value = "/getApplicationImagePng", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> getApplicationImagePng(@RequestParam String imageName) throws IOException {
	String uploadDirectory = this.properties.getEmployeeSaveDirectory();
	System.out.println(uploadDirectory);
	
	Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
	byte[] bytes = Files.readAllBytes(fileNameAndPath);
	
	String fileExt = FilenameUtils.getExtension(fileNameAndPath.toString());
	
	return ResponseEntity
	.ok()
	.contentType(MediaType.IMAGE_PNG)
	.body(bytes);
	}

	@RequestMapping(value = "/removeEmployeeImage", method = RequestMethod.POST)
	public ResponseEntity<?> removeEmployeeImage(@RequestParam String imageName) throws IOException {
		String uploadDirectory = this.properties.getEmployeeSaveDirectory();
		System.out.println(uploadDirectory);
	
		Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
		Files.deleteIfExists(fileNameAndPath);
	
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/removeApplicationImage", method = RequestMethod.POST)
	public ResponseEntity<?> removeApplicationImage(@RequestParam String imageName) throws IOException {
		String uploadDirectory = this.properties.getEmployeeSaveDirectory();
		System.out.println(uploadDirectory);
	
		Path fileNameAndPath = Paths.get(uploadDirectory, imageName);
		Files.deleteIfExists(fileNameAndPath);
	
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
}
