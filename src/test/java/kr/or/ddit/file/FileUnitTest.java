package kr.or.ddit.file;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUnitTest {

	@Test
	public void fileUtiltest() {
		/***Given***/
		FileUtil fileUtil = new FileUtil();
		String contentDisposition = "form-data; name=\"uploadFile\"; filename=\"moon.png\"";
		/***When***/
		String fileNameValue = fileUtil.getFileName(contentDisposition);
		
		/***Then***/
		assertEquals("moon.png", fileNameValue);

	}
	

}
