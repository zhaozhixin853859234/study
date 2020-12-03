package com.bishi;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-07 14:18
 */
public class Re {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==' ')
                sb.append("%20");
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
