package vn.nvanhuong.servicelocator.service.impl;

import java.util.ArrayList;
import java.util.List;

import vn.nvanhuong.servicelocator.service.CountryService;

public class CountryService4 implements CountryService{

	public List<String> getCountries() {
		List<String> result = new ArrayList<String>();
		result.add("country 1");
		result.add("country 2");
		result.add("country 3");
		return result;
	}

}
