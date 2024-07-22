package com.mx.pp.blog.repository.users;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.pp.blog.models.Users.UserImageModel;

public interface UserImageRepository extends JpaRepository<UserImageModel, Long> {

}
