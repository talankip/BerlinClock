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
	public void testconvertDigitalMinutesToBerlinSigleMinutesForAllOff() {
		assertEquals("OOOO", service.convertDigitalMinutesToBerlinSigleMinutes("00"));
		assertEquals("OOOO", service.convertDigitalMinutesToBerlinSigleMinutes("35"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinSigleMinutesForAllYellow() {
		assertEquals("YYYY", service.convertDigitalMinutesToBerlinSigleMinutes("59"));
		assertEquals("YYYY", service.convertDigitalMinutesToBerlinSigleMinutes("34"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinSigleMinutesForOneYellow() {
		assertEquals("YOOO", service.convertDigitalMinutesToBerlinSigleMinutes("41"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinSigleMinutesForTwoYellows() {
		assertEquals("YYOO", service.convertDigitalMinutesToBerlinSigleMinutes("32"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinSigleMinutesForThreeYellows() {
		assertEquals("YYYO", service.convertDigitalMinutesToBerlinSigleMinutes("23"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinSigleMinutesForAllInvalids() {
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("ab"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("60"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("61"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes(""));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes(null));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesAllOff() {
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("00"));
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("01"));
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("02"));
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("03"));
		assertEquals("OOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("04"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithOneQuotient() {
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("05"));
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("06"));
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("07"));
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("08"));
		assertEquals("YOOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("09"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithTwoQuotient() {
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("10"));
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("11"));
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("12"));
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("13"));
		assertEquals("YYOOOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("14"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithThreeQuotient() {
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("15"));
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("16"));
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("17"));
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("18"));
		assertEquals("YYROOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("19"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithFourQuotient() {
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("20"));
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("21"));
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("22"));
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("23"));
		assertEquals("YYRYOOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("24"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithFiveQuotient() {
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("25"));
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("26"));
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("27"));
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("28"));
		assertEquals("YYRYYOOOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("29"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithSixQuotient() {
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("30"));
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("31"));
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("32"));
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("33"));
		assertEquals("YYRYYROOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("34"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithSevenQuotient() {
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("35"));
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("36"));
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("37"));
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("38"));
		assertEquals("YYRYYRYOOOO", service.convertDigitalMinutesToBerlinFiveMinutes("39"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithEightQuotient() {
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("40"));
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("41"));
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("42"));
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("43"));
		assertEquals("YYRYYRYYOOO", service.convertDigitalMinutesToBerlinFiveMinutes("44"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithNineQuotient() {
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("45"));
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("46"));
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("47"));
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("48"));
		assertEquals("YYRYYRYYROO", service.convertDigitalMinutesToBerlinFiveMinutes("49"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithTenQuotient() {
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("50"));
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("51"));
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("52"));
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("53"));
		assertEquals("YYRYYRYYRYO", service.convertDigitalMinutesToBerlinFiveMinutes("54"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesWithElevenQuotient() {
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("55"));
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("56"));
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("57"));
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("58"));
		assertEquals("YYRYYRYYRYY", service.convertDigitalMinutesToBerlinFiveMinutes("59"));
	}

	@Test
	public void testconvertDigitalMinutesToBerlinFiveMinutesForAllInvalids() {
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes("ab"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes("60"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes("61"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes(""));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinFiveMinutes(null));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinSingleHoursAllOffs() {
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinSingleHours("00"));
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinSingleHours("05"));
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinSingleHours("10"));
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinSingleHours("15"));
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinSingleHours("20"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinSingleHoursOneRed() {
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinSingleHours("01"));
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinSingleHours("06"));
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinSingleHours("11"));
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinSingleHours("16"));
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinSingleHours("21"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinSingleHoursTwoReds() {
		assertEquals("RROO", service.convertDIgitalHoursToBerlinSingleHours("02"));
		assertEquals("RROO", service.convertDIgitalHoursToBerlinSingleHours("07"));
		assertEquals("RROO", service.convertDIgitalHoursToBerlinSingleHours("12"));
		assertEquals("RROO", service.convertDIgitalHoursToBerlinSingleHours("17"));
		assertEquals("RROO", service.convertDIgitalHoursToBerlinSingleHours("22"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinSingleHoursThreeReds() {
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinSingleHours("03"));
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinSingleHours("08"));
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinSingleHours("13"));
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinSingleHours("18"));
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinSingleHours("23"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinSingleHoursFourReds() {
		assertEquals("RRRR", service.convertDIgitalHoursToBerlinSingleHours("04"));
		assertEquals("RRRR", service.convertDIgitalHoursToBerlinSingleHours("09"));
		assertEquals("RRRR", service.convertDIgitalHoursToBerlinSingleHours("14"));
		assertEquals("RRRR", service.convertDIgitalHoursToBerlinSingleHours("19"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinSingleHoursInvalids() {
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinSingleHours("24"));
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinSingleHours("25"));
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinSingleHours("sfsd"));
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinSingleHours(""));
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinSingleHours(null));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinFiveHoursAllOffs() {
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinFiveHours("00"));
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinFiveHours("01"));
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinFiveHours("02"));
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinFiveHours("03"));
		assertEquals("OOOO", service.convertDIgitalHoursToBerlinFiveHours("04"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinFiveHoursOneRed() {
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinFiveHours("05"));
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinFiveHours("06"));
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinFiveHours("07"));
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinFiveHours("08"));
		assertEquals("ROOO", service.convertDIgitalHoursToBerlinFiveHours("09"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinFiveHoursTwoReds() {
		assertEquals("RROO", service.convertDIgitalHoursToBerlinFiveHours("10"));
		assertEquals("RROO", service.convertDIgitalHoursToBerlinFiveHours("11"));
		assertEquals("RROO", service.convertDIgitalHoursToBerlinFiveHours("12"));
		assertEquals("RROO", service.convertDIgitalHoursToBerlinFiveHours("13"));
		assertEquals("RROO", service.convertDIgitalHoursToBerlinFiveHours("14"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinFiveHoursThreeReds() {
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinFiveHours("15"));
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinFiveHours("16"));
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinFiveHours("17"));
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinFiveHours("18"));
		assertEquals("RRRO", service.convertDIgitalHoursToBerlinFiveHours("19"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinFiveHoursFourReds() {
		assertEquals("RRRR", service.convertDIgitalHoursToBerlinFiveHours("20"));
		assertEquals("RRRR", service.convertDIgitalHoursToBerlinFiveHours("21"));
		assertEquals("RRRR", service.convertDIgitalHoursToBerlinFiveHours("22"));
		assertEquals("RRRR", service.convertDIgitalHoursToBerlinFiveHours("23"));
	}
	
	@Test
	public void testconvertDIgitalHoursToBerlinFiveHoursInvalids() {
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinFiveHours("24"));
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinFiveHours("25"));
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinFiveHours("sfsd"));
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinFiveHours(""));
		assertEquals("XXXX", service.convertDIgitalHoursToBerlinFiveHours(null));
	}
	
	@Test
	public void testconvertDIgitalSecondsToBerlinSecondsAllOns() {
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("00"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("02"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("04"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("06"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("08"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("10"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("12"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("14"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("16"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("18"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("20"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("22"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("24"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("26"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("28"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("30"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("32"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("34"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("36"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("38"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("40"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("42"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("44"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("46"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("48"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("50"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("52"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("54"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("56"));
		assertEquals("Y", service.convertDIgitalSecondsToBerlinSeconds("58"));
	}
	
	@Test
	public void testconvertDIgitalSecondsToBerlinSecondsAllOffs() {
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("01"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("03"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("05"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("07"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("09"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("11"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("13"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("15"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("17"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("19"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("21"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("23"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("25"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("27"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("29"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("31"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("33"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("35"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("37"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("39"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("41"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("43"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("45"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("47"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("49"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("51"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("53"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("55"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("57"));
		assertEquals("O", service.convertDIgitalSecondsToBerlinSeconds("59"));
	}
	
	@Test
	public void testconvertDIgitalSecondsToBerlinSecondsAllInvalids() {
		assertEquals("XXXX", service.convertDIgitalSecondsToBerlinSeconds("60"));
		assertEquals("XXXX", service.convertDIgitalSecondsToBerlinSeconds("61"));
		assertEquals("XXXX", service.convertDIgitalSecondsToBerlinSeconds("asdsa"));
		assertEquals("XXXX", service.convertDIgitalSecondsToBerlinSeconds(""));
		assertEquals("XXXX", service.convertDIgitalSecondsToBerlinSeconds(null));
	}
	
	@Test
	public void testconvertDigitalTimeToBerlinTime() {
		assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO", service.convertDigitalTimeToBerlinTime("00:00:00"));
		assertEquals("ORRRRRRROYYRYYRYYRYYYYYY", service.convertDigitalTimeToBerlinTime("23:59:59"));
		assertEquals("YRRROROOOYYRYYRYYRYOOOOO", service.convertDigitalTimeToBerlinTime("16:50:06"));
		assertEquals("ORROOROOOYYRYYRYOOOOYYOO", service.convertDigitalTimeToBerlinTime("11:37:01"));
	}
	
	@Test
	public void testconvertDigitalTimeToBerlinTimeInvalids() {
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("a0:00:00"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("23:a9:59"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("16:50:a6"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("11:37:1"));
		
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("00:0:00"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("2:59:59"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime(null));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime(""));
		
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("24:00:00"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("23:60:59"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("16:50:60"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("asdfadsf"));
		
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("25:00:00"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("23:61:59"));
		assertEquals("XXXX", service.convertDigitalTimeToBerlinTime("16:50:61"));
	}
	
}
