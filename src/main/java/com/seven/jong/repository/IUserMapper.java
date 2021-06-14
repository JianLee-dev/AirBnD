package com.seven.jong.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.seven.jong.DTO.UserReponseDTO;
import com.seven.jong.DTO.UserRequestDTO;
import com.seven.jong.VO.UserVO;


public interface IUserMapper {

    void addUser(UserVO user);
    
    //모든 유저 수
    int selectUserCount();
    
    //모든 유저 정보
    ArrayList<UserVO> userInfo();
    
    //요청 페이지 유저 정보 리스트
    public ArrayList<UserReponseDTO> pageUserInfo(@Param("s") int start,@Param("e") int end);
    
    //요청 유저 정보
    UserReponseDTO info(int userId);

    //userId에 해당하는 유저 정보 update
	void updateUserInfo(@Param("userId")int userId, @Param("name")String name, @Param("birth")String birth, @Param("phone")int phone );

	
}
