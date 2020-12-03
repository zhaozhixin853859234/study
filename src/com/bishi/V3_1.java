package com.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-07 15:57
 */
public class V3_1 {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                // write your code here
                int n = scanner.nextInt();
                ListNode mainNode = new ListNode(0);
                for (int i = 0; i < n ; i++) {
                    String[] s = scanner.nextLine().split(" ");
                    ListNode root = new ListNode(0);
                    for (int j = 0; j < s.length; j++) {
                        root.next = new ListNode(Integer.parseInt(s[j]));
                    }
                   mainNode.next=new ListNode(Integer.parseInt(s[0]));
                }

            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        // TODO output

    }

    static class ListNode {
        int val;

        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


//    private static ListNode mergeNodes(ListNode head ) {
//
//        // write your code here
//        ListNode r
//
//    }


}
