package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class VostokTest {

	@Test
public void testGetVostok () {
		
		Vostok function =  new Vostok ();
		int ignition  = function . getVostok ();
	
		assertEquals (120, ignition) ;
	
	}

}
