
public class Auto {


    private String marca;
    private String modello;
    private String targa;
    private int cilindrata;

    public Auto(String marca, String modello, String targa, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }


    public String getMarca(){
        return marca;

    }
    public String getModello(){
        return modello;
    }

    public String getTarga() {
        return targa;
    }
    public int getCilindrata(){
        return cilindrata;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa=" + targa +'\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }
}



