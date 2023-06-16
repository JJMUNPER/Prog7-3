package Org.LosRemedios.Programacion.T7.Actividades.Act3;

public class Act73 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Creo objeto que voy a serializar para escribirlo en un fichero
        SelializableTest ej3 = new SelializableTest();

        // Creo fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\juanj\\Desktop\\Main\\Copia Pen\\2ºDaw - copia\\Programacion\\Tema 7\\Codigo\\Tema7\\src\\Org\\LosRemedios\\Programacion\\T7\\Actividades\\Act2\\Ejercicio3.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Serializar el objeto
        oos.writeObject(ej3);

        // Cierro el flujo para que se escriba en el fichero
        oos.close();

        // Leer el fichero al Objeto
        FileInputStream fis = new FileInputStream("C:\\Users\\juanj\\Desktop\\Main\\Copia Pen\\2ºDaw - copia\\Programacion\\Tema 7\\Codigo\\Tema7\\src\\Org\\LosRemedios\\Programacion\\T7\\Actividades\\Act2\\Ejercicio3.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Deserializar el contenido del fichero (bytes) a un Object
        SelializableTest osSalida = (SelializableTest)ois.readObject();

        System.out.println("Persona 1: " + osSalida.persona1);
        System.out.println("Persona 2: " + osSalida.persona2);
        System.out.println("Persona 3: " + osSalida.persona3);

        ois.close();
    }
}
