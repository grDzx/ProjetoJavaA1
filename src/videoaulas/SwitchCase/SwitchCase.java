package videoaulas.SwitchCase;

public class SwitchCase {

    public static void main(String[] args) {

        int diaDaSemana =4;
        String nomeDoDia;

        switch (diaDaSemana) {
            case 1: nomeDoDia="Domingo";break;
            case 2: nomeDoDia="Segunda";break;
            case 3: nomeDoDia="Terça";break;
            case 4: nomeDoDia="Quarta";break;
            case 5: nomeDoDia="Quinta";break;
            case 6 : nomeDoDia="Sexta";break;
            case 7: nomeDoDia="Sabado";break;
            default: nomeDoDia="invalido";break;
        }
        System.out.println(nomeDoDia);
    }
}
