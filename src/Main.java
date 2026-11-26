void main() {
    System.out.println("=== PRUEBAS SW-A1: TAREAS ===");
    Tarea[] tArray = new Tarea[6];
    tArray[0] = new Tarea("T01", "Diseñar Base de Datos", 12.5, true);
    tArray[1] = new Tarea("T02", "Configurar Servidor", 8.0, true);
    tArray[2] = new Tarea("T03", "Desarrollar API Login", 20.0, false);
    tArray[3] = new Tarea("T04", "Desarrolar Diseño", 11.5, false);
    tArray[4] = new Tarea("T05", "Pruebas Unitarias", 10.0, true);
    tArray[5] = new Tarea("T06", "Pruebas API Login", 15.0, false);

    AnalizadorTareas anaTareas = new AnalizadorTareas(tArray);
    System.out.println("Tareas completadas: " + anaTareas.contarCompletadas());
    System.out.println("Horas totales: " + anaTareas.calcularHorasTotales());
    Tarea encontrada = anaTareas.buscarPorCodigo("T03");
    if (encontrada != null) {
        System.out.println("Búsqueda exitosa: " + encontrada.mostrarInformacion());
    }
    Tarea mayorDuracion = anaTareas.obtenerTareaMayorDuracion();
    if (mayorDuracion != null) {
        System.out.println("Tarea con mayor duración: " + mayorDuracion.mostrarInformacion());
    }
}