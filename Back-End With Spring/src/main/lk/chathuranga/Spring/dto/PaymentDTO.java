package main.lk.chathuranga.Spring.dto;

public class PaymentDTO {
    private String PayID;
    private Double Value;
    private String date;
    private String time;

    public PaymentDTO() {
    }

    public PaymentDTO(String payID, Double value, String date, String time) {
        PayID = payID;
        Value = value;
        this.date = date;
        this.time = time;
    }

    public String getPayID() {
        return PayID;
    }

    public void setPayID(String payID) {
        PayID = payID;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "PayID='" + PayID + '\'' +
                ", Value=" + Value +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
