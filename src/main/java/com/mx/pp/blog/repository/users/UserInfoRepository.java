package com.mx.pp.blog.repository.users;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.pp.blog.models.Users.UserInfoModel;

public interface UserInfoRepository extends JpaRepository<UserInfoModel, Long> {

}
