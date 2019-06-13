package com.cds.katas.berlinclock.service;

public class BerlinClockServiceImpl implements BerlinClockService {

	private static final String EMPTY_STRING = "";
	private static final String INVALID_STRING = "XXXX";

	public String convertDigitalMinutesToBerlinSigleMinutes(String minutes) {
		try {
			if (validString(minutes)) {
				int min = Integer.valueOf(minutes);
				if (invalidSecondsOrMinutes(min)) {
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
				} else if (4 == remainder) {
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
			if (validString(minutes)) {
				int min = Integer.valueOf(minutes);
				if (invalidSecondsOrMinutes(min)) {
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

	public String convertDIgitalHoursToBerlinSingleHours(String hours) {
		try {
			if (validString(hours)) {
				int hour = Integer.valueOf(hours);
				if (invalidHour(hour)) {
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

	public String convertDIgitalHoursToBerlinFiveHours(String hours) {
		try {
			if (validString(hours)) {
				int hour = Integer.valueOf(hours);
				if (invalidHour(hour)) {
					return INVALID_STRING;
				}
				int quotient = Integer.divideUnsigned(hour, 5);
				String result = "OOOO";
				if (1 == quotient) {
					result = "ROOO";
				} else if (2 == quotient) {
					result = "RROO";
				} else if (3 == quotient) {
					result = "RRRO";
				} else if (4 == quotient) {
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

	public String convertDIgitalSecondsToBerlinSeconds(String seconds) {
		try {
			if (validString(seconds)) {
				int second = Integer.valueOf(seconds);
				if (invalidSecondsOrMinutes(second)) {
					return INVALID_STRING;
				}
				int remainder = Integer.remainderUnsigned(second, 2);
				String result = "Y";
				if (1 == remainder) {
					result = "O";
				}
				return result;
			} else {
				return INVALID_STRING;
			}
		} catch (Exception e) {
			return INVALID_STRING;
		}
	}

	public String convertDigitalTimeToBerlinTime(String time) {
		// 1. validate the string
		// 2. get the seconds
		// 3. get the five hours
		// 4. get the single hours
		// 5. get the five minutes
		// 6. get the single minutes

		String result = INVALID_STRING;
		if (!valid(time)) {
			return INVALID_STRING;
		}
		String hours = time.substring(0, 2);
		String minutes = time.substring(3, 5);
		String seconds = time.substring(6, 8);

		result = convertDIgitalSecondsToBerlinSeconds(seconds) + convertDIgitalHoursToBerlinFiveHours(hours)
				+ convertDIgitalHoursToBerlinSingleHours(hours) + convertDigitalMinutesToBerlinFiveMinutes(minutes)
				+ convertDigitalMinutesToBerlinSigleMinutes(minutes);

		if (result.contains("X")) {
			return INVALID_STRING;
		}

		return result;
	}

	private boolean valid(String time) {
		if (null == time || EMPTY_STRING.equalsIgnoreCase(time.trim()) || time.length() != 8) {
			return false;
		}
		return true;
	}
	
	private boolean invalidSecondsOrMinutes(int min) {
		return min >= 60;
	}
	
	private boolean validString(String seconds) {
		return null != seconds && !EMPTY_STRING.equalsIgnoreCase(seconds.trim());
	}
	
	private boolean invalidHour(int hour) {
		return hour >= 24;
	}
}
