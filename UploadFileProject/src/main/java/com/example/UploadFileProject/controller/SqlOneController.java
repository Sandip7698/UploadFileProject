package com.example.UploadFileProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.UploadFileProject.model.Response;
import com.example.UploadFileProject.service.SqlOneService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SqlOneController {

	@Autowired
	private SqlOneService officeService;

	@ApiOperation(value = "API FOR UPLAOD FILE")
	@PostMapping("/file-upload")
	public Response<Object> uploadFile(@RequestParam("file") MultipartFile multipartFile) throws Exception {
		return officeService.uploadFile(multipartFile);
	}

	@ApiOperation(value = "API FOR GET LIST")
	@GetMapping("/full-list")
	public Response<Object> readList() {
		return officeService.readList();
	}
}
