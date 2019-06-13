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
				String result = "OOOO";
				if (1 == remainder) {
					result = "YOOO";
				} else if (2 == remainder) {
					result = "YYOO";
				} else if (3 == remainder) {
					result = "YYYO";
				}else if (4 == remainder) {
					result = "YYYY";
				}
				return result;
			} else {
				return INVALID_STRING;
			}
		} catch (Exception e) {
			return INVALID_STRING;
		}
	}

	public String convertDigitalMinutesToBerlinFiveMinutes(String minutes) {
		try {
			if (null != minutes && !EMPTY_STRING.equalsIgnoreCase(minutes.trim())) {
				int min = Integer.valueOf(minutes);
				if (min >= 60) {
					return INVALID_STRING;
				}
				int quotient = Integer.divideUnsigned(min, 5);
				String result = "OOOOOOOOOOO";
				if (1 == quotient) {
					result = "YOOOOOOOOOO";
				} else if (2 == quotient) {
					result = "YYOOOOOOOOO";
				} else if (3 == quotient) {
					result = "YYROOOOOOOO";
				} else if (4 == quotient) {
					result = "YYRYOOOOOOO";
				} else if (5 == quotient) {
					result = "YYRYYOOOOOO";
				} else if (6 == quotient) {
					result = "YYRYYROOOOO";
				} else if (7 == quotient) {
					result = "YYRYYRYOOOO";
				} else if (8 == quotient) {
					result = "YYRYYRYYOOO";
				} else if (9 == quotient) {
					result = "YYRYYRYYROO";
				} else if (10 == quotient) {
					result = "YYRYYRYYRYO";
				} else if (11 == quotient) {
					result = "YYRYYRYYRYY";
				} 
				return result;
			} else {
				return INVALID_STRING;
			}
		} catch (Exception e) {
			return INVALID_STRING;
		}
	}

	public String ConvertDIgitalHoursToBerlinSingleHours(String hours) {
		try {
			if (null != hours && !EMPTY_STRING.equalsIgnoreCase(hours.trim())) {
				int hour = Integer.valueOf(hours);
				if (hour >= 24) {
					return INVALID_STRING;
				}
				int remainder = Integer.remainderUnsigned(hour, 5);
				String result = "OOOO";
				if (1 == remainder) {
					result = "ROOO";
				} else if (2 == remainder) {
					result = "RROO";
				} else if (3 == remainder) {
					result = "RRRO";
				} else if (4 == remainder) {
					result = "RRRR";
				} 
				return result;
			} else {
				return INVALID_STRING;
			}
		} catch (Exception e) {
			return INVALID_STRING;
		}
	}
}
