package vn.nvanhuong.servicelocator.service.impl;

import java.util.ArrayList;
import java.util.List;

import vn.nvanhuong.servicelocator.service.CountryService;

public class CountryService1 implements CountryService{

	public List<String> getCountries() {
		List<String> result = new ArrayList<String>();
		result.add("Vietname");
		result.add("Switzerland");
		result.add("Japan");
		return result;
	}

}
