public class Main12 {
    public static void main(String[] args) {
            String new_id = "=.=";

        //알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        //// A = 65, a= 97
        // 예외 45, 46, 95
        //숫자 48~57, 소문자 97~122;

        char[] cArray = new_id.toCharArray();
        for (int i = 0; i < new_id.length(); i++) {
            if (cArray[i] == 45 || cArray[i] == 46 || cArray[i] == 95) {
                //예외
            } else if (cArray[i] < 58 && cArray[i] > 47) {
                //예외
            } else if (cArray[i] < 123 && cArray[i] > 96) {
                // 예외
            } else {
                cArray[i] = ' ';
            }
        }
        String temp_string = new String(cArray);

        temp_string = temp_string.replaceAll(" ", "");

        for (int i = 0; ; i++) {
            temp_string = temp_string.replace("..", ".");
            if (temp_string.contains("..") == false) {
                break;
            }
        }


        //앞뒤 . 없애기
        int temp_length = 0;
        for (int i = 0; ; i++) {
            temp_length = temp_string.length();
            if (temp_string.charAt(0) == '.') {
                temp_string = temp_string.substring(1);
                temp_length--;
            }
            if (temp_string.charAt(temp_length - 1) == '.') {
                temp_string = temp_string.substring(0, temp_length - 1);
                temp_length--;
            }
            if (temp_string.charAt(0) != '.' && temp_string.charAt(temp_length - 1) != '.') {
                break;
            }
        }

        //빈문자열 ? -> a
        if (temp_string == "") {
            temp_string = "a";
        }
        // 16자 이상이면 15로
        if (temp_string.length() > 15) {
            temp_string = temp_string.substring(0, 15);
        }

        // 마침표 제거
        for (int i = 0; ; i++) {
            temp_length = temp_string.length();
            if (temp_string.charAt(temp_length - 1) == '.') {
                temp_string = temp_string.substring(0, temp_length);
                temp_length--;
            }
            if (temp_string.charAt(temp_length - 1) != '.') {
                break;
            }
        }
        // 문자 3이상 만들기
        for (int i = 0; ; i++) {
            temp_length = temp_string.length();
            if (temp_string.length() < 3) {
                temp_string = temp_string + String.valueOf(temp_string.charAt(temp_length - 1));
            } else {
                break;
            }
        }

        //return temp_string;
        }
    }


