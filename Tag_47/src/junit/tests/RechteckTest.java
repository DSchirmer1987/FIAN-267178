package junit.tests;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.data.Punkt;
import junit.data.Rechteck;

public class RechteckTest {
	
	Rechteck r = new Rechteck(2, 5, new Punkt(5, 5));
	
	@Test
	public void testFlaeche() {
//		assertEquals( 2*5 , r.getFlaeche(), 0);
		assertEquals("Message", 11, r.getFlaeche(), 0);
	}
	
	@Test
	public void testUmfang() {
		assertThat(r.getFlaeche(), equalTo(10.0));
	}
}
