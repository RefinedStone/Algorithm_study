import java.util.ArrayList;
import java.util.Arrays;

public class Main12_1 {
    public static void main(String[] args) {
        //String
        //입력 받은 값
        String new_id = "abcdefghijklmn.p";
        // 소문자로 변경
        new_id = new_id.toLowerCase();
        //String.charAt(i)의 값을 바꾸는것은 불가능하기에.. 다시선언
        char[] charNew_id= new_id.toCharArray();
        System.out.println("최초값:"+new_id);
        //문자 분류 + 제거->' ';
        for(int i=0; i<new_id.length();i++){
            if(charNew_id[i]>96 && charNew_id[i]<123) {
                //소문자인 경우
            }
            else if(charNew_id[i]>47 && charNew_id[i]<58){
                // 숫자인 경우
            }
            else if(charNew_id[i]==45 ||charNew_id[i]==46|| charNew_id[i]==95){
                //예외 특수문자인경우
            }
            else{
                charNew_id[i]= ' ';
                //특수문자 제거
            }
        }

        //char aray를 다시 스트링으로 -> blank 삭제 위해
        String strings = new String(charNew_id);
        // blank 삭제
        strings = strings.replace(" ","");
        System.out.println("2단계:"+strings);

        //3단계 .. 중복 삭제
        for (int i = 0;; i++) {
            if(strings.contains("..")){
                strings=strings.replace("..",".");
            }
            else{
                break;
            }
        }
        System.out.println("3단계:"+strings);
        //4단계 앞과 뒤에 . 없애기
        // ArrayList로 형변환 하였습니다
        ArrayList<String> stringlist = new ArrayList<>();
        for (int i = 0; i < strings.length(); i++) {
            stringlist.add(String.valueOf(strings.charAt(i)));
         }
        System.out.println("ArrayList형변환 하였습니다");
        System.out.println(stringlist);

        //0번 인덱스 '.' 없애기

            // 정말 중요한 부분 string값은 == 로 비교가 안되요~~!~!~!~
            if(stringlist.get(0).equals(".") && stringlist.size()!=0){
                //가장 앞부분 index0 제거
                stringlist.remove(0);}
            System.out.println("제거");
            //인덱스 가장 끝, size()-1 제거
        if(stringlist.size()!=0){
            if(stringlist.get(stringlist.size()-1).equals(".")&& stringlist.size()!=0){
                stringlist.remove(stringlist.size()-1);
            }}
        System.out.println("4단계");
        System.out.println(stringlist);

        //5단계 size=0, a 입력
        if(stringlist.size()==0){
                stringlist.add("a");
            }
        System.out.println("5단계");
        System.out.println(stringlist);

        //6단계 16자 이상이면, 나머지 제거
        for (int i = 0; ; i++) {
            if(stringlist.size()>15){
                stringlist.remove(stringlist.size()-1);
            }
            else{
                break;
            }
        }
        //6단계
        System.out.println("6단계, length:"+stringlist.size());
        //System.out.println(stringlist);

        if(stringlist.get(stringlist.size()-1).equals(".")){
            stringlist.remove(stringlist.size()-1);
            System.out.println("6단계, 끝글자의 .을 삭제합니다");
        }
        //System.out.println(stringlist);
        //7단계
        if(stringlist.size()<3){
            for (int i = 0; ; i++){
                if(stringlist.size()>=3){
                    break;
                }
                stringlist.add(stringlist.get(stringlist.size()-1));}}
        System.out.println(stringlist);
        String answer ="";
        for (int i = 0; i < stringlist.size(); i++){
            answer= answer+stringlist.get(i);
        }
        System.out.println("드디어 최종");
        System.out.println(answer);




    }
}
