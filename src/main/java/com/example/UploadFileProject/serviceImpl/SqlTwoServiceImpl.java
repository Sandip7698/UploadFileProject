package com.example.UploadFileProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.UploadFileProject.dao.SqlTwoDao;
import com.example.UploadFileProject.model.Response;
import com.example.UploadFileProject.model.SqlTwoModel;
import com.example.UploadFileProject.service.SqlTwoService;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

@Service
public class SqlTwoServiceImpl implements SqlTwoService {
	@Autowired
	private SqlTwoDao sqlTwoDao;

	@Override
	public Response<Object> uploadSqlTwoFile(MultipartFile multipartFile) throws Exception {
		List<SqlTwoModel> sqlTwoList = sqlTwoDao.findAll();
		CsvParserSettings csvParserSettings = new CsvParserSettings();
		csvParserSettings.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(csvParserSettings);
		List<Record> records = parser.parseAllRecords(multipartFile.getInputStream());
		records.forEach(record -> {
			SqlTwoModel sqlTwo = new SqlTwoModel();
			sqlTwo.setCount(record.getBigDecimal("count"));
			sqlTwo.setAccount(record.getString("account"));
			sqlTwo.setDatetime(record.getString("datetime"));
			sqlTwoList.add(sqlTwo);
			sqlTwoDao.saveAll(sqlTwoList);

		});
		return new Response<>(200, "CSV_FILE_SUCCESSFULLY_UPLOADED_TO_DATABASE");

	}

	@Override
	public Response<Object> readsqlTwoList() {
		List<SqlTwoModel> getSqlTwoList = sqlTwoDao.findAll();
		if (!getSqlTwoList.isEmpty()) {
			return new Response<>(200, "SUCCESS", getSqlTwoList);
		} else {
			return new Response<>(205, "DATA_NOT_FOUND");
		}
	}

}
