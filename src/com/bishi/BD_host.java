package com.bishi;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-18 20:08
 */
public class BD_host {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String url = sc.nextLine();
//        Pattern p =Pattern.compile("[^//]*?\\.(com|cn|net|org|biz|info|cc|tv)", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = p.matcher(url);

        String re = "((http|ftp|https)://)(([a-zA-Z0-9._-]+)|([0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}))(([a-zA-Z]{2,6})|(:[0-9]{1,4})?)";
       // String re = "(([^//]*)(([a-zA-Z0-9._-]+)|([0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}))(([a-zA-Z]{2,6})|(:[0-9]{1,4})?)";
        // 编译正则表达式
        Pattern p= Pattern.compile(re);
        Matcher matcher = p.matcher(url);
        if (matcher.find())
            System.out.println(matcher.group());
        else
            System.out.println("invalid");
    }
}
