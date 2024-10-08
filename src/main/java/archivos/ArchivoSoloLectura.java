package archivos;

class ArchivoSoloLectura extends Archivo {

    public ArchivoSoloLectura(String contenido) {
        super(contenido);
    }

    @Override
    public void guardar() {
        System.out.println("Este archivo es de solo lectura y no puede ser guardado.");
    }
}
