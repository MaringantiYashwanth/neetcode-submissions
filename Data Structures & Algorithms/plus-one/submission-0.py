class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        char_arr = [str(digit) for digit in digits]
        num = int(''.join(char_arr))
        num += 1
        
        char_arr = [str(digit) for digit in str(num)]
        result_arr = [int(digit) for digit in char_arr]
        return result_arr