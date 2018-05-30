package org.itstep;

public class Vostok {
public  int x =  4 ;
	
	public  int  getVostok () {
		
		Baikonurial factorialer = new Baikonurial ();
		int result = (x +  1 ) * factorialer.getBaikonurial (x);
		return result ;
	}
}

