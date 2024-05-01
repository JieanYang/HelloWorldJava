package main

import "fmt"

func asteroidCollision(asteroids []int) []int {
	stack := []int{}
	n := len(asteroids)

	for i := 0; i < n; i++ {
		itemAsteroid := asteroids[i]
		if itemAsteroid > 0 { // positive direction
			stack = append(stack, itemAsteroid)
		} else {
			// calculate negative sign case until the first item is negative or all the rest are possitive
			for len(stack) != 0 && stack[len(stack)-1] > 0 && stack[len(stack)-1]+itemAsteroid < 0 {
				stack = stack[:len(stack)-1]
			}

			if len(stack) == 0 {
				stack = append(stack, itemAsteroid)
			} else if stack[len(stack)-1]+itemAsteroid == 0 {
				stack = stack[:len(stack)-1]
			} else if stack[len(stack)-1] < 0 {
				stack = append(stack, itemAsteroid)
			}
		}
	}

	resultSize := len(stack)
	result := make([]int, resultSize)
	for i := resultSize - 1; i >= 0; i-- {
		result[i] = stack[len(stack)-1]
		stack = stack[:len(stack)-1]
	}

	return result
}

func main() {
	input := []int{}
	asteroidCollision(input)
	fmt.Println("run main")
}
