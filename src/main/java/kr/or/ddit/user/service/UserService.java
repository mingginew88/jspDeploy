package kr.or.ddit.user.service;

import kr.or.ddit.user.dao.UserDao;
import kr.or.ddit.user.dao.UserDaoInf;
import kr.or.ddit.user.model.UserVo;

/**
* UserService.java
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
public class UserService implements UserServiceInf {

	/**
	* Method : getUser
	* 최초작성일 : 2018. 7. 4.
	* 작성자 : PC17
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 상세조회
	*/
	@Override
	public UserVo getUser(String userId) {
		
		UserDaoInf userDao = new UserDao();
		return userDao.getUser(userId);
	}

}
