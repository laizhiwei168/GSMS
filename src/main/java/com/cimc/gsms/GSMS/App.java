package com.cimc.gsms.GSMS;

import java.text.DecimalFormat;

import com.cimc.gsms.utils.Utilty;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Utilty u= new Utilty();
        byte[] b= {0x33,0x02,(byte) 0x03,0x04,0x05};
       
       System.out.println(toDouble(b, 0, 4));
       int a=53;
       System.out.println(todouble(a, 12));;
    }
    
    public static double todouble(int a,int b) {
    	 DecimalFormat df=new DecimalFormat("0.00");//设置保留位数    	 
 	    return Double.valueOf(df.format((float)a/b));
    }
    
    public static double toDouble(byte[] b, int start, int length) {		
		int i=new Utilty().bytes2IntTurn(b, start+1, length-1);
		int i1=b[start];
		Double d=new Double(i+"."+i1);
		return d;
	}
}
