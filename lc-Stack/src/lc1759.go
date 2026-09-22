package main

func main() {}
func minInsertions(s string) int {
	n := len(s)
	left := 0
	ans := 0
	for i := 0; i < n; i++ {
		if s[i] == '(' {
			left++
			continue
		}
		if left > 0 {
			left--
		} else {
			ans++
		}
		if i < n-1 && s[i+1] == ')' {
			i++
		} else {
			ans++
		}
	}
	return ans + left*2
}
