package com.cds.katas.berlinclock.service;

public class BerlinClockServiceImpl implements BerlinClockService {

	private static final String EMPTY_STRING = "";
	private static final String INVALID_STRING = "XXXX";

	public String convertDigitalMinutesToBerlinSigleMinutes(String minutes) {
		try {
			if (null != minutes && !EMPTY_STRING.equalsIgnoreCase(minutes.trim())) {
				int min = Integer.valueOf(minutes);
				if (min >= 60) {
					return INVALID_STRING;
				}
				int remainder = Integer.remainderUnsigned(min, 5);
				if (0 == remainder) {
					return "OOOO";
				} else if (1 == remainder) {
					return "YOOO";
				} else if (2 == remainder) {
					return "YYOO";
				} else if (3 == remainder) {
					return "YYYO";
				}
				return "YYYY";
			} else {
				return INVALID_STRING;
			}
		} catch (Exception e) {
			return INVALID_STRING;
		}
	}
}
