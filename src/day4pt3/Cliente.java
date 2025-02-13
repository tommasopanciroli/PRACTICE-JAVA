package day4pt3;

import java.time.LocalDate;

public class Cliente {
    private int codiceCliente;
    private String nomeCognome;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente(int code, String name, String email, LocalDate date) {
        this.codiceCliente = code;
        this.nomeCognome = name;
        this.email = email;
        this.dataIscrizione = date;
    }

    public int getCodiceCliente() {
        return this.codiceCliente;
    }

    public String getNomeCognome() {
        return this.nomeCognome;
    }

    public String getEmail() {
        return this.email;
    }

    public LocalDate getDataIscrizione() {
        return this.dataIscrizione;
    }

    public String toString() {
        return "Cliente{" +
                "codiceCliente=" + codiceCliente +
                ", nomeCognome='" + nomeCognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }
}
