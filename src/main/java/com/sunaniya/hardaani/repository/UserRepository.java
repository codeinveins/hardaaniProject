

package com.sunaniya.hardaani.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sunaniya.hardaani.bean.User;


public interface UserRepository extends JpaRepository<User, Integer>{


   public User saveAll(User u);
    
	
}
