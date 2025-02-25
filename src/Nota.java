public class Nota {
    private double nota1;
    private double nota2;
    private int faltas;

    public int getFaltas(){
        return faltas;
    }

    public void setFaltas(int faltas) {
        if(faltas>40 || faltas<0){
            System.out.println("Número de faltas inválido");
            return;
        }
        this.faltas = faltas;
    }

    public void setNota1(int nota){
        if(nota<0 || nota>10){
            System.out.println("Nota inválida");
            return;
        }
        nota1 = nota;
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota2(int nota){
        if(nota<0 || nota>10){
            System.out.println("Nota inválida");
            return;
        }
        nota2 = nota;
    }

    public double getNota2(){
        return nota2;
    }

    void resultado(){
        double media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.println("Aprovado");
        }else if (media >= 6){
            System.out.println("Reprovado");
        }
    }
}
