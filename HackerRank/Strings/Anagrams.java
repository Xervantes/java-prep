/*
Question from HackerRank
My soulution to checking if two given strings are anagrams.
Given reasonable constraints such as string length, english characters only,
and case sensitivity does not matter.
*/



static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
        return false;
    }

    char[] sortedA = a.toLowerCase().toCharArray();
    char[] sortedB = b.toLowerCase().toCharArray();
    Arrays.sort(sortedA);
    Arrays.sort(sortedB);

    for (int i = 0; i < a.length(); i++) {
        if (sortedA[i] != sortedB[i]) {
            return false;
        }
    }
    return true;



}
