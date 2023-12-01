
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

    public String setMarca() {
        return marca;
    }

    public String setModello() {
        return modello;
    }

    public String setTarga() {
        return targa;
    }
    public int setCilindrata(){
        return cilindrata;
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



