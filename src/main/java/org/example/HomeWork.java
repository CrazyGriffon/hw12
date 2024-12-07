package org.example;


import lombok.SneakyThrows;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Решить задачу https://codeforces.com/problemset/problem/1324/C
     */
    @SneakyThrows
    public void frogSteps(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            String s = scanner.next();
            int minD = minD(s);
            out.write(String.valueOf(minD).getBytes());
            out.write(("\r\n").getBytes());
        }
    }

    private int minD(String s) {
        int n = s.length();
        int prev = -1;
        int d = -1;
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'R') {
                d = Math.max(d, i - prev);
                prev = i;
            }
        }
        return Math.max(d, n - prev);
    }
}
