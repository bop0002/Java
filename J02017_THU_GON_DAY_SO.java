package oop;

import java.util.Scanner;
import java.util.Stack;

public class J02017_THU_GON_DAY_SO {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            st.push(tmp);
            while (st.size() > 1) {
                int tmp1 = st.pop();
                int tmp2 = st.pop();
                int sum = tmp1 + tmp2;
                if(sum %2==0)
                {
                    continue;
                }
                else
                {
                    st.push(tmp2);
                    st.push(tmp1);
                    break;
                }
            }
        }
        System.out.println(st.size());
    }

    public static void main(String[] args) {
        testCase();
    }

}
