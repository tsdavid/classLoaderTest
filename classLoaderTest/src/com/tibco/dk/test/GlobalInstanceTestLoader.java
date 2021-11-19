package com.tibco.dk.test;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;

public class GlobalInstanceTestLoader {
	
	public GlobalInstanceTestLoader() {
		
		this.init();
	}

	private void init(){
		
		ClassLoader bwClassLoader = Thread.currentThread().getContextClassLoader();
		
		try {
			Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			Thread.currentThread().setContextClassLoader(bwClassLoader);
			
		}
		
	}
	
	
	public void instatiateDTO_Class(String filePath, String packageName){
		
		ClassLoader bwClassLoader = Thread.currentThread().getContextClassLoader();
		
		try {
			Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
			
			File file = new File(filePath);
			
			for(String f : file.list()){
				System.out.println(f);
			}
			
			// Convert the file to URL Format
			URL url = file.toURI().toURL();
			URL[] urls = new URL[]{url};
			
			// Load this folder into Class Loader.
			ClassLoader cl = new URLClassLoader(urls);
			
			// Load the Address class in file.
			Class<?> clazz = cl.loadClass(packageName);
			
			for(Field field : clazz.getDeclaredFields()){
				System.out.println(field.getName());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			e.printStackTrace();
			
		}finally{
			Thread.currentThread().setContextClassLoader(bwClassLoader);
			
		}
	}
}
