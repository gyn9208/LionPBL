abstract class Role {
  private String name, major, part;
  private int generation;

  protected Role(String name, String major, int generation, String part){
    this.name = name;
    this.major = major;
    this.generation = generation;
    this.part = part;
  }
  public String getName(){
    return this.name;
  }
  public String getMajor(){
    return this.major;
  }
  public String getPart(){
    return this.part;
  }
  public int getGeneration(){
    return this.generation;
  }
  abstract SubmissionPolicy getPolicy();

  abstract void SubmissionStatus();

  abstract String getInfo();

  protected String getBasicInfo(){
    return "🥷 이름: "+name+ "| 🎓 전공: "+major+"| 📌 기수: "+generation+"| 🖥️ 파트(백엔드/프론트엔드/기획/디자인): "+part;
  }
}


