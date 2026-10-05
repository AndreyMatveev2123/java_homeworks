package src.homework.DZbase;

import java.util.Scanner;
public class Palundrom {
    public static void main(String[] args) {
        /*
         * Что делаем:
         * 1) Читаем строку целиком (с пробелами).
         * 2) Проверяем, палиндром ли она, если игнорировать регистр и небуквенно-цифровые символы.
         *    Подход: два указателя (слева и справа), которые двигаются навстречу.
         * 3) Находим самую длинную палиндромную ПОДСТРОКУ с помощью "расширения от центра".
         *    Здесь игнорируем только регистр, но учитываем любые символы (пробелы, запятые и т. д.).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = sc.nextLine(); // берём всю строку, а не одно слово

        // 1) Палиндром ли строка (игнорируем регистр и не буквенно-цифровые символы)
        boolean isPal = isPalindromeLoose(s);
        if (isPal) {
            System.out.println("Палиндром (при игнорировании регистра и знаков).");
        } else {
            System.out.println("Не палиндром (при игнорировании регистра и знаков).");
        }

        // 2) Самая длинная палиндромная подстрока (учитываем все символы, но игнорируем регистр)
        String longest = longestPalindromicSubstringIgnoreCase(s);
        System.out.println("Самая длинная палиндромная подстрока: \"" + longest + "\"");
    }

    /*
     * Проверка "строка -- палиндром?":
     * - Игнорируем всё, что не буква и не цифра (пробелы, пунктуация).
     * - Сравниваем без учёта регистра.
     * Алгоритм: два указателя -- i слева, j справа; двигаем к центру и сравниваем пары символов.
     * Как только нашли несовпадение -- это не палиндром.
     * Сложность: O(n), где n -- длина строки.
     */
    static boolean isPalindromeLoose(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // сдвигаем i вправо, пока не встретим букву или цифру
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            // сдвигаем j влево, пока не встретим букву или цифру
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(j));

            if (left != right) return false; // пара не совпала -- выходим

            i++;
            j--;
        }
        return true; // все пары совпали
    }

    /*
     * Поиск самой длинной палиндромной ПОДСТРОКИ:
     * Метод "расширение от центра" (expand around center).
     * Для каждого индекса i рассматриваем два центра:
     *   - (i, i)  -- нечётная длина (например, "aba")
     *   - (i, i+1) -- чётная длина (например, "abba")
     * Расширяемся влево/вправо, пока символы равны. Берём максимум.
     * Игнорируем только регистр (toLowerCase), но не выбрасываем символы -- так проще вернуть подстроку.
     * Сложность: O(n^2) в худшем случае (нормально для учебных задач).
     */
    static String longestPalindromicSubstringIgnoreCase(String s) {
        if (s == null || s.isEmpty()) return "";

        String lower = s.toLowerCase(java.util.Locale.ROOT); // сравниваем без учёта регистра, единообразно для всех локалей
        int start = 0, end = 0;         // текущие лучшие границы [start..end]

        for (int i = 0; i < lower.length(); i++) {
            int lenOdd  = expandAroundCenter(lower, i, i);     // центр в символе i
            int lenEven = expandAroundCenter(lower, i, i + 1); // центр между i и i+1
            int len = Math.max(lenOdd, lenEven);

            // Переводим "длину" обратно в [start..end] вокруг центра i
            int newStart = i - (len - 1) / 2;
            int newEnd   = i + len / 2;

            if (len > end - start + 1) {
                start = newStart;
                end = newEnd;
            }
        }
        // Возвращаем подстроку из ИСХОДНОЙ строки (с сохранением исходных регистров/символов)
        return s.substring(start, end + 1);
    }

    // Расширяемся от центра (L, R), пока символы равны. Возвращаем длину найденного палиндрома.
    static int expandAroundCenter(String lower, int L, int R) {
        while (L >= 0 && R < lower.length() && lower.charAt(L) == lower.charAt(R)) {
            L--;
            R++;
        }
        // Цикл остановился на первой "плохой" паре, поэтому реальная длина = R - L - 1
        return R - L - 1;
    }
}

