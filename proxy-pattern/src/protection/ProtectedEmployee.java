package protection;

// 인사정보가 보호된 구성원(인사 정보 열람 권한 없으면 예외 발생)
class ProtectedEmployee implements Employee {
    private Employee employee;

    public ProtectedEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getInformation(Employee viewer) {
        // 본인 인사정보 조회
        if (this.employee.getGrade() == viewer.getGrade() && this.employee.getName().equals(viewer.getName())) {
            return this.employee.getInformation(viewer);
        }

        switch (viewer.getGrade()) {
            case VicePresident:
                // 부사장은 조직장, 조직원들을 볼 수 있다.
                if (this.employee.getGrade() == GRADE.Manager || this.employee.getGrade() == GRADE.Staff) {
                    return this.employee.getInformation(viewer);
                }
            case Manager:
                if (this.employee.getGrade() == GRADE.Staff) { // 조직장은 조직원들을 볼 수 있다.
                    return this.employee.getInformation(viewer);
                }
            case Staff:
            default:
                throw new NotAuthorizedException(); // 조직원들은 다른 사람의 인사정보를 볼 수 없다.
        }
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public GRADE getGrade() {
        return employee.getGrade();
    }
}

class NotAuthorizedException extends RuntimeException {
    private static final long serialVersionUID = -1714144282967712658L;
}