package com.gl.javafsd.dsa.paymoney;

public class DriverClass {

	public static void main(String[] args) throws Exception {

		PayMoneyTransactionManager manager = new PayMoneyTransactionManager();

		manager.process();
	}
}