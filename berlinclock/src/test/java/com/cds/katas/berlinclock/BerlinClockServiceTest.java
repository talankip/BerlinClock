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

}
