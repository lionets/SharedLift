package cn.com.sharedLift.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.sharedLift.dao.AccountInfoDao;
import cn.com.sharedLift.service.IAccountRegisterService;

@Service
public class AccountRegisterServiceImpl implements IAccountRegisterService{
	
	@Autowired
	private AccountInfoDao accountDao;

	@Override
	public void createAccountInfo(Map accountInfo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
