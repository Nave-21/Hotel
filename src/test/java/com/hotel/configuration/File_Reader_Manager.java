package com.hotel.configuration;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {		
	
	}
	
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager manager = new File_Reader_Manager();
		return manager;
	}
	
	public ConfigReader getConfigReader() throws Throwable {
		ConfigReader reader = new ConfigReader();
		return reader;
	}
	

}
