package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-10 17:36
 */
public class ConvertString6 {
    public static void main(String[] args) {
        convert("leetcodeishiring",3);
    }
    public static String convert(String s, int numRows) {
        if (s.length()<=numRows || numRows==1)
            return s;
        int arrayColumns = numRows;
        int arrayRows;
        int subStructure = 2 * numRows - 2;
        int numSubStructure = s.length() / subStructure;
        if ((s.length() - numSubStructure * subStructure) > numRows)
            arrayRows = numSubStructure * 2 + 2;
        else
            arrayRows = numSubStructure * 2 + 1;
        char[][] tmp = new char[arrayRows][arrayColumns];
        int i = 0;

        for (int j = 0; j < arrayRows; j++) {
            if (j % 2 == 0) {
                for (int k = 0; k < arrayColumns; k++) {
                    if (i < s.length())
                        tmp[j][k] = s.charAt(i++);
                    else break;
                }
            } else {
                for (int k = arrayColumns - 2; k > 0; k--) {
                    if (i < s.length())
                        tmp[j][k] = s.charAt(i++);
                    else break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < arrayColumns; j++) {
            for (int k = 0; k < arrayRows; k++) {
                if (tmp[k][j] != '\0')
                    sb.append(tmp[k][j]);
            }
        }
        return sb.toString();
    }

}
