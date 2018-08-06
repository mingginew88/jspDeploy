package kr.or.ddit.cookie.util;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

//테스트코드를 먼저 만들고, 

public class CookieUtilTest {
	
	private String cookie;
	
	@Before
	public void setup() {
		cookie = "userId=brown; rememberMe=y; chekYn=n";
	}
	
	
	/**
	* Method : cookieSplitTest
	* 최초작성일 : 2018. 7. 6.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 쿠키 전체 값에 대한 분리 작업 확인
	*/
	@Test
	public void cookieSplitTest() {
		/***Given***/
		String[] cookies = cookie.split("; ");

		/***When***/

		/***Then***/
		assertEquals(3, cookies.length);
		assertEquals("userId=brown", cookies[0]);
		assertEquals("rememberMe=y", cookies[1]);
		assertEquals("chekYn=n", cookies[2]);
		
		assertEquals("brown", cookies[0].substring(cookies[0].indexOf("=")+1));
		assertEquals("y", cookies[1].substring(cookies[1].indexOf("=")+1));
		assertEquals("n", cookies[2].substring(cookies[2].indexOf("=")+1));
		
		assertEquals("brown", cookies[0].split("=")[1]);
		assertEquals("y", cookies[1].split("=")[1]);
		assertEquals("n", cookies[2].split("=")[1]);
	}
	
	
	@Test
	public void cookieNameValueSplitTest() {
		/***Given***/
		String cookie = "userId=brown";

		/***When***/
		String[] cookieArr = cookie.split("=");

		/***Then***/
		assertEquals("userId",cookieArr[0]);
		assertEquals("brown",cookieArr[1]);

	}
	
	
	
	
	
	

	/**
	* Method : getCookieTest
	* 최초작성일 : 2018. 7. 6.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 
	*/
	@Test
	public void getCookieTest() {
		
		/***Given***/
		CookieUtil cookieUtil = new CookieUtil();

		/***When***/
		//userId = brown
		String cookieValue = cookieUtil.getCookie(cookie, "userId");
		String cookieValue2 = cookieUtil.getCookie(cookie, "rememberMe");

		/***Then***/
		assertEquals("brown", cookieValue);
		assertEquals("y", cookieValue2);
	}
	
	
	

}
