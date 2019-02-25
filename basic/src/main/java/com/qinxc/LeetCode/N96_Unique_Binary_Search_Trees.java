package com.qinxc.LeetCode;

/**
 * @author qxc
 * @date 2019/2/9.
 */


/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 * <p>
 * Example:
 * <p>
 * Input: 3
 * Output: 5
 * Explanation:
 * Given n = 3, there are a total of 5 unique BST's:
 * <p>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 */


public class N96_Unique_Binary_Search_Trees {

    //todo review

    public static void main(String[] args) {

        int result = new N96_Unique_Binary_Search_Trees().numTrees(3);
        System.out.println(result);

        class innerClass{

        }

    }

    public int numTrees(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
