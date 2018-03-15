package com.cacacoo.webservice.service;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {
	@Test
	public void sum() throws Exception {
		 long num1 = 1;
		 long num2 = 2;
		 long sum = Calculator.sum(num1, num2);
		 assertThat(sum).isEqualTo(3);
	}

}