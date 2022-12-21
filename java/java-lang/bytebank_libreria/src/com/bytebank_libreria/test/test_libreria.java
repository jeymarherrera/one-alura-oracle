package com.bytebank_libreria.test;

import pa.com.ByteBank.modelo.Cuenta;
import pa.com.ByteBank.modelo.CuentaCorriente;

public class test_libreria {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaCorriente(12,12);
		cuenta.realizarDeposito(200.0);
	}
}
