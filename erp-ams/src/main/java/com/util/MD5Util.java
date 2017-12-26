package com.util;

import java.security.MessageDigest;

public class MD5Util {
	/**
	 * 
	 * @param origin
	 *            原始字符串
	 * @param charsetname
	 *            字符编码
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
	 * @param origin
	 *            原始字符串
	 * @param charsetname
	 *            字符编码
	 * @return 大写的MD5码
	 */
	public static String MD5EncodeUpper(String origin, String charsetname) {
		String resultString = MD5Encode(origin, charsetname);
		if (resultString != null)
			resultString = resultString.toUpperCase();
		return resultString;
	}

}
