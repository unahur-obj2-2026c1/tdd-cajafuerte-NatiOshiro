package ar.edu.unahur.obj2.tdd;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testMain() {

    }
}/*

TDD : Rojo - Verde->Refactor (Azul)


Historia de Usuario
// Como huesped del hotel , 
// quiero utilizar una caja fuerte personal en mi habitacion,
// Para guardar objetos de valor de forma segura dusrante mi estadia 

Criterios de aceptacion (G-W-T -> Dado - Cuando - Entonces)
¿cuando sé que termine? Cuando termine todas los criterios de aceptacion
1 Caja abierta al inicio
    Dado que la caja fuerte a sido recien creado 
    Entonces debe encontrarse en estado abierto.

2 Cierre de caja fuerte con codigo.
    Dado que la caja fuerte esta abierta .
    Cuando se le asigna un codigo al cerrarla
    Entonces debe quedar en estado cerrado.

3 Apertura con codigo correcto
    Dado que la caja fuerte fue cerrada con un codigo
    Cuando se intenta abrir con ese mismo codigo
    Entonces debe abrirse correctamente

4 No se abre con codigo incorrecto
    Dado que la caja fuerte fue cerrada con un codigo
    Cuando se intenta abrir con un codigo diferente
    Entonces no debe abrirse 

5 La caja fuerte se bloquea tras 3 intentos fallidos
    Dado que la caja fuerte a sido  cerrada con un codigo
    Cuando se intenta abrir con un codigo incorrecto 3 veces 
    Entonces la caja fuerte debe quedar bloqueada

6 Ojo con fallos eventuales
*/