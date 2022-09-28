import java.util.ArrayList;
import java.util.List;

public class Main7_2 {
    public static void main(String[] args) {
        //받아오는 값
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 0;
        StringBuilder tempS = new StringBuilder();


        // 받아온 strings 길이만큼의 Stringbuilder array 생성
        StringBuilder[] sb =new StringBuilder[strings.length];



        //string ->string builder 선언
        for (int i = 0; i < strings.length ; i++) {
            sb[i]= new StringBuilder();
            sb[i].append(strings[i]);
            //index 추가
            sb[i].append(i);
            //System.out.println(sb[i].toString());
        }

        //sort하기
//        int sortTimes= strings.length;
//        for (int i = 0; i<strings.length; i++) {
//
//            if(sb[i].charAt(n) > sb[i+1].charAt(n)){
//                tempS=sb[i+1];
//                sb[i+1]=sb[i];
//                sb[i]=tempS;
//             }
//            if(i==(strings.length-2)){
//                i=-1;
//                sortTimes--;
//            }
//            if(sortTimes==1) {
//                break;}
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//        System.out.println(sb[i].toString());
//        }
        sorting(strings,n);


    }
    public static void sorting(String[] strings,int n){
        StringBuilder tempS = new StringBuilder();
        StringBuilder[] sb =new StringBuilder[strings.length];
        //string ->string builder 선언
        for (int i = 0; i < strings.length ; i++) {
            sb[i]= new StringBuilder();
            sb[i].append(strings[i]);
            //index 추가
            sb[i].append(i);
        }
        int sortTimes= strings.length;
        for (int i = 0; i<strings.length; i++) {
            if(sb[i].charAt(n)==sb[i+1].charAt(n)){
                System.out.println("sorting3들어갑니다");
                sorting3(strings,n,i);
            }
             if(sb[i].charAt(n) > sb[i+1].charAt(n)){
                tempS=sb[i+1];
                sb[i+1]=sb[i];
                sb[i]=tempS;
            }

            if(i==(strings.length-2)){
                i=-1;
                sortTimes--;
                if(sortTimes==1){break;}
            }

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(sb[i].toString());
        }
    }
    public static void sorting2(String[] strings,int n,int x){
        StringBuilder tempS = new StringBuilder();
        StringBuilder[] sb =new StringBuilder[strings.length];
        //string ->string builder 선언
        for (int i = 0; i < strings.length ; i++) {
            sb[i]= new StringBuilder();
            sb[i].append(strings[i]);
            //index 추가
            sb[i].append(i);
        }
        int sortTimes= strings.length;
        for (int i = 0; i<strings.length; i++) {

            if(sb[x].charAt(n+1) > sb[x+1].charAt(n+1)){
                tempS=sb[i+1];
                sb[i+1]=sb[i];
                sb[i]=tempS;
            }
            else if(sb[i].charAt(n)==sb[i+1].charAt(n)){
                //sorting_temp(strings,n+1);
                return;
            }
            if(i==(strings.length-2)){
                i=-1;
                sortTimes--;
                if(sortTimes==1){break;}
            }

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(sb[i].toString());
        }
    }
    public static void sorting3(String[] strings,int n,int x){
        StringBuilder tempS = new StringBuilder();
        StringBuilder[] sb =new StringBuilder[strings.length];
        //string ->string builder 선언
        for (int i = 0; i < strings.length ; i++) {
            sb[i]= new StringBuilder();
            sb[i].append(strings[i]);
            //index 추가
            sb[i].append(i);
        }
        int sortTimes= strings.length;
        n=n+1;
        if(sb[x].charAt(n) > sb[x+1].charAt(n)){
            tempS=sb[x+1];
            sb[x+1]=sb[x];
            sb[x]=tempS;
            return;
        }
        else if(sb[x].charAt(n+1)==sb[x+1].charAt(n+1)){
                sorting3(strings,n,x);
        }
    }

}
