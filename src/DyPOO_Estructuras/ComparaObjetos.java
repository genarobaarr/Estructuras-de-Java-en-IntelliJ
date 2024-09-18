package DyPOO_Estructuras;

public class ComparaObjetos {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("S190202020","Pedro Perez", 20);
        Alumno a2 = new Alumno("S190202020","Pedro Perez", 20);

        if(a1.equals(a2)){
            System.out.println("a1 y a2 son el mismo alumno");
        }else{
            System.out.println("a1 y a2 difieren en nombre y/o matrícula");
        }
    }
}
