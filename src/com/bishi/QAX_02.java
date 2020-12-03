package com.bishi;

import java.util.*;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-08-16 15:30
 */
public class QAX_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(str));
        TreeMap<Integer,String> undoString = new TreeMap<>();
        List<String> res = new LinkedList<>();
        int redoCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("undo")){
                if (i-1>=0){
                    redoCount+=2;
                    undoString.put(i-1-redoCount+2,str[i-1]);
                    res.remove(str[i-1]);
                }
                else
                    redoCount++;
            }
            else if (str[i].equals("redo")){
                if (!undoString.isEmpty()){
                    Map.Entry<Integer,String> firstEntry = undoString.lastEntry();
                    int index = firstEntry.getKey();
                    String word = firstEntry.getValue();
                    res.add(index,word);
                }
            }
            else{
                res.add(str[i]);
                }
            }

        for (int i = 0; i < res.size(); i++) {
            if (i!=res.size()-1)
                System.out.print(res.get(i)+" ");
            else
                System.out.print(res.get(i));
        }

    }
}
