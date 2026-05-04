import java.util.*;

public class Main {
  static List<Role> roleList = new ArrayList<>();
  static Map<String, List<Role>> nameRole = new HashMap<>();
  static List<String> names = new ArrayList<>();

  public static void main(String[] args) {


    while (true) {
      String name, major, part, position;
      int generation, number;
      int choice;


      Scanner sc = new Scanner(System.in);
      System.out.println("=====멋사 멤버 관리 시스템=====");
      System.out.println("1. 멤버 등록");
      System.out.println("2. 전체 멤버 조회");
      System.out.println("3. 이름으로 검색");
      System.out.println("4. 파트별 조회");
      System.out.println("5. 종료");
      System.out.print("선택: ");
      choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1: {
          System.out.print("역할 선택(1: 아기사자, 2: 운영진): ");
          int what = sc.nextInt();
          sc.nextLine();

          if (what == 1) {
            System.out.print("이름: ");
            name = sc.nextLine();
            for (Role role : roleList) {
              if (role.equals(name)) {
                System.out.println("❌등록 실패: 이미 존재하는 이름입니다.");
              }
            }
            System.out.print("전공: ");
            major = sc.nextLine();
            System.out.print("기수: ");
            generation = sc.nextInt();
            sc.nextLine();
            System.out.print("파트: ");
            part = sc.nextLine();
            System.out.print("학번: ");
            number = sc.nextInt();
            sc.nextLine();
            Lion lion = new Lion(name, major, generation, part, number);
            roleList.add(lion);
            nameRole.put(part, roleList);
          } else if (what == 2) {
            System.out.print("이름: ");
            name = sc.nextLine();
            for (Role role : roleList) {
              if (role.equals(name)) {
                System.out.println("❌등록 실패: 이미 존재하는 이름입니다.");
              }
            }
            System.out.print("전공: ");
            major = sc.nextLine();
            System.out.print("기수: ");
            generation = sc.nextInt();
            sc.nextLine();
            System.out.print("파트: ");
            part = sc.nextLine();
            System.out.print("직책: ");
            position = sc.nextLine();
            Staff staff = new Staff(name, major, generation, part, position);
            roleList.add(staff);
            nameRole.put(part, roleList);
          }
          break;
        }
        case 2: {
          for (Role role : roleList) {
            if (role instanceof Staff) {
              names.add("[운영진]" + role.getName() + " - " + role.getGeneration() + "기");
            } else if (role instanceof Lion) {
              names.add("[아기사자]" + role.getName() + " - " + role.getGeneration() + "기");
            }
          }
          System.out.println("--전체 멤버 목록--");
          for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
          }
          System.out.println("📊 총 " + names.size() + "명");
          names.clear();
          break;
        }
        case 3: {
          System.out.print("검색할 이름: ");
          name = sc.nextLine();
          for (Role role : roleList) {
            if (role.getName().equals(name)) {
              System.out.println("🎯 ===== 검색 결과 =====");

              if (role instanceof Staff) {
                System.out.println("👤 역할: 운영진\n" +
                    "📌 이름: " + role.getName() + " | 🎓 전공: " + role.getMajor() + " | 🔢 기수: " + role.getGeneration() + " | 💻 파트: " + role.getPart() + "\n" +
                    "👔 직책: " + ((Staff) role).getPosition());
                Staff staff = (Staff) role;
                staff.SubmissionStatus();
              } else if (role instanceof Lion) {
                System.out.println("👤 역할: 아기사자\n" +
                    "📌 이름: " + role.getName() + " | 🎓 전공: " + role.getMajor() + " | 🔢 기수: " + role.getGeneration() + " | 💻 파트: " + role.getPart() + "\n" +
                    "🆔 학번: " + ((Lion) role).getNumber());
                Lion lion = (Lion) role;
                lion.SubmissionStatus();
              }
            }
          }
          break;
        }
        case 4: {
          System.out.println("--💻파트별 조회");
          System.out.println("📂등록된 파트: " + nameRole.keySet());
          System.out.print("조회할 파트: ");
          part = sc.nextLine();
          if (nameRole.containsKey(part)) {
            System.out.println("✨[" + part + "] 파트 멤버");
            names.clear();

            for (Role role : nameRole.get(part)) {
              if (role.getPart().equals(part)) {
                if (role instanceof Staff) {
                  names.add("[운영진]" + role.getName() + " - " + role.getGeneration() + "기");
                } else if (role instanceof Lion) {
                  names.add("[아기사자]" + role.getName() + " - " + role.getGeneration() + "기");
                }
              }
            }
            for (int i = 0; i < names.size(); i++)
              System.out.println((i + 1) + ". " + names.get(i));
          }
          break;
        }
        case 5: {
          System.exit(0);
        }
      }
    }
  }
}

