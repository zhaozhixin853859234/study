package com.bishi;

import java.util.*;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-11 19:07
 */

/**
 * next（）在输入有效字符之后，将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符。
 * nextLine（）方法的结束符只是Enter键
 * 所以
 * nextLine（）自动读取了被next（）去掉的Enter作为他的结束符，所以没办法从键盘输入值。
 * 经过验证，其他的next的方法，如nextDouble()  ，nextFloat() ，nextInt() 等与nextLine（）连用时都存在这个问题。
 * 具体点就是
 * nextLine（）不能用在nextInt()的后面！！！！
 * 采用sc.useDelimiter("\n");指定一行的结束符为换行
 */
public class bd_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numList = sc.nextInt();
        // Scanner sc1 = new Scanner(System.in);
        sc.useDelimiter("\n");
        List<List<Integer>> input = new LinkedList<>();
        for (int i = 0; i < numList*2; i++) {
            String[] s = sc.next().split(" ");
            List<Integer> tmp = new LinkedList<>();
            for (String str: s) {
                tmp.add(Integer.parseInt(str));
            }
            input.add(tmp);
        }

        int index = 0;
        for (int i = 0; i < numList ; i++) {
            if (index<input.size()){
                List<Integer> listA = input.get(index);
                List<Integer> listB = input.get(++index);
                int[] a = listA.stream().mapToInt(Integer::intValue).toArray();
                int[] b = listB.stream().mapToInt(Integer::intValue).toArray();
                index++;
                if (isPopOrder(a,b))
                    System.out.println("Y");
                else
                    System.out.println("N");
            }
            else break;
        }
    }

    private static boolean isPopOrder(int[] a,int[] b){
        if (a.length==0 || b.length==0)
            return false;
        Stack<Integer> ad=new Stack<>();
        int n=0;
        for (int i=0;i<a.length;i++){
            ad.push(a[i]);
            // 找到第一个与b中相等元素，a出栈，b的索引++
            while (!ad.isEmpty()&&ad.peek()==b[n] ){
                ad.pop();
                n++;
            }
        }
        return ad.isEmpty();
    }
}
