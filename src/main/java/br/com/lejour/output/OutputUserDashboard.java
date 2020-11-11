package br.com.lejour.output;

public class OutputUserDashboard {
    private Long totalUser;

    public OutputUserDashboard(){}

    public OutputUserDashboard(Long totalUser) {
        this.totalUser = totalUser;
    }

    public Long getTotalUser() {
        return totalUser;
    }
}
