import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String name;
    String major;
    int generation;
    String part;
    int number;
    String position;

    Scanner scanner = new Scanner(System.in);

    System.out.println("-------------🦁 아기사자 정보 입력--------------");
    System.out.print("🥷 이름: ");
    name = scanner.nextLine();
    System.out.print("🎓 전공: ");
    major = scanner.nextLine();
    System.out.print("📌 기수: ");
    generation = scanner.nextInt();
    scanner.nextLine();
    System.out.print("🖥️ 파트(백엔드/프론트엔드/기획/디자인): ");
    part = scanner.nextLine();
    System.out.print("🆔 학번: ");
    number = scanner.nextInt();
    scanner.nextLine();

    Lion lion = new Lion(name, major, generation, part, number);
    System.out.println("-------------🙍 운영진 정보 입력----------------");
    System.out.print("🥷 이름: ");
    name = scanner.nextLine();
    System.out.print("🎓 전공: ");
    major = scanner.nextLine();
    System.out.print("📌 기수: ");
    generation = scanner.nextInt();
    scanner.nextLine();
    System.out.print("🖥️ 파트(백엔드/프론트엔드/기획/디자인): ");
    part = scanner.nextLine();
    System.out.print("⭐ 직책(대표/부대표/파트장/멘토): ");
    position = scanner.nextLine();

    Staff staff = new Staff(name, major,generation,part,position);

    System.out.println("===============📋결과 출력=================");
    System.out.println(lion.getInfo());
    lion.SubmissionStatus();
    System.out.println("----------------------------------------");
    System.out.println(staff.getInfo());
    staff.SubmissionStatus();
    System.out.println("========================================");
  }
}
