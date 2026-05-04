public class Staff extends Role {
  String position;
  String name;
  String major;
  int generation;
  String part;

  Staff(String name, String major, int generation, String part, String position){
    super(name, major, generation, part);
    this.position = position;
  }

  public String getPosition(){
    return this.position;
  }
  @Override
  SubmissionPolicy getPolicy(){
    return new StaffSubmissionPolicy();
  }

  @Override
  void SubmissionStatus() {
    if(getPolicy().canHomework()==false){
      System.out.println("📝 과제 제출 가능 여부: ❌");
    }
  }

  @Override
  String getInfo() {
    return getBasicInfo() + "\n⭐ 직책(대표/부대표/파트장/멘토): " + this.position;
  }
}
