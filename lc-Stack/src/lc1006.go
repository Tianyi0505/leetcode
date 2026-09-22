package main

func main() {
}
func clumsy(n int) int {
	var st []int
	op := 1
	st = append(st, n)
	n--
	for ; n > 0; n-- {
		switch op {
		case 1:
			st[len(st)-1] *= n
		case 2:
			st[len(st)-1] /= n
		case 3:
			st = append(st, n)
		case 4:
			st = append(st, -n)
		}
		op = (op % 4) + 1
	}
	ans := 0
	for _, x := range st {
		ans += x
	}
	return ans
}
