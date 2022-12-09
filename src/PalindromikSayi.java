import java.util.ArrayList;
import java.util.List;

public class PalindromikSayi {

    static int reverseNumber(int temp) {    //Sayının tersini bulmak adına yazıldı

        int lastNum, reNum = 0;

        while (temp != 0) {

            lastNum = temp % 10;

            reNum = (reNum * 10) + lastNum;

            temp /= 10;

        }
        return reNum;
    }

    public static void main(String[] args) {


        int newNum, num, flag = 0, bigFlag = 0;

        List<Integer> palindromikList = new ArrayList<>();
        List<Integer> lastList = new ArrayList<>();

        for (int i = 10; i < 100; i++) {

            num = i;


            while (num != reverseNumber(num)) {//37+73 //110=?011//121=?121

                newNum = num;//37//110
                num += reverseNumber(num);//37+73=110//110+11=121

                flag++;//+1+1


                palindromikList.add(newNum);//47
                palindromikList.add(reverseNumber(newNum));//74
                palindromikList.add(reverseNumber(num));//121


            }
            if (flag > bigFlag) {
                //lastList.clear();****** sadece uzun zinciri yazdırmak adına, Eski listeyi temizlemek için kullanıyorum ama hepsini siliyor*******

                bigFlag = flag;//1
                lastList = palindromikList;
            }

        }
        System.out.println(lastList);
    }
}
