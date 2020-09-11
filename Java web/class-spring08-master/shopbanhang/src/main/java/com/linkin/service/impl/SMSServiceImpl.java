package com.linkin.service.impl;

import java.io.IOException;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.linkin.model.SMSDTO;
import com.linkin.service.SMSService;

@Service
public class SMSServiceImpl implements SMSService {

	@Async
	public void sendSMS(SMSDTO smsdto) {
		try {
			SpeedSMSAPI api  = new SpeedSMSAPI("QmTvDersccmRmHZmbbI97BMRizea2_tQ1");
			String response = api.sendSMS(smsdto.getCustomerPhone(), smsdto.getContent(), 2, "EGO VIETNAM");
			System.out.println(response);
		} catch (IOException e) {
			System.err.println("SEND SMS error");
		}
	}

}
