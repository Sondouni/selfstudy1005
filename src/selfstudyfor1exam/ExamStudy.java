package others;

import java.util.ArrayList;
import java.util.List;

public class ExamStudy {
    public static void main(String[] args) {
        yutMaking ym = new yutMaking();
        ym.whatYourName();

        ExamStudy3 cards = new ExamStudy3();
        cards.showMeWhatYouGot();
    }
}
    class yutMaking {

        //윷놀이//
//        String yutName[] = {"도", "개", "걸", "윷", "모", "빽도"};
        //도,개,걸,윷,모,백도
        public final int yutNum = 6;
        List<String> yut;
        String[] neuYut;
        yutMaking(){
            makingYut();
        }

        private void makingYut() {
            yut = new ArrayList();
            for (int i = 0; i < yutNum; i++) {
                String yutName2 = String.valueOf(i);
                switch (i) {
                    case 0:
                        yutName2 = "도";
                        break;
                    case 1:
                        yutName2 = "개";
                        break;
                    case 2:
                        yutName2 = "걸";
                        break;
                    case 3:
                        yutName2 = "윷";
                        break;
                    case 4:
                        yutName2 = "모";
                        break;
                    case 5:
                        yutName2 = "백도";
                        break;
                }
                yut.add(yutName2);
            }
        }
        private void makingYut2(){
            String temp[] = new String[yutNum];
            for(int i = 0;i<yutNum;i++){
                String yutName;
                switch (i){
                    case 0:
                        yutName = "도";  break;
                    case 1:
                        yutName = "개"; break;
                    case 2:
                        yutName = "걸"; break;
                    case 3:
                        yutName = "윷"; break;
                    case 4:
                        yutName = "모"; break;
                    case 5:
                        yutName = "백도"; break;
                    default:
                        yutName = "아무것도없슴";
                }
                temp[i] = yutName;
            }
            neuYut = temp;
        }

        public void whatYourName() {
            for (String str : yut) {
                System.out.println(str);
            }//for each문 (타입값 변수 : z(배열 같은 순서)){
            // 변수 자체가 z의 길이||갯수만큼 z의 처음부터 끝까지의 값(출력해낼때 편함)
        }
}


