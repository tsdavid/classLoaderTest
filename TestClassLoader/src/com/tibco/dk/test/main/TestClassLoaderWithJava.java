package com.tibco.dk.test.main;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;

public class TestClassLoaderWithJava {

	public static void main(String[] args) {
		
		
		try{
			String filePath = "..\\classLoaderTest\\DTO\\";
			String packageName = "com.tibco.dk.dto.SampleDTO";
			
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
			
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}
	}
}
