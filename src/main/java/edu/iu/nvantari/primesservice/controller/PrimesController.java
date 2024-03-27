package edu.iu.nvantari.primesservice.controller;

import edu.iu.nvantari.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping
public class PrimesController {

    IPrimesService primesService;

    public PrimesController(IPrimesService primesService) {
        this.primesService = primesService;
    }

    @GetMapping("/primes/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primesService.isPrime(n);
    }
}
