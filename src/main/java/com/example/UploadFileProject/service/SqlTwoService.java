package com.example.UploadFileProject.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.UploadFileProject.model.Response;

public interface SqlTwoService {

	Response<Object> uploadSqlTwoFile(MultipartFile multipartFile) throws Exception;

	Response<Object> readsqlTwoList();

}
