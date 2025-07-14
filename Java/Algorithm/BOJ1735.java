/*
 https://www.acmicpc.net/problem/1735
 분수 합
 분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.
두 분수의 합 또한 분수로 표현할 수 있다. 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오.
 기약분수란 더 이상 약분되지 않는 분수를 의미한다.

첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다.
 입력되는 네 자연수는 모두 30,000 이하이다.
 */

package Java.Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1735 {

    public static void main(String[] args) throws IOException {
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());

        int numer = a * d + c * b;
        int deno = b * d;

        int gcd = gcd(numer, deno);

        System.out.printf("%d %d", numer/gcd, deno/gcd);

    }


public static int gcd(int numer, int deno){
    while (deno != 0) {
        int tmp = numer % deno;
        numer = deno;
        deno = tmp;
    }

    return numer;
    }
}