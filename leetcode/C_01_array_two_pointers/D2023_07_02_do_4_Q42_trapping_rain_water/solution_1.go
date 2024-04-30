package main

import (
	"fmt"
	"math"
)

func trap(height []int) int {
	leftMaxHeight := []int{}
	rightMaxHeight := make([]int, len(height))
	var leftMax int
	var rightMax int

	sum := 0

	for index, h := range height {
		fmt.Println("index", index)
		fmt.Println("h", h)
		if index == 0 {
			leftMaxHeight = append(leftMaxHeight, 0)
			leftMax = height[index]
			continue
		}

		fmt.Println("leftMax", leftMax)

		leftMaxHeight = append(leftMaxHeight, leftMax)
		leftMax = int(math.Max(float64(leftMax), float64(height[index])))
	}

	fmt.Println("leftMaxHeight", leftMaxHeight)

	for index := len(height) - 1; index >= 0; index-- {
		if index == len(height)-1 {
			rightMaxHeight[index] = 0
			rightMax = height[index]
			continue
		}

		fmt.Println("rightMax", rightMax)

		rightMaxHeight[index] = rightMax
		rightMax = int(math.Max(float64(rightMax), float64(height[index])))
	}

	fmt.Println("rightMaxHeight", rightMaxHeight)

	for index, item := range height {
		leftMaxItem := leftMaxHeight[index]
		rightMaxItem := rightMaxHeight[index]

		fmt.Println("item", item)

		waterHeight := int(math.Min(float64(leftMaxItem), float64(rightMaxItem)))
		if waterHeight-item >= 0 {
			waterHeight = waterHeight - item
		} else {
			waterHeight = 0
		}

		sum += waterHeight
	}

	return sum
}

func main() {
	input := []int{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}
	result := trap(input)
	fmt.Println("result", result)
}
