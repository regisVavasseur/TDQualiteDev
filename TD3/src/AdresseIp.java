import java.util.Objects;

public class AdresseIp implements Comparable<AdresseIp> {

    private String ip;

    public AdresseIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "AdresseIp{" + "ip='" + ip + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdresseIp adresseIp = (AdresseIp) o;
        return Objects.equals(ip, adresseIp.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip);
    }

    @Override
    public int compareTo(AdresseIp o) {
        String[] ip1 = this.ip.split("\\.");
        String[] ip2 = o.ip.split("\\.");
        long n1 = 0;
        long n2 = 0;
        for (int i = 0; i < 4; i++) {
            n1 += Integer.parseInt(ip1[i]) * Math.pow(1000, 3 - i);
            n2 += Integer.parseInt(ip2[i]) * Math.pow(1000, 3 - i);
        }
        if (n1 > n2) {
            return 1;
        } else if (n1 < n2) {
            return -1;
        } else {
            return 0;
        }
    }
}
