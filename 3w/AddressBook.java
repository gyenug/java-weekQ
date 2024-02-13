package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    List <Contact> contacts = new ArrayList<>();

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 NULL.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact.getName() + ", " + contact.getPhoneNumber());
            }
        }
    }
    public void searchContact(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 이름을 입력: ");
        String name = sc.next();
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact.getName() + ", " + contact.getPhoneNumber());
            }
        }

        System.out.println("찾으시는 연락처가 없습니다.");
    }
}