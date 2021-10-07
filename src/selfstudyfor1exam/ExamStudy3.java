package others;
import java.util.*;
public class ExamStudy3 {
        public final int CARDNUM = 13;
        private List<ExamStudy2> cards;
        //메소드, 생성자 다른 점 2가지
        //1. 클래스명이랑 이름이 같다.
        //2. 리턴타입이 없다.

        public ExamStudy3() {
            init();
            cardMaking();
        }

        private void init() {
            String[] patters = new String[] { "스페이드", "하트", "클럽", "다이아몬드" };
            cards = new ArrayList();
            for(int i=0; i<patters.length; i++) {
                for(int z=1; z<=13; z++) {
                    String denomination = null;
                    switch(z) {
                        case 1:
                            denomination = "A"; break;
                        case 11:
                            denomination = "J"; break;
                        case 12:
                            denomination = "Q"; break;
                        case 13:
                            denomination = "K"; break;
                        default:
                            denomination = String.valueOf(z); //2~10은 정수를 문자열로 변경
                            //denomination = z + "";
                    }
                    ExamStudy2 c = new ExamStudy2(patters[i], denomination);
                    cards.add(c);
                    //cards.add(new Card(patters[i], denomination));
                } //for
            } //for
        }
        ExamStudy2 card[] = new ExamStudy2[52];
        private void cardMaking(){
            String pattern[]= {"spade","diamond","heart","clover"};
            int count=0;
            for(int i = 0;i<pattern.length;i++){
                for(int k = 1;k<=CARDNUM;k++){
                    String cngName;
                    switch (k){
                        case 1 :
                            cngName = "A"; break;
                        case 11 :
                            cngName = "J"; break;
                        case 12 :
                            cngName = "Q"; break;
                        case 13 :
                            cngName = "K"; break;
                        default:
                            cngName = String.valueOf(k);
                    }
                    card[count] = new ExamStudy2(pattern[i],cngName);
                    count++;
                }
            }
    }
    public void showMeWhatYouGot(){
            for(int i = 0;i<card.length;i++){
                System.out.println(card[i]);
            }
    }
        //항상 랜덤한 카드를 준다.
        public ExamStudy2 getCard() {
            //if 콜렉션을 배열로 했다면 먼저 섞고, 순차적으로 카드를 줬을꺼다.
            //if 콜렉션을 ArrayList로 했다면 랜덤하게 카드를 준다.
            int rIdx = (int)(Math.random() * cards.size());
            return cards.remove(rIdx);

            //return cards.remove((int)(Math.random() * cards.size()));
        }

        public void showAllCards() {
        /*
        for(int i=0; i<cards.size(); i++) {
            Card c = cards.get(i);
            System.out.println(c);
        }
        */
            //ForEach
            for(ExamStudy2 c : cards) {
                System.out.println(c);
            }
        }

}
