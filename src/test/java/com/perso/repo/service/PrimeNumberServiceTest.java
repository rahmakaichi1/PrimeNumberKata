package com.perso.repo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;

import com.perso.repo.PrimeNumberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PrimeNumberServiceTest {
	
	PrimeNumberService primeNumbersService;
	
	@BeforeEach
	public void setUp() {
		primeNumbersService = new PrimeNumberService();
	}
	
	/**
	 * Implement PrimeNumbers Class
	 */
	@Test
	void should_return_first_prime_numbers_before_30() throws Exception {
		List<Integer> actualPrimeNumbers = primeNumbersService.calculate(30);
		assertThat(actualPrimeNumbers).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	}
	
	/**
	 * Add a UT which throws an IllegalArgumentException when argument is less than 2
	 */

	@Test
	void when_number_is_less_than_2_then_throw_IllegalArgumentException() throws Exception{
		assertThatThrownBy(() -> {
			primeNumbersService.calculate(1);
		}).isInstanceOf(IllegalArgumentException.class);
	}
	
	/**
	 Add a UT which throws an NullPointerException when argument is NULL
	 */
}