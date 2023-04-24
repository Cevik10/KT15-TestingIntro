package com.hakancevik.testintroproject

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


internal class TaxTest {

    // TDD - Test Driven Development

    private lateinit var tax: Tax

    @Before
    fun setUp() {
        tax = Tax()
    }

    @After
    fun tearDown() {

    }


    @Test
    fun calculateTaxTest() {

        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10)

    }

    @Test
    fun calculateIncomeTest() {

        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertThat(netIncome).isEqualTo(90)
    }
}