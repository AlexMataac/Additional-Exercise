package Joiner;

import java.util.StringJoiner;

public class JoinerTest {

    public static void main(String[] args) {

        StringJoiner invitee = new StringJoiner(",");
        invitee.add("I").add("want").add("to").add("invite").add("you").add("to").add("my").add("birthday");
//        invitee.add("Alex").add("John").add("Mataac");
//        invitee.add("Lebron").add("James");
//        invitee.add("Kobe").add("Bryant");
//        invitee.add("Anthony").add("Davis");

        StringJoiner invitee2 = new StringJoiner(" "," [ "," ] ");
        invitee2.add("Alex").add("John").add("Mataac");
        invitee2.add("Lebron").add("James");
        invitee2.add("Kobe").add("Bryant");
        invitee2.add("Anthony").add("Davis");

        System.out.println(invitee2);

        StringJoiner merge = invitee.merge(invitee2);
        System.out.println(merge);
    }
}