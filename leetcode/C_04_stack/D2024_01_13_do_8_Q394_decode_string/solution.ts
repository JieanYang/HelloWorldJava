function isDigit(char: string): boolean {
  return /^\d$/.test(char);
}

// Usage
console.log(isDigit("5")); // true
console.log(isDigit("a")); // false
console.log(isDigit(" ")); // false

function decodeString(s: string): string {
  let stringBuilder: string = "";
  let n: number = 0;
  const stack_nubmer: number[] = [];
  const stack_str: string[] = [];

  for (const c of s) {
    console.log("c", c);
    if (isDigit(c)) {
      n = n * 10 + parseInt(c);
    } else if (c === "[") {
      stack_nubmer.push(n);
      n = 0;
      stack_str.push(stringBuilder);
      stringBuilder = "";
    } else if (c === "]") {
      let k = stack_nubmer.pop() ?? 0;
      const tmp = stringBuilder;
      stringBuilder = stack_str.pop() ?? "";
      while (k > 0) {
        stringBuilder += tmp;
        k--;
      }
    } else {
      stringBuilder += c;
    }
  }

  return stringBuilder;
}

decodeString("3[a]2[bc]"); // "aaabcbc"
