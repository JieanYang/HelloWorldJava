package main

import "fmt"

func isValid(s string) bool {
	stack := []string{}

	for _, item := range s {
		// fmt.Println("index", index)
		// fmt.Println("str(item)", item, string(item))

		item_str := string(item)
		fmt.Println("str(item)", item_str)

		if item_str == "(" || item_str == "[" || item_str == "{" {
			stack = append(stack, item_str)
		} else {
			if len(stack) == 0 {
				return false
			}

			// fmt.Println("before stack", stack)
			if item_str == ")" && stack[len(stack)-1] == "(" || item_str == "}" && stack[len(stack)-1] == "{" || item_str == "]" && stack[len(stack)-1] == "[" {
				stack = stack[:len(stack)-1]
			} else {
				return false
			}
			// fmt.Println("afater stack", stack)

		}
	}

	if len(stack) > 0 {
		return false
	}

	return true
}

func main() {
	// result := isValid("({)}{}")
	result := isValid("(])")
	fmt.Println("isValid", result)
}
