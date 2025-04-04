package interfaz4;

interface  ReglasComunes {
    
    default void ReglasGenerales(){
        System.out.println("--- Reglas Generales ---");
        System.out.println("Juego limpio y respeto – Todos los jugadores deben respetar las reglas, a los árbitros y a sus oponentes. El espíritu deportivo es fundamental.\n" + //
                        "\n" + //
                        "Uso adecuado del equipamiento – Se debe usar el equipo adecuado según el deporte (balón, protección, uniforme, etc.) para garantizar la seguridad y el buen desarrollo del juego.\n" + //
                        "\n" + //
                        "No hacer trampa – Está prohibido cualquier intento de engañar, ya sea dopaje, simulaciones o trampas para obtener ventaja injusta.\n" + //
                        "\n" + //
                        "Aceptar las decisiones arbitrales – Aunque se pueda apelar en algunos casos, la decisión del árbitro o juez es la que determina el curso del juego.");
    }
}
