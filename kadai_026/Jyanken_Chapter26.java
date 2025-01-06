package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
        
        // Scannerクラスのオブジェクトを生成する
        Scanner scanner = new Scanner(System.in);
        
        String input;

        while(true) {
            System.out.println("じゃんけんの手を入力してください（r: グー, s: チョキ, p: パー）:");
            input = scanner.nextLine();

            // 入力内容を判定して処理を分岐
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                break;  // 正しい入力がされたらループを抜ける
            } else {
                System.out.println("無効な入力です。もう一度、正しいじゃんけんの手を入力してください。");
            }
        } 

        return input;
    }
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] jankenArray = new String[] {"r", "s", "p"};
		String random = jankenArray[(int)Math.floor(Math.random() * 3)];
		return random;
	}
	
	// じゃんけんを行うメソッド
    public void playGame() {
        // HashMapの宣言,要素の追加
    	HashMap<String,String> hands = new HashMap<String,String>();

        hands.put("r", "グー");
        hands.put("s", "チョキ");
        hands.put("p", "パー");
        
        // 自分と対戦相手のじゃんけんの手を取得
        String myChoice = getMyChoice();
        String yourHand = getRandom();
        
        // お互いに出した手を表示
        System.out.println("自分の手は" + hands.get(myChoice) + ",対戦相手の手は" + hands.get(yourHand));
        
        // 自分と対戦相手の手を比較して」結果を出力
        if (myChoice.equals(yourHand)) {
        	System.out.println("あいこです");
        } else if ((myChoice.equals("r") && yourHand.equals("s")) ||
        		   (myChoice.equals("s") && yourHand.equals("p")) ||
        		   (myChoice.equals("p") && yourHand.equals("r"))) {
        	System.out.println("自分の勝ちです");
        } else {
        	System.out.println("自分の負けです");
        	
        }
    }
}