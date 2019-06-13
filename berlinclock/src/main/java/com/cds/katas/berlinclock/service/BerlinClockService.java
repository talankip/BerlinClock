package com.cds.katas.berlinclock.service;

public interface BerlinClockService {

	public String convertDigitalMinutesToBerlinSigleMinutes(String minutes);

	public String convertDigitalMinutesToBerlinFiveMinutes(String minutes);

	public String ConvertDIgitalHoursToBerlinSingleHours(String hours);

	public String ConvertDIgitalHoursToBerlinFiveHours(String hours);

	public String ConvertDIgitalSecondsToBerlinSeconds(String seconds);

}
