package protection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 직원별 개인 객체 생성
        Employee CTO = new NormalEmployee("Dragon Jung", GRADE.VicePresident);
        Employee CFO = new NormalEmployee("Money Lee", GRADE.VicePresident);
        Employee devManager = new NormalEmployee("Cats Chang", GRADE.Manager);
        Employee financeManager = new NormalEmployee("Dell Choi", GRADE.Manager);
        Employee devStaff = new NormalEmployee("Dark Kim", GRADE.Staff);
        Employee financeStaff = new NormalEmployee("Pal Yoo", GRADE.Staff);

        // 직원들을 리스트로 가공.
        List<Employee> employees = Arrays.asList(CTO, CFO, devManager, financeManager, devStaff, financeStaff);

        print("시나리오1. Staff(Dark Kim)가 회사 인원 인사 정보 조회");

        // 자신의 직급에 관계 없이 모든 직급의 인사 정보를 열람 (문제 상황)
        printAllInformationInCompany(devStaff, employees);

        print("보호 프록시 서비스로 교체.");
        // employees 리스트의 NomalEmplyee 객체를 ProtectedEmployee 객체로 변환하여 protectedEmployees 리스트에 추가
        List<Employee> protectedEmployees = employees.stream().map(ProtectedEmployee::new).collect(Collectors.toList());

        print("시나리오2. Staff(Dark Kim)가 회사 인원 인사 정보 조회");
        printAllInformationInCompany(devStaff, protectedEmployees);

        print("시나리오3. Manger(Cats Chang)가 회사 인원 인사 정보 조회");
        printAllInformationInCompany(devManager, protectedEmployees);

        print("시나리오4. VicePresident(Dragon Jung)가 회사 인원 인사 정보 조회");
        printAllInformationInCompany(CTO, protectedEmployees);
    }

    public static void printAllInformationInCompany(Employee viewer, List<Employee> employees) {
        employees.stream()
                .map(employee -> {
                    try {
                        return employee.getInformation(viewer);
                    } catch (NotAuthorizedException e) {
                        return "Not authorized.";
                    }
                })
                .forEach(System.out::println);
    }

    public static void print(String str){
        System.out.println("================================================================");
        System.out.println(str);
        System.out.println("================================================================");
    }
}
