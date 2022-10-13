package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;

    private Date checkin;

    private Date checkout;



    public Reservation(){

    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }


    public Date getCheckout() {
        return checkout;
    }



    /*Método para calcular a duração do tempo entre o checkin e o checkout,
     primeiro é criada uma variável para pegar o tempo do checkin e checkout em milisegundos com um getTime
     depois é feita uma conversão desses milisegundos para dias nessa caso, mas em outros casos pode ser feito para outros formatos */
    public long duration(){
        long diferenca = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;

    }

    @Override
    public String toString() {
        return  "Room " + roomNumber +
                ", checkin  " + sdf.format(checkin) +
                ", checkout " + sdf.format(checkout) +
                ", " + duration() +
                " nights";
    }
}
