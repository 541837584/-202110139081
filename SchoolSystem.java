import java.util.ArrayList;
import java.util.Scanner;
public class SchoolSystem implements ISignUp,IParams {
    int bigg = 0, me = 0, sma = 0,h=0;
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Boolean> boo = new ArrayList<Boolean>();
 
        public int getBig() {
            return bigg;
        }
       
        public int getMedium() {
            return me;
        }
        
        public int getSmall() {
            return sma;
        }
        
        public ArrayList<Integer> getPlanSignUp() {
            return arr;
        }

    SchoolSystem(Integer big, Integer medium, Integer small) {

        bigg = big;
        me = medium;
        sma = small;
        arr.add(bigg);
        arr.add(me);
        arr.add(sma);
        boo.add(null);
        //System.out.println(arr);
    }
    public void setaa(int d,int z,int x){
        bigg = d;
        me = z;
        sma = x;
            arr.set(0,d);
            arr.set(1,z);
            arr.set(2,x);
        //System.out.println("鐝骇鍓╀綑浜烘暟锛�"+arr);
    }
    public boolean addStudent(int stuType) {

            h=arr.get(stuType-1);//鐝骇鍓╀綑浜烘暟
            if(h>0){
                h=h-1;  //0
                arr.set(stuType-1,h);
                boo.add(true);
                return true;
            }

        else
        boo.add(false);
        return false;
    }

    String[] parse(String input) {
        String x = input.replaceAll("\\s+", "");
        String xx = x.replaceAll("\\[", "");
        String xxx = xx.replaceAll("\\]", "");
        String xxxxx = xxx.replaceAll("\\p{Punct}", " ");
        String xxxxxx=xxxxx.replaceAll(" ","cjx");
        String[] words = xxxxxx.split("cjx");

        return words;
    }
    int[] parseteam(String input){
        String xx = input.replaceAll("\\[", "");
        String xxx = xx.replaceAll("\\]", "");
        String xxxxx = xxx.replaceAll("\\p{Punct}", " ");
        String[] words = xxxxx.split("  ");
        int a[] =new int[words.length];
        for (int i=0;i<words.length;i++){
            a[i] = Integer.parseInt(words[i]);
            bigg=a[0];
            me=a[1];
            sma=a[2];
            //System.out.println(a[i]);
        }
        return a;
    }
    public void print() {

        //System.out.println("鐝骇鏈�缁堜汉鏁帮細"+arr);
        System.out.println(boo);

    }


    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        SchoolSystem schoolSystem =new SchoolSystem(0,0,0);
        String a[]=schoolSystem.parse(s.nextLine());//杈撳叆add鍜屼笅鏁板瓧鐨勬暟閲忓搴�
        int[] x =schoolSystem.parseteam(s.nextLine());
        schoolSystem.setaa(schoolSystem.getBig(),schoolSystem.getMedium(),schoolSystem.getSmall());//鏀�

        int o=3;
        String ss="addStudent";
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(ss))
                o=o+1;
        }

        for(int i=3;i<o;i++){
            schoolSystem.addStudent(x[i]);
        }
        schoolSystem.print();
    }
}
