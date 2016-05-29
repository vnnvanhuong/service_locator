package vn.nvanhuong.servicelocator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class IntitialContext {
	
	public Object lookup(String serviceName){
				
		if(serviceName != null){
			try {
				Class<?> clazz = Class.forName(serviceName);
				Constructor<?> ctor = clazz.getConstructor();
				Object object = ctor.newInstance();
				return object;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
