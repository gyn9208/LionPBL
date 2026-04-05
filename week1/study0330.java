import java.util.Scanner;

public class study0330 {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

      String[] names = new String[ScanNum()];

      for (int i = 0; i < names.length; i++) {
        System.out.print((i + 1) + "번째 아기사자: ");
        names[i] = scanner.nextLine(); //입력받은 문자열(이름) names 배열에 저장
      }
      System.out.println("\n-저희는 lion-babies입니다-\n");
      for(int i=0; i < names.length; i++){
        System.out.println("저는 아기사자 " + names[i] + "입니다 ㅎㅎ");
      }
  }

  public static int ScanNum(){
    while(true) {
      int num = 0;
      System.out.print("저장할 아기사자 수를 5 이상 입력해주세요");
      num = Integer.parseInt(scanner.nextLine()); //사람 몇 명인지 num에 입력받아 저장
      if (num < 5) {
        System.out.println("[오류] 5 이상 입력해주세요");
      } else{
        return num;
      }
    }
  }
}
