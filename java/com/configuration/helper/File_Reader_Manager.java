package com.configuration.helper;

public class File_Reader_Manager {

	//SDP

	
	public Configuration_Reader get_Instance_CR() throws Throwable {

		Configuration_Reader reader = new Configuration_Reader();

		return reader;

	}

	public static  File_Reader_Manager get_Instance_FRM() {

		File_Reader_Manager helper = new File_Reader_Manager();

		return helper;

	}

	private File_Reader_Manager() {

	}

	


}
