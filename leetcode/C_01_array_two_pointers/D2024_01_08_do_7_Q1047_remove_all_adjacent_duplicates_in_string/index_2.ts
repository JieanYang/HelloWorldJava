function removeDuplicates(s: string): string {
  let i: number = 1,
    j: number = 1;

  while (j < s.length) {
    if (i > 0 && s[i - 1] === s[j]) {
      i--;
    } else {
      s = s.slice(0, i) + s.slice(j);
      i++;
    }
    j++;
  }

  return s;
}
