package net.gloomshroud.runevegr.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.gloomshroud.runevegr.References;


public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null){
			logger = LogManager.getFormatterLogger(References.MOD_ID);
		}
		
		return logger;
	}
	
}
