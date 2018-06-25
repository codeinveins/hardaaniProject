package com.sunaniya.hardaani.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunaniya.hardaani.bean.LotteryList;
import com.sunaniya.hardaani.bean.User;
import com.sunaniya.hardaani.repository.UserRepository;
import com.sunaniya.hardaani.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	
	@Override
	public User saveAll(User userdetails) {
	

		 User user= new User();
		 /* List<LotteryList> lotteryLists = new ArrayList();
		// Iterator< User> iterator = (User)userdetails.iterator();
 		 while (userdetails.hasNext) {
			 User user1 = (User) userdetails.next();
			 
			 user1.setUserAdress(userdetails.getUserAdress());
			 user1.setUserEmail(userdetails.getUserEmail());
			 user1.setUserName(userdetails.getUserName());
			
			 LotteryList lotteryList = new LotteryList();
			 lotteryList.setS1("52645378");
			 lotteryList.setS2("dcbdhb");
			 lotteryLists.add(lotteryList);
			 
			 user1.setLoteryList(lotteryLists);*/
			 
	/*	}
			boolean savedUserRecord= false;
			try {*/
		return	user = userRepository.saveAll(userdetails);
				/*savedUserRecord = true;
			}
			catch (Exception e) {
				e.printStackTrace();
			}

*/			/*return savedUserRecord;*/
	}
}
	
	