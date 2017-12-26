package com.uuid;

import java.util.UUID;

public class TestUUID {

	public static void main(String[] args) {
		UUID uuid=UUID.randomUUID();
		String s = uuid.toString().replaceAll("-", "").toUpperCase();
		System.out.println(s);
		System.out.println(s.length());
	}
}
