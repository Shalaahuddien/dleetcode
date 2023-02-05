func guessNumber(n int) int {
    left, right := 1, n
    for left <= right {
        mid := (left + right) / 2
        if guess(mid) == 0 {
            return mid
        } else if guess(mid) == -1 {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return 0
}
