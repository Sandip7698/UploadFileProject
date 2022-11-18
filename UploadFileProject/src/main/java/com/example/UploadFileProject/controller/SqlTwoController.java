package com.example.UploadFileProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.UploadFileProject.model.Response;
import com.example.UploadFileProject.service.SqlTwoService;

import io.swagger.annotations.ApiOperation;
@RestController
public class SqlTwoController {

	@Autowired
	private SqlTwoService sqlTwoService;
	
	@ApiOperation(value = "API FOR UPLAOD FILE")
	@PostMapping("/upload-sql2-file")
	public Response<Object> uploadSqlTwoFile(@RequestParam("fileTwo") MultipartFile multipartFile) throws Exception {
		return sqlTwoService.uploadSqlTwoFile(multipartFile);
	}

	@ApiOperation(value = "API FOR GET LIST")
	@GetMapping("/sql2-full-list")
	public Response<Object> readsqlTwoList() {
		return sqlTwoService.readsqlTwoList();
	}
}
