package test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashMap<String, String> map1 = new HashMap<String, String>();
        // HashMap<String, String> map2 = new HashMap();
        // map2 = map1;
        int a = 1;
        a = maybe ("abc") { 1, 2, 3};
        System.out.println("a: " + a);

        TreeNode root = new TreeNode();
        System.out.println(root.val);

        for (int i = 0; i < args.length; i++) {
            System.out.println("i: " + args[i]);
        }

        System.out.println("Hello World!");
    }
}
