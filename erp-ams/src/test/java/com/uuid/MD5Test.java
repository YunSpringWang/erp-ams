package com.uuid;

import java.security.MessageDigest;

public class MD5Test {
	/***
	 * MD5加码 生成32位md5码
	 */
	public static String string2MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();

	}

	/**
	 * 加密解密算法 执行一次加密，两次解密
	 */
	public static String convertMD5(String inStr) {

		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String s = new String(a);
		return s;

	}


	 /**
	  * 
	  * @param origin 原始字符串
	  * @param charsetname 字符编码
	  * @return 小写的MD5码
	  */
	 public static String MD5Encode(String origin, String charsetname) {
	        String resultString = null;
	        byte[] b = null;
	        try {
	            resultString = new String(origin);
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            if (charsetname == null || "".equals(charsetname))
	                b = md.digest(resultString.getBytes());
	            else
	                b = md.digest(resultString.getBytes(charsetname));
	            StringBuffer resultSb = new StringBuffer();
	            for (byte bs : b) {
	                int bt = bs & 0xff;
	                if (bt < 16)
	                    resultSb.append(0);
	                resultSb.append(Integer.toHexString(bt));
	            }
	            resultString = resultSb.toString().toLowerCase();
	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }
	        return resultString;
	    }
	 /**
	  * 
	  * @param origin 原始字符串
	  * @param charsetname 字符编码
	  * @return 大写的MD5码
	  */
	    public static String MD5EncodeUpper(String origin, String charsetname) {
	        String resultString = MD5Encode(origin, charsetname);
	        if (resultString != null)
	            resultString = resultString.toUpperCase();
	        return resultString;
	    }
		// 测试主函数
		public static void main(String args[]) {
			String s = new String("12,3456jyfvf@556");
			System.out.println(MD5Encode(s, "utf-8"));

			System.out.println(MD5EncodeUpper(s, "utf-8"));
			
			System.out.println("原始：" + s);
			System.out.println("MD5后：" + string2MD5(s));
			System.out.println("加密的：" + convertMD5(s));
			System.out.println("解密的：" + convertMD5(convertMD5(s)));
			
			
		

		}
}
