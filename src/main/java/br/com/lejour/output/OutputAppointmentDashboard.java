package br.com.lejour.output;

public class OutputAppointmentDashboard {

    private int totalVendor;
    private int quantity;

    public OutputAppointmentDashboard(){}

    public OutputAppointmentDashboard(int totalVendor) {
        this.totalVendor = totalVendor;
    }

    public int getTotalVendor() {
        return totalVendor;
    }

    public int getQuantity() {
        return quantity;
    }
}
