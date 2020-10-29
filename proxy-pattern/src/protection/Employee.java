package protection;

public interface Employee {
    // 구성원의 이름
    String getName();
    // 구성원의 직책
    GRADE getGrade();
    // 구성원의 인사정보(매개변수는 조회자)
    String getInformation(Employee viewer);
}
