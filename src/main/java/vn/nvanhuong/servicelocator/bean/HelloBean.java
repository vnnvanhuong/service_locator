package vn.nvanhuong.servicelocator.bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import javax.faces.bean.ManagedBean;

import vn.nvanhuong.servicelocator.ServiceLocator;
import vn.nvanhuong.servicelocator.service.CountryService;

@ManagedBean(name = "helloBean")
public class HelloBean {
	private List<String> countries;
	
	public HelloBean() throws IOException {
		Properties prop = new Properties();
    	InputStream input = null;
    	
    	String filename = "services.properties";
		input = HelloBean.class.getClassLoader().getResourceAsStream(filename);

		prop.load(input);
		CountryService countryService = (CountryService) ServiceLocator.getInstance()
														.getService(prop.getProperty("country"));
        this.countries = countryService.getCountries();
		
	}

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	
}
