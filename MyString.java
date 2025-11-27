public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {

        String newStr = "";

        for(int i=0; i<str.length();i++)
        {
            newStr = newStr+Character.toLowerCase(str.charAt(i));
        }

        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();

        // מחרוזת ריקה תמיד מוכלת (בבדיקת contain)
        if (n2 == 0) {
            return true;
        }
        // אם str2 ארוכה יותר מ-str1, אין סיכוי להכלה
        if (n2 > n1) {
            return false;
        }

        // 2. לולאה חיצונית: סורקת את כל המיקומים האפשריים להתחלה (i)
        // המיקום האחרון לבדיקה הוא n1 - n2
        for (int i = 0; i <= n1 - n2; i++) {
            
            boolean match = true;
            
            // 3. לולאה פנימית: בודקת התאמה תו-אחר-תו של str2
            for (int j = 0; j < n2; j++) {
                
                // משווים את התו ה-j ב-str2 לתו ב-str1 החל ממיקום i
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break; // נמצאה אי-התאמה, יוצאים מהבדיקה הפנימית ומתחילים מחדש ב-i+1
                }
            }
            
            // 4. אם הלולאה הפנימית הסתיימה בהצלחה (match נשאר true)
            if (match) {
                return true; // נמצאה התאמה, מחזירים true ויוצאים
            }
        }

        // 5. אם אף התחלה לא הובילה להתאמה
        return false;
    }
}
