package archivos;

public class GuardadorArchivo {

    public void guardar(Archivo archivo) {
        if(archivo instanceof ArchivoSoloLectura){
            System.out.println("Este archivo es de solo lectura y no puede ser guardado." + archivo.contenido);
        }else{
            System.out.println("Archivo guardado con contenido: " + archivo.contenido);
        }
    }
}
