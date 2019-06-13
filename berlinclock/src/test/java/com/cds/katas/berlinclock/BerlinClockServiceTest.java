package com.cds.katas.berlinclock;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cds.katas.berlinclock.service.BerlinClockService;
import com.cds.katas.berlinclock.service.BerlinClockServiceImpl;

public class BerlinClockServiceTest {

	private BerlinClockService service;

	@Before
	public void setUp() throws Exception {
		service = new BerlinClockServiceImpl();
	}

	@Test
	public void testConvertDigitalMinutesToBerlinSigleMinutesForAllOff() {
		assertEquals("OOOO", service.convertDigitalMinutesToBerlinSigleMinutes("00"));
		assertEquals("OOOO", service.convertDigitalMinutesToBerlinSigleMinutes("35"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinSigleMinutesForAllYellow() {
		assertEquals("YYYY", service.convertDigitalMinutesToBerlinSigleMinutes("59"));
		assertEquals("YYYY", service.convertDigitalMinutesToBerlinSigleMinutes("34"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinSigleMinutesForOneYellow() {
		assertEquals("YOOO", service.convertDigitalMinutesToBerlinSigleMinutes("41"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinSigleMinutesForTwoYellows() {
		assertEquals("YYOO", service.convertDigitalMinutesToBerlinSigleMinutes("32"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinSigleMinutesForThreeYellows() {
		assertEquals("YYYO", service.convertDigitalMinutesToBerlinSigleMinutes("23"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinSigleMinutesForAllInvalids() {
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("ab"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("60"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("61"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes(""));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes(null));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesAllOff() {
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("00"));
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("01"));
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("02"));
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("03"));
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("04"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithOneQuotient() {
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("05"));
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("06"));
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("07"));
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("08"));
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("09"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithTwoQuotient() {
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("10"));
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("11"));
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("12"));
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("13"));
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("14"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithThreeQuotient() {
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("15"));
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("16"));
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("17"));
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("18"));
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("19"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithFourQuotient() {
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("20"));
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("21"));
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("22"));
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("23"));
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("24"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithFiveQuotient() {
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("25"));
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("26"));
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("27"));
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("28"));
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("29"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithSixQuotient() {
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("30"));
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("31"));
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("32"));
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("33"));
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("34"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithSevenQuotient() {
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("35"));
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("36"));
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("37"));
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("38"));
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("39"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithEightQuotient() {
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("40"));
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("41"));
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("42"));
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("43"));
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("44"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithNineQuotient() {
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("45"));
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("46"));
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("47"));
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("48"));
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("49"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithTenQuotient() {
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("50"));
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("51"));
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("52"));
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("53"));
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("54"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesWithElevenQuotient() {
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("55"));
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("56"));
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("57"));
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("58"));
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("59"));
	}

	@Test
	public void testConvertDigitalMinutesToBerlinFiveMinutesForAllInvalids() {
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes("ab"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes("60"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes("61"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes(""));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes(null));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinSingleHoursAllOffs() {
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinSingleHours("00"));
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinSingleHours("05"));
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinSingleHours("10"));
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinSingleHours("15"));
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinSingleHours("20"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinSingleHoursOneRed() {
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinSingleHours("01"));
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinSingleHours("06"));
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinSingleHours("11"));
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinSingleHours("16"));
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinSingleHours("21"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinSingleHoursTwoReds() {
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinSingleHours("02"));
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinSingleHours("07"));
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinSingleHours("12"));
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinSingleHours("17"));
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinSingleHours("22"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinSingleHoursThreeReds() {
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinSingleHours("03"));
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinSingleHours("08"));
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinSingleHours("13"));
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinSingleHours("18"));
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinSingleHours("23"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinSingleHoursFourReds() {
		assertEquals("RRRR", service.ConvertDIgitalHoursToBerlinSingleHours("04"));
		assertEquals("RRRR", service.ConvertDIgitalHoursToBerlinSingleHours("09"));
		assertEquals("RRRR", service.ConvertDIgitalHoursToBerlinSingleHours("14"));
		assertEquals("RRRR", service.ConvertDIgitalHoursToBerlinSingleHours("19"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinSingleHoursInvalids() {
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinSingleHours("24"));
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinSingleHours("25"));
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinSingleHours("sfsd"));
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinSingleHours(""));
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinSingleHours(null));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinFiveHoursAllOffs() {
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinFiveHours("00"));
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinFiveHours("01"));
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinFiveHours("02"));
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinFiveHours("03"));
		assertEquals("OOOO", service.ConvertDIgitalHoursToBerlinFiveHours("04"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinFiveHoursOneRed() {
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinFiveHours("05"));
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinFiveHours("06"));
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinFiveHours("07"));
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinFiveHours("08"));
		assertEquals("ROOO", service.ConvertDIgitalHoursToBerlinFiveHours("09"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinFiveHoursTwoReds() {
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinFiveHours("10"));
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinFiveHours("11"));
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinFiveHours("12"));
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinFiveHours("13"));
		assertEquals("RROO", service.ConvertDIgitalHoursToBerlinFiveHours("14"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinFiveHoursThreeReds() {
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinFiveHours("15"));
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinFiveHours("16"));
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinFiveHours("17"));
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinFiveHours("18"));
		assertEquals("RRRO", service.ConvertDIgitalHoursToBerlinFiveHours("19"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinFiveHoursFourReds() {
		assertEquals("RRRR", service.ConvertDIgitalHoursToBerlinFiveHours("20"));
		assertEquals("RRRR", service.ConvertDIgitalHoursToBerlinFiveHours("21"));
		assertEquals("RRRR", service.ConvertDIgitalHoursToBerlinFiveHours("22"));
		assertEquals("RRRR", service.ConvertDIgitalHoursToBerlinFiveHours("23"));
	}
	
	@Test
	public void testConvertDIgitalHoursToBerlinFiveHoursInvalids() {
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinFiveHours("24"));
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinFiveHours("25"));
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinFiveHours("sfsd"));
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinFiveHours(""));
		assertEquals("XXXX", service.ConvertDIgitalHoursToBerlinFiveHours(null));
	}
	
}
