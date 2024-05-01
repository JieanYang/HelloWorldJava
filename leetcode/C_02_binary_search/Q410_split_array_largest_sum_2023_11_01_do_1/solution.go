package main

import (
	"fmt"
)

func getKResult(nums []int, k int, sumGuess int) int {
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

	return k_in_isValid

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

	result := 0
	left := max
	right := sum

	for left < right {
		mid := left + (right-left+1)/2
		fmt.Println("mid", mid)
		kResult := getKResult(nums, k, mid)
		fmt.Println("kResult", kResult)
		if kResult <= k {
			result = mid
			fmt.Println("mid give to right", mid)
			right = mid - 1
		} else {
			fmt.Println("mid give to left", mid)
			left = mid
		}
	}

	return result
}

func main() {
	input := []int{7, 2, 5, 10, 8}
	result := splitArray(input, 2)
	fmt.Println("result", result)
}
