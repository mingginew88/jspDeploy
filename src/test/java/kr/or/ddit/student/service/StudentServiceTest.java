package kr.or.ddit.student.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.student.model.StudentVo;

import org.junit.Before;
import org.junit.Test;

public class StudentServiceTest {
	
	StudentServiceInf studentService;
	
	@Before
	public void setup() {
		studentService = new StudentService();
	}
		

	/**
	* Method : selectAllStudentsTest
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 전체 학생 정보를 조회한다.
	*/
	@Test
	public void selectAllStudentsTest() {
		/***Given***/

		/***When***/
		List<StudentVo> studentList = studentService.selectAllStudents();
		
		/***Then***/
		for (StudentVo studentVo : studentList) {
			System.out.print(studentVo.getId() + " ");
			System.out.println(studentVo.getName());			
		}
		assertEquals(25, studentList.size());
	}
	
	
	/**
	* Method : getStudentTest
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 학생 정보 조회
	*/
	@Test
	public void getStudentTest() {
		/***Given***/
		int id = 1;

		/***When***/
		StudentVo studentVo = studentService.getStudent(id);

		/***Then***/
		assertEquals("김마음", studentVo.getName());
	}
	
	
	/**
	* Method : getStudent2Test
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 학생 정보 조회
	*/
	@Test
	public void getStudent2Test() {
		/***Given***/
		StudentVo studentVo = new StudentVo();
		studentVo.setId(1);

		/***When***/
		StudentVo student = studentService.getStudent2(studentVo);

		/***Then***/
		assertEquals("김마음", student.getName());
	}
	
	
	/**
	* Method : getStudentList
	* 최초작성일 : 2018. 7. 10.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 학생 페이지 리스트 조회 테스트
	*/
	@Test
	public void getStudentList() {
		/***Given***/
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("page", 1);
		map.put("pageSize", 10);

		/***When***/
		Map<String, Object> resultMap = studentService.getStudentList(map);		
		
		//학생 페이지 리스트
		List<StudentVo> pageList = (List<StudentVo>) resultMap.get("pageList");
		
		//학생 전체 건수
		int totCnt = (int) resultMap.get("totCnt");
		
		/***Then***/	
		assertEquals(10, pageList.size());		//학생 페이지 리스트 건수에 대한 검증
		assertEquals(25, totCnt);				//학생 전체 건수에 대한 검증
	}
	
	
	/**
	* Method : calculatePageNavi
	* 최초작성일 : 2018. 7. 11.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 전체 건수를 인자로 페이지 네비게이션 사이즈를 구하는 테스트
	*/
	@Test
	public void calculatePageNavi() {
		/***Given***/
		int totCnt = 25;
		int pageSize = 10;
		
		int cnt = totCnt / pageSize;	//몫
		int mod = totCnt % pageSize;	//나머지
		if(mod > 0) 
			cnt++;
		
		/***When***/
		System.out.println((int)Math.ceil((double)totCnt/pageSize));
		
		/***Then***/
		assertEquals(3, cnt);
		assertEquals(3, (int)Math.ceil((double)totCnt/pageSize));
	}
	
	
	/**
	* Method : studentUpdate
	* 최초작성일 : 2018. 7. 17.
	* 작성자 : PC17
	* 변경이력 :
	* Method 설명 : 학생정보 업데이트
	*/
	@Test
	public void studentUpdate() {
		/***Given***/
		StudentVo studentVo = new StudentVo();
		studentVo.setId(2);
		studentVo.setName("강병관");
		studentVo.setAddr1("대전광역시 중구 중앙로 76");
		studentVo.setAddr2("영민빌딩 2층 대덕인재개발원");
		studentVo.setZipcd("34940");
		studentVo.setPic("moon.png");
		studentVo.setPicpath("D:\\A_TeachingMaterial\\7.JspSrpgin\\fileUpload");
		studentVo.setPicname("04f86c08-e713-4403-a1b7-d3c6102fe22d");		

		/***When***/
		int updateCnt = studentService.studentUpdate(studentVo);

		/***Then***/
		assertEquals(1, updateCnt);
	}
	
	
	
	
	
	

}
