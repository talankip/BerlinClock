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
	public void testGetSingleMinuteRow() {
		assertEquals("OOOO", service.convertDigitalMinutesToBerlinSigleMinutes("00"));
		assertEquals("YYYY", service.convertDigitalMinutesToBerlinSigleMinutes("59"));
		assertEquals("YOOO", service.convertDigitalMinutesToBerlinSigleMinutes("41"));
		assertEquals("YYOO", service.convertDigitalMinutesToBerlinSigleMinutes("32"));
		assertEquals("YYYO", service.convertDigitalMinutesToBerlinSigleMinutes("23"));
		assertEquals("YYYY", service.convertDigitalMinutesToBerlinSigleMinutes("34"));
		assertEquals("OOOO", service.convertDigitalMinutesToBerlinSigleMinutes("35"));
		
		
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("ab"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("60"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes("61"));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes(""));
		assertEquals("XXXX", service.convertDigitalMinutesToBerlinSigleMinutes(null));
	}
	
}
