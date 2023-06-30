/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function (s) {
  let i = 0,
    j = s.length - 1;

  while (i < j) {
    const tmp = s[i];
    s[i] = s[j];
    s[j] = tmp;

    i++;
    j--;
  }

  return s;
};

var result_1 = reverseString(["h", "e", "l", "l", "o"]);
console.log("case 1", result_1);

var result_2 = reverseString(["H", "a", "n", "n", "a", "h"]);
console.log("case 2", result_2);
