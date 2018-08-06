package kr.or.ddit.lprod.service;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVo;

import org.junit.Before;
import org.junit.Test;

public class LprodServiceTest {
	
	@Before
	public void setup() {
		
	}

	/**
	* Method : selectAllLprodTest
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 모든 상품분류 정보 조회
	*/
	@Test
	public void selectAllLprodTest() {
		/***Given***/
		LprodServiceInf lprodService = new LprodService();

		/***When***/
		List<LprodVo> lprodList = lprodService.selectAllLprod();
		
		/***Then***/
		assertEquals(11, lprodList.size());
		assertEquals("컴퓨터제품", lprodList.get(0).getLprod_nm());
		
	}
	
	/**
	* Method : getCntOfLprodTest
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 모든 상품분류의 총 갯수 조회
	*/
	@Test
	public void getCntOfLprodTest() {
		/***Given***/
		LprodServiceInf lprodService = new LprodService();

		/***When***/
		int cnt = lprodService.getCntOfLprod();
		
		/***Then***/
		assertEquals(11, cnt);
	}
	
	
	/**
	* Method : getPageLprodListTest
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 페이지처리된 상품분류 정보 조회
	*/
	@Test
	public void getPageLprodListTest() {
		/***Given***/
		LprodServiceInf lprodService = new LprodService();

		/***When***/
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("page", 1);
		map.put("pageSize", 5);
		
		Map<String, Object> lprodMap = lprodService.getPageLprodList(map);
		List<LprodVo> lprodList = (List<LprodVo>) lprodMap.get("pageList");
		
		/***Then***/
		assertEquals(5, lprodList.size());
		assertEquals("컴퓨터제품", lprodList.get(0).getLprod_nm());
	}
	
	
	
	

}
