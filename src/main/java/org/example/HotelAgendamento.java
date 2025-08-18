package org.example;

import java.util.Date;

public class HotelAgendamento {

    String guestName = "Feyre";
    String roomNumber = "201";
    int numberOfNights = 7;
    int dailyRate = 50;

    Date data = new Date();
    boolean isPaid = false;

    public double sum() {
        return (numberOfNights * dailyRate);
    }

    public double discount() {
        if (numberOfNights >= 7) {
            return sum() * 0.85;
        }
        return sum();
    }

    public static void main(String[] args) {
        HotelAgendamento h = new HotelAgendamento();

        double discountValue = h.sum() - h.discount();

        System.out.println("===============Recibo================");
        System.out.println("CheckIn: " + h.data);
        System.out.println("Hóspede:" + h.guestName);
        System.out.println("Quarto: " + h.roomNumber);
        System.out.println("-----------------------");
        System.out.println("Total: R$" + h.sum());
        System.out.println("Desc.:-R$" + discountValue);
        System.out.println("Total: R$" + h.discount());
        System.out.println("-----------------------");
        System.out.println("Pagamento: " + h.isPaid);
    }
}
