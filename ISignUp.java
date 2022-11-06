import java.util.ArrayList;

public interface ISignUp {
    // 鎵撳嵃杈撳嚭缁撴灉
    public void print();
    // 妫�鏌ユ槸鍚︽湁 stuType瀵瑰簲鐨勭彮绾у悕棰�
    // 濡傛灉娌℃湁鍓╀綑鍚嶉锛岃杩斿洖 false 锛屽惁鍒欏鐢熷皢鎶ュ悕杩涘叆璇ョ彮绾у苟杩斿洖 true
    public boolean addStudent (int stuType);
    // 瑙ｆ瀽鍛戒护琛岃緭鍏ョ殑鍙傛暟锛堟牸寮忥級锛屽鏂囨。鎻忚堪
    public static IParams parse(String next) throws Exception{

        return null;
    };

}
