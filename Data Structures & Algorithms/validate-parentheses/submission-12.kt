class Solution {
    fun isValid(s: String): Boolean {
        // val s = "([{}])"
        val charArray: CharArray = s.toCharArray()
        val stringArray = arrayOf<Char>('(','[','{','}',']',')')
        // var sArr: CharArray = s.split(", ").toCharArray()
        var stack = ArrayDeque<Char>()
        val closeToOpen = mapOf<Char,Char>(')' to '(', ']' to '[', '}' to '{')
        for (c in charArray) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && closeToOpen[c] == stack.peek()) {
                    stack.pop()
                } else {
                    return false
                }
            } else {
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}
