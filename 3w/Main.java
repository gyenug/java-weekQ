package week3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();
        AddressBook addressBook = new AddressBook();

         while (true) {
            System.out.println("1. 비즈니스 연락처 추가하세요");
             System.out.println("2. 개인 연락처 추가합니까?");
            System.out.println("3. 연락처 출력 실행");
             System.out.println("4. 연락처 검색 살행");
             System.out.println("5. 나중에 또 봐요");
            System.out.print("메뉴 중 고르세요: ");

            String num = sc.next();

            if (num.equals("1")) {
                 System.out.print("이름은?: ");
                String name = sc.next();
                 System.out.print("전화번호는?: ");
                String phoneNumber = sc.next();
                 System.out.print("회사이름 기입: ");
                String company = sc.next();
                BusinessContact businessContact = new BusinessContact(name, phoneNumber, company);
                 addressBook.contacts.add(businessContact);
            } else if (num.equals("2")) {
                 System.out.print("이름은?: ");
                String name = sc.next();
                 System.out.print("전화번호 기입: ");
                String phoneNumber = sc.next();
                 System.out.print("어떤 관계인지 기입하세요: ");
                String company = sc.next();
                PersonalContact personalContact = new PersonalContact(name, phoneNumber, relationship);
                 addressBook.contacts.add(personalContact);
            } else if (num.equals("3")) {
                 addressBook.displayContacts();
             } else if (num.equals("4")) {

              } else if (num.equals("5")) {

               } else {
                  System.out.println("오류");
                  System.out.println("다시 시도해 보새요.");
            }

        }
    }
}