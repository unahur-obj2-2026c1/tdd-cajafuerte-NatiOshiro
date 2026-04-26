package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.tdd.CajaFuertes.CajaFuerte;

public class CajaFuerteTest {
    
    @Test // esto me declara que va ser un test
    public void queLaCajaFuerteEsteAbiertaAlCrearse(){
        CajaFuerte caja = new CajaFuerte();// preparacion
        assertTrue(caja.estaAbierta());// lo que queremos recibir en forma VERDE
    }

    @Test
    public void queSePuedeCerrarLaCajaFuerteConUnCodigo(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
    }
        @Test
    public void queSePuedeAbrirLaCajaFuerteConElCodigoCorrecto(){
        CajaFuerte caja = new CajaFuerte();// se crea abierta
        caja.cerrar(1234); // se cierra
        caja.abrir(1234);// se abre con el codigo exitoso
        assertTrue(caja.estaAbierta());
    }

        @Test
    public void queNoPuedeAbrirseLaCajaFuerteConUnCodigoIncorrecto(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1111);
        assertFalse(caja.estaAbierta());
    }
    @Test
    public void queNoPuedaCerrarLaCajaFuerteEstandoCerrado(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.cerrar(4321);// cambiar el codigo
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }
}
