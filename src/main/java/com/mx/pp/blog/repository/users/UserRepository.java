package com.mx.pp.blog.repository.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mx.pp.blog.models.Users.UsersModel;
import com.mx.pp.blog.services.users.dto.UserAllInfoDTO;
import com.mx.pp.blog.services.users.dto.UserTestDTO;

public interface UserRepository extends JpaRepository<UsersModel, Long>{
	
	/**
	 * Test 
	 * @return
	 */
    @Query("SELECT new com.mx.pp.blog.services.users.dto.UserTestDTO(name, password, email) "
    		+ "from UsersModel")
     List<UserTestDTO> findUsersDetails();
    
    /**
     * We get a user with all info
     * @param id
     * @return
     */
    @Query("select new com.mx.pp.blog.services.users.dto.UserAllInfoDTO(u.name, u.password, u.email, ui.age, ui.gender, ui.city, ui.country, ui.biography, ui.website, ui.phone) "
    	       + "from com.mx.pp.blog.models.Users.UsersModel u "
    	       + "inner join com.mx.pp.blog.models.Users.UserInfoModel ui on (u.id = ui.id) "
    	       + "where u.id = :id")
    UserAllInfoDTO findUserAllInfo(@Param("id") Long id);
    
    
}
