package main

import (
	"bytes"
	"fmt"
	"unicode"
)

func decodeString(s string) string {
	var buffer bytes.Buffer
	n := 0
	stack_number := []int{}
	stack_str := []string{}

	for _, item := range s {
		item_char := string(item)
		fmt.Println("item", item_char)

		if unicode.IsDigit(item_char) {
			n = n*10 + (item_char - "0")
		} else if item_char == "[" {
			append(stack_number, n)
			n = 0
			append(stack_str, buffer)
			buffer = *new(bytes.Buffer)
		} else if item_char == "]" {
			k := stack_number[len(stack_number)-1]
			stack_number = stack_number[:len(stack_number)-1]
			var tmp bytes.Buffer = buffer
			buffer = stack_str[len(stack_str)-1]
			stack_str = stack_str[:len(stack_str)-1]
			for ; k > 0; k-- {
				buffer.WriteString(tmp.String())
			}
		} else {
			buffer.WriteString(item_char)
		}
	}

	return buffer.String()
}

func main() {
	decodeString("abc")
	fmt.Println("run main")
}
