package com.soda.soda.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soda.soda.model.PurchaseInfo;
import com.soda.soda.repository.PurchaseRepository;

@Service
public class SodaServiceImpl implements SodaService{
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	private static boolean isQuarterAvailable = false;
	//TODO need to get soda count from input values
	private static int sodaCount = 10;

	@Override
	public boolean insertQuarter() {
		isQuarterAvailable = true;
		return isQuarterAvailable;
	}

	@Override
	public boolean removeQuarter() {
		isQuarterAvailable = false;
		return isQuarterAvailable;
	}

	@Override
	public String pushButton() {
		if(sodaCount == 0)
			return "Out of Soda";
		if(sodaCount > 0 && isQuarterAvailable){
			PurchaseInfo info = new PurchaseInfo();
			info.setName("soda");//drink name
			info.setPrice(Math.random());
			info.setPurchasedDate(new Date());
			purchaseRepository.save(info);
			
			isQuarterAvailable = false;
			sodaCount--;
			return "Dispense Soda";
		}
		return "No Quarter. Please insert a quarter";
	}

	@Override
	public int currentInventoryCount() {
		return sodaCount;
	}

}
