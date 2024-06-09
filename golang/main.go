package main

import (
	"fmt"
	"math/rand"
	"time"
)

func findPrimeNumberBetween(a, b int) int {
	for i := a + 1; i < b; i++ {
		isPrime := true
		for j := 2; j*j <= i; j++ {
			if i%j == 0 {
				isPrime = false
				break
			}
		}
		if isPrime {
			return i
		}
	}
	return 0
}

func getNumberBetween(a, b int) int {
	return rand.Intn(b-a+1) + a
}

func main() {
	startTime := time.Now()
	sumOfPrimes := 0
	for i := 0; i < 1000000; i++ {
		random1 := getNumberBetween(1000, 5000)
		random2 := getNumberBetween(5001, 10000)
		sumOfPrimes += findPrimeNumberBetween(random1, random2)
	}

	endTime := time.Now()
	duration := endTime.Sub(startTime)
	fmt.Printf("Duration to now: %.2f seconds\n", duration.Seconds())
	fmt.Printf("Sum of primes: %d\n", sumOfPrimes)
}
