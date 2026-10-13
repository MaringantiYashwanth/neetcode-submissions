class Solution {

    public String encode(List<String> strs) {
        // encoding
        StringBuilder encodedStr = new StringBuilder(); 
        for (String str: strs) {
            encodedStr.append(str.length() + "#" + str);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // find #
            int index = str.indexOf('#', i);

            // length = number before #
            int length = Integer.parseInt(str.substring(i, index));

            // extract string using length
            String decodedStr = str.substring(index + 1, index + 1 + length);
            // add to result
            result.add(decodedStr);
            // jump i
            i = index + 1 + length; 

        }        

        return result;

    }
}
