class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        # convert digits into characters
        characters = [str(digit) for digit in digits]
        # join the characters together
        num = ''.join(characters)
        # convert number to integer
        num = int(num)
        # add 1 to the number
        num += 1
        # convert number to characters
        characters = [str(digit) for digit in str(num)]
        # convert characters to numbers in 
        numbers = [int(character) for character in characters]
        return numbers