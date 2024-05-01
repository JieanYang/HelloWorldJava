package main

import "fmt"

func dailyTemperatures(temperatures []int) []int {
	stack_for_index := []int{}
	result := make([]int, len(temperatures), len(temperatures))

	// for _, dT := range temperatures {
	// 	fmt.Println("dT", dT)
	// }

	for index := len(temperatures) - 1; index >= 0; index-- {
		dT := temperatures[index]
		fmt.Println("dT", dT)

		// dT > last of stack_for_index -> pop stack_for_index
		for len(stack_for_index) > 0 && temperatures[stack_for_index[len(stack_for_index)-1]] <= dT {
			stack_for_index = stack_for_index[:len(stack_for_index)-1] // pop up
		}

		// until the last of stack_for_index > dT
		if len(stack_for_index) == 0 {
			result[index] = 0
		} else {
			result[index] = stack_for_index[len(stack_for_index)-1] - index
		}

		stack_for_index = append(stack_for_index, index)
	}

	return result
}

func main() {
	input := []int{73, 74, 75, 71, 69, 72, 76, 73}
	result := dailyTemperatures(input)
	fmt.Println("result", result)
}
