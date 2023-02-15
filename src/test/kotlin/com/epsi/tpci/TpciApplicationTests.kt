package com.epsi.tpci

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TpciApplicationTests {
	@Test
	fun testAddition() {
		val a = 1
		val b = 1
		val expectedSum = 2
		val actualSum: Int = a + b
		assertEquals(expectedSum, actualSum)
	}

	@Test
	fun testAddition2() {
		val a = 3
		val b = 3
		val expectedSum = 6
		val actualSum: Int = a + b
		assertEquals(expectedSum, actualSum)
	}
}
