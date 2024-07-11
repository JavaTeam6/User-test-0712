package test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

//        UserDTO user = new UserDTO();
        UserService us = new UserService();


        while (true) {
            System.out.println("---------------------------------");
            System.out.println(" 유저 관리 프로그램입니다~~~");
            System.out.println("1. 유저 등록  2. 유저 조회  3. 유저 수정" +
                    " 4. 유저 삭제  9. 프로그램 종료");
            System.out.println("---------------------------------");
            System.out.print("번호를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();
            switch (inputNumber) {
                case 1:
                    us.signUpUsers();
                    break;
                case 2:
                    us.showAllUsers();
                    break;
                case 3:
                    us.updateUsers();
                    break;
                case 4:
                    us.deleteUsers();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다...");
                    System.out.println("---------------------------------");
                    return;
                default:
                    System.out.println("잘못 누르셨습니다. 다시 입력하세요.");
                    System.out.println("---------------------------------");
                    break;
            }
        }

    }
}
