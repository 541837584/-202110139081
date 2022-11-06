import java.util.ArrayList;

public interface IParams {
    // 鑾峰彇澶х彮鍚嶉
    public int getBig();
    // 鑾峰彇涓彮鍚嶉
    public int getMedium();
    // 鑾峰彇灏忕彮鍚嶉
    public int getSmall();
    // 鑾峰彇鍏ュ搴忓垪锛屼緥濡� [1 2 2 3] 琛ㄧず 渚濇鎶ュ悕鍏ュ涓�鍚嶅ぇ鐝鐢燂紝涓彮瀛︾敓锛屼腑鐝鐢燂紝灏忕彮瀛︾敓
    public ArrayList<Integer> getPlanSignUp ();


}
