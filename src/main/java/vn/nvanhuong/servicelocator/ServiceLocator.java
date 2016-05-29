package vn.nvanhuong.servicelocator;

public class ServiceLocator {
	private static ServiceLocator instance;
	
	private ServiceLocator(){}
	
	public static synchronized ServiceLocator getInstance(){
		if(instance == null){
			return new ServiceLocator();
		}
		return instance;
	}

	public Object getService(String serviceName) {
		IntitialContext initialContext = new IntitialContext();
		return initialContext.lookup(serviceName);
	}

}
