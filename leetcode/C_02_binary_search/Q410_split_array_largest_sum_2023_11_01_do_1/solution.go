package main

import (
	"fmt"
	"math"
)

func isValid(nums []int, k int, sumGuess int) bool {
	sum_in_isValid := 0
	k_in_isValid := 0

	for _, num := range nums {
		if sum_in_isValid+num > sumGuess {
			k_in_isValid++
			sum_in_isValid = 0
		}

		sum_in_isValid += num
	}

	k_in_isValid++

	fmt.Println("isValid for mid: ", sumGuess, " break into", k, " and require k: ", k_in_isValid)

	return k_in_isValid <= k

}

func splitArray(nums []int, k int) int {
	// split nums into k subarrays
	// I want to know the largest sum of any subarray

	// Guess the latest sum
	max := nums[0]
	for _, value := range nums {
		if value > max {
			max = value // Update max if a larger value is found
		}
	}
	fmt.Println("max", max)

	sum := 0
	for _, num := range nums {
		sum += num
	}
	fmt.Println("sum", sum)

	result := sum
	left := max
	right := sum

	for left <= right {
		mid := left + (right-left)/2
		// fmt.Println("mid", mid)
		if isValid(nums, k, mid) {
			fmt.Println("mid give to right", mid)
			result = int(math.Min(float64(result), float64(mid)))
			right = mid - 1
		} else {
			fmt.Println("mid give to left", mid)
			left = mid + 1
		}
	}

	return result
}

func main() {
	// input := []int{7, 2, 5, 10, 8}
	input := []int{1, 2, 3, 4, 5}
	// input := []int{1, 4, 4}
	result := splitArray(input, 2)
	fmt.Println("result", result)
}
