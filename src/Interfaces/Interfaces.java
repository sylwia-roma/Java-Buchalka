package Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();


        timsPhone = new MobilePhone(23456);
        timsPhone.callPhone(23456);
        timsPhone.answer();

    }
}


