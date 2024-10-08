package archivos;

public class Main {
    public static void main(String[] args)  {
        Archivo miArchivo = obtenerArchivoDelUsuario();
        GuardadorArchivo guardadorArchivo = new GuardadorArchivo();
        guardadorArchivo.guardar(miArchivo);
    }

    private static Archivo obtenerArchivoDelUsuario() {
        return new ArchivoSoloLectura("Contenido del archivo de solo lectura.");
    }

}