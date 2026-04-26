package ar.edu.unahur.obj2.tdd.CajaFuertes;

public class CajaFuerte {
private Boolean abierta = true;
private Integer codigo;

    public CajaFuerte(){// constructor, que no es necesario siempre 
        this.abierta = true;// en este caso no es necesario este cCONSTRUCTOR 
    }

    public Boolean estaAbierta(){
        return abierta; // todo constante evoluciona a una variable
    }

    public void cerrar(Integer codigo){//
        if(this.abierta.equals(true)){
            this.codigo = codigo;
            this.abierta = false;// Cambio de estado de abierto a cerrado
        }
    }

    public void abrir(Integer codigo){
        if(this.codigo.equals(codigo)){
            this.abierta = true;
        }
    }
}
