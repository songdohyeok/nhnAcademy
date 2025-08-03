package ch04_6;

// TODO 41: StringUtils 클래스에 상세한 Javadoc 주석 작성하기
/**
 * <p>
 * <h2>주요 기능</h2>
 * <ol>
 *   <li></li> 문자열 뒤집기
 *   <li></li> 문자열 회문 판단
 *   <li></li> 문자열 공백 제거
 * </ol>
 *
 * <p><strong>참고:</strong>
 *
 * @since 2025-08-02
 */
public class StringUtils {

    // TODO 42: reverse 메서드에 예제가 포함된 Javadoc 주석 작성하기
    /**
     * <p>예제:
     * <blockquote>
     * <pre>
     * </pre>
     * </blockquote>
     *
     * @param str 문자열
     * @return 뒤집힌 문자열
     */
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // TODO 43: isPalindrome 메서드에 Javadoc 주석 작성하기
    /**
     * <p>
     * <br>
     *
     * @param str 문자열
     * @return 회문인 문자열
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = reverse(cleaned);
        return cleaned.equals(reversed);
    }
}