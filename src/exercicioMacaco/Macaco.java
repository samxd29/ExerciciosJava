package exercicioMacaco;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;

    List<String> bucho = new ArrayList<>();


    public Macaco(){}

    public Macaco(String nome, List<String> bucho) {
        this.nome = nome;
        this.bucho = bucho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getBucho() {
        return bucho;
    }

    public void setBucho(List<String> bucho) {
        this.bucho = bucho;
    }

    public void comer(String comida){
        if (bucho.size() < 3){
            bucho.add(comida);
        }else {
            System.out.println("O bucho está cheio!");
        }
    }

    public void verBucho(){
        for (int i = 0; i < bucho.size(); i++){
            System.out.println(bucho.get(i));
        }
    }

    public void digerir(){
        if (bucho.size() > 0){
            bucho.clear();
            System.out.println("Bucho esvaziado");
        } else {
            System.out.println("Bucho vazio!");
        }
    }
}
