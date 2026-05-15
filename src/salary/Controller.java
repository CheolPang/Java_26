package salary;

import java.util.Scanner;

public class Controller {
    EmpVO[] emps = new EmpVO[5];
    int n = 0;

    void input() {
        if (n < 5) {
            Scanner sc = new Scanner(System.in);
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("연봉 : ");
            int salary = sc.nextInt();
            System.out.print("부서 : ");
            String department = sc.next();
            emps[n] = new EmpVO(name, salary, department);
            n++;
        } else {
            System.out.println("직원은 5명까지 입니다.");
        }
    }

    void output() {
        for (int i = 0; i < n; i++) {
            System.out.println(emps[i].toString());
        }
    }
}