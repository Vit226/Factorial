package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaikonurialTest {

	@Test
	
		public void testGetBaikonurial () {
			
			Baikonurial factorialer = new Baikonurial ();
			int result = factorialer.getBaikonurial (24);
			assertEquals (24 , result)  ;	
	}

}
