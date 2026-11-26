public class AnalizadorTareas {
    private Tarea[] tareas;

    public AnalizadorTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    public int contarCompletadas() {
        int c = 0;
        for (Tarea t : tareas) {
            if (t != null && t.isCompletada()) c++;
        }
        return c;
    }

    public double calcularHorasTotales() {
        double total = 0;
        for (Tarea t : tareas) {
            if (t != null) total += t.getHorasEstimadas();
        }
        return total;
    }

    public Tarea buscarPorCodigo(String codigo) {
        for (Tarea t : tareas) {
            if (t != null && t.getCodigo().equals(codigo)) return t;
        }
        return null;
    }

    public Tarea obtenerTareaMayorDuracion() {
        Tarea mayor = null;
        for (Tarea t : tareas) {
            if (t != null && (mayor == null || t.getHorasEstimadas() > mayor.getHorasEstimadas())) {
                mayor = t;
            }
        }
        return mayor;
    }
}
