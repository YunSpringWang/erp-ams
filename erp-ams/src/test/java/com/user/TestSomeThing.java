package com.user;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;

import org.junit.Test;

public class TestSomeThing {
	@Test
	public void getIP() throws Exception{
		try
		{ 
		System.out.println("本机的域名/IP = " + InetAddress.getLocalHost());
		System.out.println("本机的域名 = " + InetAddress.getLocalHost().getHostName());
		System.out.println("本机的IP = " + InetAddress.getLocalHost().getHostAddress());
		System.out.println("本机MAC地址= " +getMACAddress(InetAddress.getLocalHost()));
		} catch (UnknownHostException e)
		{ 
		e.printStackTrace();
		}
	}
	   //获取MAC地址的方法    
    private static String getMACAddress(InetAddress ia)throws Exception{    
        //获得网络接口对象（即网卡），并得到mac地址，mac地址存在于一个byte数组中。    
        byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();    
            
        //下面代码是把mac地址拼装成String    
        StringBuffer sb = new StringBuffer();    
            
        for(int i=0;i<mac.length;i++){    
            if(i!=0){    
                sb.append("-");    
            }    
            //mac[i] & 0xFF 是为了把byte转化为正整数    
            String s = Integer.toHexString(mac[i] & 0xFF);              
            sb.append(s.length()==1?0+s:s);    
        }         
        //把字符串所有小写字母改为大写成为正规的mac地址并返回    
        return sb.toString().toUpperCase();    
    }    
    @Test
    public void RandomTest(){
    	
    for(int j=1;j<4;j++){	    
    	System.out.println("-----------als01-------------------");
    	System.out.println("LUX1   LUX2   LUX3");
  
    	    float[] LUX1 = randomCommonforfloat(50,54,5);  
    	    float[] LUX2 = randomCommonforfloat(200,210,5);  
    	    float[] LUX3 = randomCommonforfloat(340,370,5);  

    	    
    	    for (int i=0;i<LUX1.length ;i++) {  
    	    	 float  a   =  (float)(Math.round(LUX1[i]*100))/100;
    	    	 float  b   =  (float)(Math.round(LUX2[i]*100))/100;
    	    	 float  c   =  (float)(Math.round(LUX3[i]*100))/100;
    	    	 BigDecimal   f1  =   new BigDecimal(a);  
    	    	float a1 = f1.setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();  
    	    	 BigDecimal   f2 =   new BigDecimal(b);  
     	    	float b1 = f2.setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();  
     	    	 BigDecimal   f3  =   new BigDecimal(c);  
     	    	float c1 = f3.setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();  
    	        System.out.println(a1+"   "+b1+"   "+c1+"   "); 
    	       
    	    } 
    }
        }
    /** 
     * 随机指定范围内N个不重复的数 
     * 最简单最基本的方法 
     * @param min 指定范围最小值 
     * @param max 指定范围最大值 
     * @param n 随机数个数 
     */  
    public static int[] randomCommon(int min, int max, int n){  
        if (n > (max - min + 1) || max < min) {  
               return null;  
           }  
        int[] result = new int[n];  
        int count = 0;  
        while(count < n) {  
            int num = (int) (Math.random() * (max - min)) + min;  
            boolean flag = true;  
            for (int j = 0; j < n; j++) {  
                if(num == result[j]){  
                    flag = false;  
                    break;  
                }  
            }  
            if(flag){  
                result[count] = num;  
                count++;  
            }  
        }  
        return result;  
    }  
    /** 
     * 随机指定范围内N个不重复的数 
     * 最简单最基本的方法 
     * @param min 指定范围最小值 
     * @param max 指定范围最大值 
     * @param n 随机数个数 
     */  
    public static float[] randomCommonforfloat(float min, float max, int n){  
        if (n > ((max - min)*10 ) || max < min) {  
               return null;  
           }  
        float[] result = new float[n];  
        int count = 0;  
        while(count < n) {  
        	float num = (float) (Math.random() * (max - min)) + min;  
            boolean flag = true;  
            for (int j = 0; j < n; j++) {  
                if(num == result[j]){  
                    flag = false;  
                    break;  
                }  
            }  
            if(flag){  
                result[count] = num;  
                count++;  
            }  
        }  
        return result;  
    }  
}
