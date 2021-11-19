package com.tibco.dk.test;

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
		
	}
}
