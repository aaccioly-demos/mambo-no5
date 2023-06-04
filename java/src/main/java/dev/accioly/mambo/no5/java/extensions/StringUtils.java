// SPDX-FileCopyrightText: 2023 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.mambo.no5.java.extensions;

public final class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean isPalindrome(String s) {
        return s.contentEquals(new StringBuilder(s).reverse());
    }

    public static void main(String[] args) {
        System.out.printf("Is 'ana' a palindrome? %b%n", isPalindrome("ana"));
        System.out.printf("Is 'java' a palindrome? %b%n", isPalindrome("java"));
    }
}
