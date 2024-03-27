package edu.iu.nvantari.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {
    PrimesService primesService = new PrimesService();
    @Test
    void _45IsnotPrime(){
        int n=45;
        boolean expected= false;
        boolean actual =primesService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void _65432864IsNotPrime(){
        long n = 65432864L;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }

}