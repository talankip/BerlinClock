package com.cds.katas.berlinclock.service;

public interface BerlinClockService {

	public String convertDigitalMinutesToBerlinSigleMinutes(String minutes);

	public String convertDigitalMinutesToBerlinFiveMinutes(String minutes);

	public String convertDIgitalHoursToBerlinSingleHours(String hours);

	public String convertDIgitalHoursToBerlinFiveHours(String hours);

	public String convertDIgitalSecondsToBerlinSeconds(String seconds);

	public String convertDigitalTimeToBerlinTime(String time);

}
