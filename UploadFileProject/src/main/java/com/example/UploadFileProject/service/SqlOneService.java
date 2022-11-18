package com.example.UploadFileProject.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.UploadFileProject.model.Response;

public interface SqlOneService {

	Response<Object> uploadFile(MultipartFile multipartFile) throws Exception;

	Response<Object> readList();

}
