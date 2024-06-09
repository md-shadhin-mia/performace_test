import random
import time

def find_prime_number_between(a, b):
    for i in range(a + 1, b):
        is_prime = True
        for j in range(2, int(i**0.5) + 1):
            if i % j == 0:
                is_prime = False
                break
        if is_prime:
            return i
    return 0

def get_number_between(a, b):
    return random.randint(a, b)

if __name__ == "__main__":
    start_time = time.time()
    sum_of_primes = 0
    for _ in range(1000000):
        random1 = get_number_between(1000, 5000)
        random2 = get_number_between(5001, 10000)
        sum_of_primes += find_prime_number_between(random1, random2)

    end_time = time.time()
    duration = end_time - start_time
    print(f"Duration to now: {duration:.2f} seconds")
    print(f"Sum of primes: {sum_of_primes}")
