package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserService {

    private static final List<UserDTO> userList = new ArrayList<>();

    public void signUpUsers() {
        Iterator<UserDTO> uIter = userList.iterator();

        System.out.println(">> 유저 정보를 입력해주세요~~");
        Scanner sc = new Scanner(System.in);
        UserDTO user = new UserDTO();

        System.out.print(">> 아이디 입력 : ");
        user.setId(sc.nextLine());

        System.out.print(">> 비밀번호 입력 : ");
        user.setPwd(sc.nextLine());

        System.out.print(">> 나이 입력 : ");
        user.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print(">> 이름입력 : ");
        user.setName(sc.nextLine());

        System.out.print(">> 보유캐쉬입력(정수입력바람) : ");
        user.setCash(sc.nextInt());
        sc.nextLine();

        System.out.print(">> 로그인 여부입력(true or false) : ");
        user.setLogIn(sc.nextBoolean());
        sc.nextLine();

        userList.add(user);
        System.out.println(">> 유저 등록 완료!!");
    }

    public void showAllUsers() {
        Iterator<UserDTO> uIter = userList.iterator();
        System.out.println(">> 유저 전체를 조회합니다~");
        if (userList.isEmpty()) {
            System.out.println(">> 조회할 유저가 없습니다...");
            return;
        }

        while(uIter.hasNext()) {
            System.out.println(uIter.next());
        }
    }

    public void updateUsers() {
        Iterator<UserDTO> uIter = userList.iterator();
        if (userList.isEmpty()) {
            System.out.println(">> 수정할 유저가 없습니다...");
            return;
        }
        System.out.println(">> 유저 정보를 수정합니다~");
        System.out.print(">> 수정할 유저 아이디를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        String modifiedId = sc.nextLine();

        while(uIter.hasNext()) {
            UserDTO currUser = uIter.next();
            if (currUser.getId().equals(modifiedId)) {
                System.out.print(">> 변경할 이름을 입력하세요 : ");
                currUser.setName(sc.nextLine());

                System.out.print(">> 변경할 비밀번호를 입력하세요 : ");
                currUser.setPwd(sc.nextLine());

                System.out.print(">> 변경할 나이를 입력하세요 : ");
                currUser.setAge(sc.nextInt());
                sc.nextLine();

                System.out.print(">> 로그인 여부를 입력하세요(true or false) : ");
                currUser.setLogIn(sc.nextBoolean());
                sc.nextLine();

                System.out.println(">> 유저 정보 업데이트 완료!");
                return;
            }
        }
        System.out.println(">> 해당 유저가 존재하지 않습니다...");
    }

    public void deleteUsers() {
        Iterator<UserDTO> uIter = userList.iterator();
        if (userList.isEmpty()) {
            System.out.println(">> 삭제할 유저가 없습니다...");
            return;
        }
        System.out.println(">> 유저 정보를 삭제합니다..");
        System.out.print(">> 삭제할 유저 아이디를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        String removedId = sc.nextLine();

        while(uIter.hasNext()) {
            UserDTO currUser = uIter.next();
            if (currUser.getId().equals(removedId)) {
                userList.remove(currUser);
                System.out.println(">> 유저 정보 삭제 완료");
                return;
            }
        }
        System.out.println(">> 해당 유저가 존재하지 않습니다1...");
    }
}
