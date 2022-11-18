package com.example.UploadFileProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.UploadFileProject.dao.SqlOneDao;
import com.example.UploadFileProject.model.SqlOne;
import com.example.UploadFileProject.model.Response;
import com.example.UploadFileProject.service.SqlOneService;
import com.fasterxml.jackson.core.JsonParser;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

@Service
public class SqlOneServiceImpl implements SqlOneService {

	@Autowired
	private SqlOneDao sqlOneDao;

	@Override
	public Response<Object> uploadFile(MultipartFile multipartFile) throws Exception {
		List<SqlOne> csvList = sqlOneDao.findAll();
		CsvParserSettings csvParserSettings = new CsvParserSettings();
		csvParserSettings.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(csvParserSettings);
		List<Record> records = parser.parseAllRecords(multipartFile.getInputStream());
		records.forEach(record -> {
			SqlOne sqlOne = new SqlOne();
			sqlOne.setAmount(record.getBigDecimal("amount"));
			sqlOne.setCoinType(record.getString("coinType"));
			sqlOne.setTrnxAmt(record.getBigDecimal("trnxAmt"));
			sqlOne.setTxncode(record.getString("txncode"));
			sqlOne.setDrcr(record.getString("drcr"));
			sqlOne.setAccount(record.getString("account"));
			sqlOne.setNarration(record.getString("narration"));
			sqlOne.setInfo(record.getString("info"));
			sqlOne.setProductCode(record.getString("productCode"));
			sqlOne.setStatus(record.getString("status"));
			sqlOne.setComments(record.getString("comments"));
			sqlOne.setDatetime(record.getString("datetime"));
			csvList.add(sqlOne);
			sqlOneDao.saveAll(csvList);
		});
		return new Response<>(200, "CSV_FILE_SUCCESSFULLY_UPLOADED_TO_DATABASE");

	}

	@Override
	public Response<Object> readList() {
		List<SqlOne> list = sqlOneDao.findAll();
		if (!list.isEmpty()) {
			return new Response<>(200, "SUCCESS", list);
		} else {
			return new Response<>(205, "DATA_NOT_FOUND");
		}

	}
}
