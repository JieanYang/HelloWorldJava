package main

import (
	"bytes"
	"fmt"
	"strconv"
	"unicode"
)

func decodeString(s string) string {
	var buffer bytes.Buffer
	stack_number := []int{}
	stack_str := []string{}
	n := 0

	for _, item := range s {
		if unicode.IsDigit(item) {
			digit, _ := strconv.Atoi(string(item)) // Convert rune to int
			fmt.Println("digit", digit)
			n = n*10 + digit
		} else if item == '[' {
			stack_number = append(stack_number, n)
			n = 0
			stack_str = append(stack_str, buffer.String())
			buffer.Reset()
		} else if item == ']' {
			k := stack_number[len(stack_number)-1]
			stack_number = stack_number[:len(stack_number)-1]
			tmpStr := buffer.String() // Store current buffer
			buffer.Reset()
			buffer.WriteString(stack_str[len(stack_str)-1])
			stack_str = stack_str[:len(stack_str)-1]
			for ; k > 0; k-- {
				buffer.WriteString(tmpStr)
			}
		} else {
			buffer.WriteRune(item) // Directly write rune to buffer
		}
	}

	return buffer.String()
}

func main() {
	inputs := "3[a]2[bc]"
	result := decodeString(inputs)
	fmt.Println("result:", result)
}
