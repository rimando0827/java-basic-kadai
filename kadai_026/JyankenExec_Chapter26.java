package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// ルールの説明を表示
		System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーは rockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        
        // Jyankenクラスのインスタンスを生成する
        Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
        
        // JyankenクラスのplayGameメソッドの実行
        jyanken.playGame();
	}

}
