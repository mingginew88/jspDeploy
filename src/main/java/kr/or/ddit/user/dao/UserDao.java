package kr.or.ddit.user.dao;

import kr.or.ddit.user.model.UserVo;

/**
* UserDao.java
*
* @author PC17
* @since 2018. 7. 4.
* @version 1.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정일 수정자 수정내용
* ---------- ------ ------------------------
* 2018. 7. 4. PC17 최초 생성
*
* </pre>
*/
public class UserDao implements UserDaoInf {

	/**
	* Method : getUser
	* 최초작성일 : 2018. 7. 4.
	* 작성자 : PC17
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 상세조회(fake)
	*/
	@Override
	public UserVo getUser(String userId) {
		//원래대로라면 : orm, jdbc 등을 이용하여 db를 통해 조회한 결과를 반환
		//servlet 테스트 목적으로 임의의 고정된 값을 반환
		UserVo userVo = new UserVo();
		userVo.setUserId("brown");
		userVo.setPassword("1234");
		
		return userVo;
	}

}
