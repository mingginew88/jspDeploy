package kr.or.ddit.lprod.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import kr.or.ddit.lprod.model.LprodVo;

import org.junit.Test;

public class LprodDaoTest {

	@Test
	public void Lprodtest() {
		/***Given***/
		LprodDaoInf lprodDao = new LprodDao();

		/***When***/
		List<LprodVo> lprodList = lprodDao.selectAllLprod();		

		/***Then***/
		for (LprodVo lprodVo : lprodList) {
			System.out.println(lprodVo.getLprod_nm() + "\t" + lprodVo.getLprod_gu() + "\t" + lprodVo.getLprod_nm());
		}
		assertEquals(11, lprodList.size());
	}

}
