package main

import (
	"fmt"
	"math"
)

func maxArea(height []int) int {
	i := 0
	j := len(height) - 1
	max := 0

	for i <= j {
		width := j - i
		ht := int(math.Min(float64(height[i]), float64(height[j])))

		area := width * ht

		max = int(math.Max(float64(area), float64(max)))

		if height[i] > height[j] {
			j--
			continue
		}

		if height[i] < height[j] {
			i++
			continue
		}

		if height[i] == height[j] {
			i++
			j--
			continue
		}
	}
	return max
}

func main() {
	height := []int{1, 8, 6, 2, 5, 4, 8, 3, 7}

	result := maxArea(height)

	fmt.Println("result", result)
}
